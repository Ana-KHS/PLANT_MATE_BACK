package com.sqisoft.plantmate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.sqisoft.plantmate.common.JwtAuthenticationFilter;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
@SecurityScheme(
  name = "Bearer Authentication",
  type = SecuritySchemeType.HTTP,
  bearerFormat = "JWT",
  scheme = "bearer"
)
public class SecurityConfig {

	private final JwtAuthenticationFilter jwtAuthenticationFilter;
	private final UserDetailsService userDetailsService;

	public SecurityConfig(
			JwtAuthenticationFilter jwtAuthenticationFilter,
			UserDetailsService userDetailsService) {
		this.jwtAuthenticationFilter = jwtAuthenticationFilter;
		this.userDetailsService      = userDetailsService;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(userDetailsService);
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}
	
	@Bean
	public AuthenticationManager authenticationManager(
			AuthenticationConfiguration authenticationConfiguration) throws Exception {
	    return authenticationConfiguration.getAuthenticationManager();
	}
    
    @Bean
    public CorsFilter corsFilter() {
    	
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        // Pattern을 빼고 작성하는 경우 equal과 같이 동일한 사이트만 접근 가능하고 패턴을 포함한 사이트는 모두 접근 가능
        config.addAllowedOriginPattern("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 서버 경로로 접근하는 경우 CORS 설정 적용
        source.registerCorsConfiguration("/api/**", config);
        
        return new CorsFilter(source);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
    	
    	httpSecurity.headers().frameOptions().disable();
        //jwt 인증 방식이기 때문에 csrf를 disable합니다.
    	httpSecurity.csrf().disable();
        //@formatter:off
        httpSecurity
		      .authorizeHttpRequests()
		      .requestMatchers("/rest/actuator").permitAll()
		      .requestMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll()
	          .requestMatchers("/api/auth/**", "/api/user", "/api/user/**").permitAll()
	          .requestMatchers("/api/search/**", "/api/community/**").permitAll()
//		      .anyRequest().permitAll()
              .anyRequest().authenticated()
            .and()
              .sessionManagement()
              /*
               * "무상태(stateless)"는 세션 관리 방식 중 하나로,
               * 서버가 클라이언트의 세션 상태를 저장하지 않는 것을 의미
               * 각각의 클라이언트 요청은 독립적으로 처리되며,
               * 이전 요청에 대한 상태나 정보를 서버가 유지하지 않움
               */
              .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            //인증, 인가 예외처리
              .exceptionHandling()
              .authenticationEntryPoint(
                      (request, response, authException)
                      -> response.sendError(
                    	  // 유효한 자격증명을 제공하지 않고 접근하려 할때 401
                          HttpServletResponse.SC_UNAUTHORIZED,
                          authException.getLocalizedMessage()
                        )
              )
              .accessDeniedHandler(
                      (request, response, accessDeniedException)
                      -> response.sendError(
                    	  //필요한 권한이 없이 접근하려 할때 403
                          HttpServletResponse.SC_FORBIDDEN,
                          accessDeniedException.getLocalizedMessage()
                        )
              )
            .and()
              .authenticationProvider(authenticationProvider())
              //filter 우선적으로 corsfilter적용 후 usernamePasswordAuthenticationFilter적용
              .addFilterBefore(corsFilter(), UsernamePasswordAuthenticationFilter.class)
              .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        //@formatter:on

        return httpSecurity.build();
    }
}
