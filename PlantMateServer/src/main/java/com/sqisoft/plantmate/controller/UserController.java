/*
 * 
 */
package com.sqisoft.plantmate.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqisoft.plantmate.domain.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/users")
@Tag(name="사용자", description="사용자 정보를 다룬다.")
public class UserController {

	@PostMapping("")
	@Operation(
			summary="회원 가입",
			description="사용자 정보를 등록한다.",
			tags={"사용자"})
	public ResponseEntity<User> save(User user) {
		return ResponseEntity.of(Optional.of(new User()));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 사용자 정보 반환",
			description="특정(id) 사용자 정보를 반환한다.",
			tags={"사용자"})
	public ResponseEntity<User> one(@PathVariable("id") String id) {
		return ResponseEntity.of(Optional.of(new User()));
	}

	@PatchMapping("/{id}")
	@Operation(
			summary="특정 회원 정보 수정",
			description="특정(id) 회원 정보를 수정한다.",
			tags={"사용자"})
	public ResponseEntity<User> save(@PathVariable("id") String id, User user) {
		return ResponseEntity.of(Optional.of(new User()));
	}
}
