/*
 * 
 */
package com.sqisoft.plantmate.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqisoft.plantmate.domain.User;
import com.sqisoft.plantmate.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/user")
@Tag(name="사용자", description="사용자 정보를 다룬다.")
public class UserController {

	@Resource
	private UserService service;
	@Resource
	private PasswordEncoder encoder;

	@GetMapping("/{id}")
	@Operation(
			summary="특정 사용자 정보 반환",
			description="특정(id) 사용자 정보를 반환한다.",
			tags={"사용자"})
	public ResponseEntity<User> one(@PathVariable("id") String id) {
		
		User user = service.selectOne(id);
		
		return ResponseEntity.of(Optional.of(user));
	}
	
	@PostMapping("")
	@Operation(
			summary="회원 가입",
			description="사용자 정보를 등록한다.",
			tags={"사용자"})
	public ResponseEntity<User> save(@RequestBody User user) {

		user.setPassword(encoder.encode(user.getPassword()));
		service.insert(user);
		
		return ResponseEntity.of(Optional.of(user));
	}
	
	@PostMapping("/{id}")
	@Operation(
			summary="회원 정보 수정",
			description="사용자 정보를 수정한다.",
			tags={"사용자"})
	public ResponseEntity<User> save(@PathVariable("id") String id, @RequestBody User user) {

		user.setId(id);
		String password = user.getPassword();
		if(password!=null && !password.isBlank()) {
			user.setPassword(encoder.encode(password));
		}
		service.update(user);
		
		return ResponseEntity.of(Optional.of(user));
	}
}
