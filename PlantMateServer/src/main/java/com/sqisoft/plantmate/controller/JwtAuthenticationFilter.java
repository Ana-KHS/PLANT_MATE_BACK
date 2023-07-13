/*
 * 
 */
package com.sqisoft.plantmate.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
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
      LOG.debug("JWT 토큰: {}", token0);
      if(!StringUtils.hasText(token0)) {
          filterChain.doFilter(servletRequest, servletResponse);
          return;
      }
      
      if (!tokenProvider.validateToken(token0)) {
          LOG.debug("유효한 JWT 토큰이 없습니다, uri: {}", request.getRequestURI());
          throw new AuthenticationException("Invalid Access Token!") {
			private static final long serialVersionUID = 4602649551268168638L;
          };
      }
 
      String remoteAddr = HeaderUtils.remoteAddress(request);
      if (!tokenProvider.validateAddress(token0, remoteAddr)) {
          LOG.debug("Address가 변경되었습니다. 새로 로그인해 주세요. [{}]", remoteAddr);
          throw new AuthenticationException("Invalid Remote Address!") {
			private static final long serialVersionUID = 3630989993772956824L;
          };
      }

      Authentication authentication = tokenProvider.getAuthentication(token0);
      SecurityContextHolder.getContext().setAuthentication(authentication);
      LOG.debug("Security Context에 '{}' 인증 정보를 저장했습니다, uri: {}",
    		  authentication.getName(), request.getRequestURI());

      String token1 = tokenProvider.createToken(authentication, remoteAddr);
      response.setHeader(AUTHORIZATION_HEADER, JwtTokenProvider.bindToken(token1));
      
      filterChain.doFilter(request, response);
//      HttpServletRequestWrapper wrapper = new HttpServletRequestWrapper(request) {
//
//		@Override
//		public String getHeader(String name) {
//			if(AUTHORIZATION_HEADER.equals(name)) {
//				return JwtTokenProvider.bindToken(token1);
//			}
//			return super.getHeader(name);
//		}
//
//		@Override
//		public Enumeration<String> getHeaders(String name) {
//			if(AUTHORIZATION_HEADER.equals(name)) {
//				return Collections.enumeration(Arrays.asList(JwtTokenProvider.bindToken(token1)));
//			}
//			return super.getHeaders(name);
//		}
//      };
      
//    filterChain.doFilter(wrapper, response);
  }
}
