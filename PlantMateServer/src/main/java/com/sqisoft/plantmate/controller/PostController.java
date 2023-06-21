/*
 * 
 */
package com.sqisoft.plantmate.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqisoft.plantmate.common.Page;
import com.sqisoft.plantmate.domain.Post;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/posts")
@Tag(name="게시글", description="게시글을 다룬다.")
public class PostController {

	@GetMapping("")
	@Operation(
			summary="게시글 목록",
			description="게시글 목록을 반환한다.",
			tags={"게시글"})
	public ResponseEntity<Page<Post>> list(PostFilter filter) {
		return ResponseEntity.of(Optional.of(new Page<Post>()));
	}

	@PostMapping("")
	@Operation(
			summary="게시글 등록",
			description="게시글을 등록한다.",
			tags={"게시글"})
	public ResponseEntity<Post> save(Post post) {
		return ResponseEntity.of(Optional.of(new Post()));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 게시글 반환",
			description="특정(id) 게시글을 반환한다.",
			tags={"게시글"})
	public ResponseEntity<Post> one(@PathVariable String id) {
		return ResponseEntity.of(Optional.of(new Post()));
	}

	@PatchMapping("/{id}")
	@Operation(
			summary="특정 게시글 수정",
			description="특정(id) 게시글을 수정한다.",
			tags={"게시글"})
	public ResponseEntity<Post> save(@PathVariable String id, Post post) {
		return ResponseEntity.of(Optional.of(new Post()));
	}

	@DeleteMapping("/{id}")
	@Operation(
			summary="특정 게시글 삭제",
			description="특정(id) 게시글을 삭제한다.",
			tags={"게시글"})
	public ResponseEntity<Post> delete(@PathVariable String id) {
		return ResponseEntity.of(Optional.of(new Post()));
	}
}