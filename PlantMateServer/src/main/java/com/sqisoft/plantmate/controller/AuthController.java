/**
 * 
 */
package com.sqisoft.plantmate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqisoft.plantmate.common.JwtTokenProvider;
import com.sqisoft.plantmate.domain.Account;
import com.sqisoft.plantmate.domain.AuthenticationResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;

/**
 * @author jynius
 *
 */
@RestController
@RequestMapping("/api/auth")
@Tag(name="인증/허가", description="계정의 인증/허가를 다룬다.")
public class AuthController {

	@Resource
    private AuthenticationManager authenticationManager;
	@Resource
    private JwtTokenProvider tokenProvider;

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
			tags={"인증/허가"})
    public ResponseEntity<AuthenticationResponse> login(@RequestBody Account login) {
    	
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(login.getUserid(), login.getPasswd())
        );
        
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProvider.createToken(authentication);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
