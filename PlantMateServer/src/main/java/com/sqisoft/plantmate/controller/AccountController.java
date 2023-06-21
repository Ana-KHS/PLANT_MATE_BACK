/**
 * 
 */
package com.sqisoft.plantmate.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqisoft.plantmate.common.JwtFilter;
import com.sqisoft.plantmate.common.TokenProvider;
import com.sqisoft.plantmate.domain.Account;
import com.sqisoft.plantmate.domain.Token;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

/**
 * @author jynius
 *
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
@Tag(name="계정", description="계정을 다룬다.")
public class AccountController {

    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final TokenProvider tokenProvider;

    /**
     * <h3>로그인</h3>
     * 
     * @param login
     * @return
     */
    @PostMapping("/login")
	@Operation(
			summary="로그인 처리",
			description="로그인 한다.",
			tags={"계정"})
    public ResponseEntity<Token> login(Account login) {
    	
        UsernamePasswordAuthenticationToken token =
                new UsernamePasswordAuthenticationToken(login.getUserid(), login.getPasswd());

        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProvider.createToken(authentication);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(JwtFilter.AUTHORIZATION_HEADER, "Bearer " + jwt);

        return new ResponseEntity<Token>(new Token(jwt),httpHeaders, HttpStatus.OK);
    }
}
