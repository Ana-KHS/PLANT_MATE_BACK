/*
 * 
 */
package com.sqisoft.plantmate.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;

import com.sqisoft.plantmate.common.HeaderUtils;
import com.sqisoft.plantmate.common.JwtTokenProvider;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;

/**
 * @author 
 */
@AllArgsConstructor
public class JwtAuthenticationFilter extends GenericFilterBean {

   private static final Logger LOG = LoggerFactory.getLogger(JwtAuthenticationFilter.class);
   private static final String AUTHORIZATION_HEADER = "Authorization";
   
   private JwtTokenProvider tokenProvider;

   @Override
   public void doFilter(
		   ServletRequest servletRequest,
		   ServletResponse servletResponse,
		   FilterChain filterChain) throws IOException, ServletException {

      HttpServletRequest request = (HttpServletRequest) servletRequest;
      HttpServletResponse response = (HttpServletResponse) servletResponse;
      
      String token0 = JwtTokenProvider.resolveToken(request.getHeader(AUTHORIZATION_HEADER));
      if(!StringUtils.hasText(token0)) {
          filterChain.doFilter(servletRequest, servletResponse);
          return;
      }
      
      if (!tokenProvider.validateToken(token0)) {
          LOG.debug("유효한 JWT 토큰이 없습니다, uri: {}", request.getRequestURI());
          throw new IllegalArgumentException("Invalid Access Token!");
      }
 
      String remoteAddr = HeaderUtils.remoteAddress(request);
      if (!tokenProvider.validateAddress(token0, remoteAddr)) {
          LOG.debug("Address가 변경되었습니다. 새로 로그인해 주세요. [{}]", remoteAddr);
          throw new IllegalStateException("Invalid Remote Address!");
      }

      Authentication authentication = tokenProvider.getAuthentication(token0);
      SecurityContextHolder.getContext().setAuthentication(authentication);
      LOG.debug("Security Context에 '{}' 인증 정보를 저장했습니다, uri: {}",
    		  authentication.getName(), request.getRequestURI());

      String token1 = tokenProvider.createToken(authentication, remoteAddr);
      response.addHeader(AUTHORIZATION_HEADER, JwtTokenProvider.bindToken(token1));

      filterChain.doFilter(servletRequest, servletResponse);
   }
}
