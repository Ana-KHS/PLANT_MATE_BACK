/*
 * 
 */
package com.sqisoft.plantmate.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.Comment;
import com.sqisoft.plantmate.domain.CommentFilter;
import com.sqisoft.plantmate.service.CommentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/comment")
@Tag(name="댓글", description="댓글을 다룬다.")
public class CommentController {

	@Resource
	private CommentService service;
	
	@GetMapping("")
	@Operation(
			summary="댓글 목록",
			description="댓글 목록을 반환한다.",
			tags={"댓글"})
	public ResponseEntity<Paging<Comment>> list(CommentFilter filter) {
	
		Paging<Comment> page = service.selectPage(filter);
		
		return ResponseEntity.of(Optional.of(page));
	}

	@PostMapping("")
	@Operation(
			summary="댓글 등록",
			description="댓글을 등록한다.",
			tags={"댓글"})
	public ResponseEntity<Comment> save(@RequestBody Comment post) {
		
		service.save(post);
		
		return ResponseEntity.of(Optional.of(post));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 댓글 반환",
			description="특정(id) 댓글을 반환한다.",
			tags={"댓글"})
	public ResponseEntity<Comment> one(@PathVariable Integer id) {
		
		Comment community = service.selectOne(id);
		
		return ResponseEntity.of(Optional.of(community));
	}

	@PatchMapping("/{id}")
	@Operation(
			summary="특정 댓글 수정",
			description="특정(id) 댓글을 수정한다.",
			tags={"댓글"})
	public ResponseEntity<Comment> save(@PathVariable Integer id, Comment post) {
		
		post.setId(id);
		service.save(post);
		
		return ResponseEntity.of(Optional.of(post));
	}

	@DeleteMapping("/{id}")
	@Operation(
			summary="특정 댓글 삭제",
			description="특정(id) 댓글을 삭제한다.",
			tags={"댓글"})
	public ResponseEntity<Comment> delete(@PathVariable Integer id) {
		
		Comment comment = service.selectOne(id);
		service.delete(id);
		
		return ResponseEntity.of(Optional.of(comment));
	}
}
