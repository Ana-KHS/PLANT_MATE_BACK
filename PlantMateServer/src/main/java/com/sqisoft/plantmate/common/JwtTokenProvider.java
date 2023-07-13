package com.sqisoft.plantmate.common;

import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
import org.springframework.util.StringUtils;

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
	private static final ZoneId ZONE_ID = ZoneId.systemDefault();
	private static final String AUTHORITIES_KEY = "auth";
	private static final String REMOTE_ADDR_KEY = "addr";
	private static final String BEARER_PREFIX = "Bearer ";

	/**
	 * "Bearer " 접두사 제거
	 * 
	 * @param bearerToken
	 * @return "Bearer " 접두사 제거된 토큰
	 */
	public static String resolveToken(String bearerToken) {

		if (!StringUtils.hasText(bearerToken) || !bearerToken.startsWith(BEARER_PREFIX)) {
			return null;
		}

		return bearerToken.substring(BEARER_PREFIX.length());
	}

	/**
	 * "Bearer " 접두사 추가
	 * 
	 * @param token
	 * @return "Bearer " 접두사 추가된 토큰
	 */
	public static String bindToken(String token) {
		return String.format("%s%s", BEARER_PREFIX, token);
	}

	private final String secret;
	private final long accessTtl; // TTL in seconds
	private Key key;

	public JwtTokenProvider(
			@Value("${jwt.secret}") String secret,
			@Value("${jwt.token-ttl}") long tokenTtl) {
		this.secret = secret;
		this.accessTtl = tokenTtl;
	}

	@Override
	public void afterPropertiesSet() {
		byte[] keyBytes = Decoders.BASE64.decode(secret);
		this.key = Keys.hmacShaKeyFor(keyBytes);
	}

	public String createToken(Authentication authentication, String remoteAddress) {

		String authorities = authentication.getAuthorities().stream()
				.map(GrantedAuthority::getAuthority)
				.collect(Collectors.joining(","));

		LocalDateTime now = LocalDateTime.now(ZONE_ID);
		LocalDateTime expired = now.plusSeconds(accessTtl);

		return Jwts.builder()
				.setSubject(authentication.getName())
				.claim(AUTHORITIES_KEY, authorities)
				.claim(REMOTE_ADDR_KEY, remoteAddress)
				.setIssuedAt(Date.from(now.atZone(ZONE_ID).toInstant()))
				.setExpiration(Date.from(expired.atZone(ZONE_ID).toInstant()))
				.signWith(key, SignatureAlgorithm.HS512)
				.compact();
	}

	public Authentication getAuthentication(String token) {

		Claims claims = Jwts.parserBuilder()
				.setSigningKey(key)
				.build()
				.parseClaimsJws(token)
				.getBody();

		String sauth = claims.get(AUTHORITIES_KEY).toString();
		
		Collection<? extends GrantedAuthority> authorities = 
				sauth.isBlank()? Collections.emptySet()
				: Arrays.stream(sauth.split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());

		User principal = new User(claims.getSubject(), "", authorities);

		return new UsernamePasswordAuthenticationToken(principal, token, authorities);
	}

	public boolean validateToken(String token) {

		if (!StringUtils.hasText(token)) {
			return false;
		}

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

	public boolean validateAddress(String token, String remoteAddress) {

		Claims claims = Jwts.parserBuilder()
				.setSigningKey(key)
				.build()
				.parseClaimsJws(token)
				.getBody();

		String sauth = claims.get(REMOTE_ADDR_KEY).toString();
		
		return sauth!=null && sauth.equals(remoteAddress);
	}
}
