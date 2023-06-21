package com.sqisoft.plantmate;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.sqisoft.plantmate.common.JwtFilter;
import com.sqisoft.plantmate.common.TokenProvider;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	public static class JwtAuthenticationEntryPoint
		implements AuthenticationEntryPoint {
		
	   @Override
	   public void commence(
			   HttpServletRequest request,
	           HttpServletResponse response,
	           AuthenticationException authException) throws IOException {
	      // 유효한 자격증명을 제공하지 않고 접근하려 할때 401
	      response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
	   }
	}
	
	public class JwtAccessDeniedHandler
		implements AccessDeniedHandler {
		
	   @Override
	   public void handle(
			   HttpServletRequest request,
			   HttpServletResponse response,
			   AccessDeniedException accessDeniedException) throws IOException {
	      //필요한 권한이 없이 접근하려 할때 403
	      response.sendError(HttpServletResponse.SC_FORBIDDEN);
	   }
	}
	
	public static class JwtSecurityConfig
		extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
		
	    private TokenProvider tokenProvider;

	    public JwtSecurityConfig(TokenProvider tokenProvider) {
	        this.tokenProvider = tokenProvider;
	    }

	    @Override
	    public void configure(HttpSecurity http) {
	        http.addFilterBefore(
	            new JwtFilter(tokenProvider),
	            UsernamePasswordAuthenticationFilter.class
	        );
	    }
	}

	@Resource
    private TokenProvider tokenProvider;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOriginPattern("*"); // Pattern을 빼고 작성하는 경우 equal과 같이 동일한 사이트만 접근 가능하고 패턴은 을 포함한 사이트는 모두 접근 가능
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");

        // 서버 경로로 접근하는 경우 CORS 설정 적용
        source.registerCorsConfiguration("/api/s/**", config);
        return new CorsFilter(source);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            //jwt 인증 방식이기 때문에 csrf를 disable합니다.
            .csrf().disable()
            //filter 우선적으로 corsfilter적용 후 usernamePasswordAuthenticationFilter적용
            .addFilterBefore(corsFilter(), UsernamePasswordAuthenticationFilter.class)

            //인증, 인가 예외처리
            .exceptionHandling()
            .authenticationEntryPoint(new JwtAuthenticationEntryPoint())
            .accessDeniedHandler(new JwtAccessDeniedHandler())

            .and()
            .sessionManagement()
            /*
            * "무상태(stateless)"는 세션 관리 방식 중 하나로,
            * 서버가 클라이언트의 세션 상태를 저장하지 않는 것을 의미
            * 각각의 클라이언트 요청은 독립적으로 처리되며,
            * 이전 요청에 대한 상태나 정보를 서버가 유지하지 않움
            * */
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)

            .and()
            .authorizeHttpRequests()
            .requestMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll()
            .requestMatchers("/rest/actuator", "/api/users", "/api/account/login").permitAll()
            .anyRequest().authenticated()

            .and()
            .apply(new JwtSecurityConfig(tokenProvider));

        return http.build();
    }
}
