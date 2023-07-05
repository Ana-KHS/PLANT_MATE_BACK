package com.sqisoft.plantmate.common;

import java.security.Key;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtTokenProvider implements InitializingBean {

   private static final Logger LOG = LoggerFactory.getLogger(JwtTokenProvider.class);
   private static final String AUTHORITIES_KEY = "auth";
   
   private final String secret;
   private final long tokenValidityInMilliseconds;
   private Key key;

   public JwtTokenProvider(
      @Value("${jwt.secret}") String secret,
      @Value("${jwt.token-validity-in-seconds}") long tokenValidityInSeconds) {
      this.secret = secret;
      this.tokenValidityInMilliseconds = tokenValidityInSeconds * 1000;
   }

   @Override
   public void afterPropertiesSet() {
      byte[] keyBytes = Decoders.BASE64.decode(secret);
      this.key = Keys.hmacShaKeyFor(keyBytes);
   }

   public String createToken(Authentication authentication) {

      String authorities = authentication.getAuthorities().stream()
         .map(GrantedAuthority::getAuthority)
         .collect(Collectors.joining(","));

      long now = (new Date()).getTime();
      Date validity = new Date(now + this.tokenValidityInMilliseconds);

      return Jwts.builder()
         .setSubject(authentication.getName())
         .claim(AUTHORITIES_KEY, authorities)
         .signWith(key, SignatureAlgorithm.HS512)
         .setExpiration(validity)
         .compact();
   }

   public Authentication getAuthentication(String token) {
	   
      Claims claims = Jwts
              .parserBuilder()
              .setSigningKey(key)
              .build()
              .parseClaimsJws(token)
              .getBody();

      String sauth = claims.get(AUTHORITIES_KEY).toString();
      Collection<? extends GrantedAuthority> authorities =
		  sauth.isBlank()? Collections.emptySet(): Arrays.stream(sauth.split(","))
            .map(SimpleGrantedAuthority::new)
            .collect(Collectors.toList());

      User principal = new User(claims.getSubject(), "", authorities);

      return new UsernamePasswordAuthenticationToken(principal, token, authorities);
   }

   public boolean validateToken(String token) {
	   
      try {
         Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
         return true;
      }
      catch (io.jsonwebtoken.security.SecurityException | MalformedJwtException e) {
         LOG.info("잘못된 JWT 서명입니다.");
      }
      catch (ExpiredJwtException e) {
         LOG.info("만료된 JWT 토큰입니다.");
      }
      catch (UnsupportedJwtException e) {
         LOG.info("지원되지 않는 JWT 토큰입니다.");
      }
      catch (IllegalArgumentException e) {
         LOG.info("JWT 토큰이 잘못되었습니다.");
      }

      return false;
   }

//   // JWT 토큰을 쿠키에 추가
//   public void addTokenToCookie(HttpServletResponse response, String token) {
//      Cookie cookie = new Cookie("token", token);
//      cookie.setMaxAge(Math.toIntExact(tokenValidityInMilliseconds)); // 초 단위로 설정
//      cookie.setPath("/");
//      response.addCookie(cookie);
//   }
//
//   // 쿠키에서 JWT 토큰 제거
//   public void removeTokenFromCookie(HttpServletRequest request, HttpServletResponse response) {
//      Cookie[] cookies = request.getCookies();
//      if (cookies != null) {
//         for (Cookie cookie : cookies) {
//            if ("token".equals(cookie.getName())) {
//               cookie.setValue("");
//               cookie.setPath("/");
//               cookie.setMaxAge(0);
//               response.addCookie(cookie);
//               break;
//            }
//         }
//      }
//   }
}