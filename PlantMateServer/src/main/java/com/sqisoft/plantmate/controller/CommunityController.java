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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.Community;
import com.sqisoft.plantmate.domain.CommunityFilter;
import com.sqisoft.plantmate.service.CommunityService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/community")
@Tag(name="게시글", description="게시글을 다룬다.")
public class CommunityController {

	@Resource
	private CommunityService service;
	
	@GetMapping("")
	@Operation(
			summary="게시글 목록",
			description="게시글 목록을 반환한다.",
			tags={"게시글"})
	public ResponseEntity<Paging<Community>> list(CommunityFilter filter) {
		
		Paging<Community> page = service.selectPage(filter);
		
		return ResponseEntity.of(Optional.of(page));
	}

	@PostMapping("")
	@Operation(
			summary="게시글 등록",
			description="게시글을 등록한다.",
			tags={"게시글"})
	public ResponseEntity<Community> save(@RequestBody Community post) {
		
		service.save(post);
		
		return ResponseEntity.of(Optional.of(post));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 게시글 반환",
			description="특정(id) 게시글을 반환한다.",
			tags={"게시글"})
	public ResponseEntity<Community> one(@PathVariable Integer id) {
		
		Community community = service.selectOne(id);
		
		return ResponseEntity.of(Optional.of(community));
	}

	@PatchMapping("/{id}")
	@Operation(
			summary="특정 게시글 수정",
			description="특정(id) 게시글을 수정한다.",
			tags={"게시글"})
	public ResponseEntity<Community> save(@PathVariable Integer id, @RequestBody Community post) {
		
		post.setId(id);
		service.save(post);
		
		return ResponseEntity.of(Optional.of(post));
	}

	@DeleteMapping("/{id}")
	@Operation(
			summary="특정 게시글 삭제",
			description="특정(id) 게시글을 삭제한다.",
			tags={"게시글"})
	public ResponseEntity<Community> delete(@PathVariable Integer id) {
		
		Community community = service.selectOne(id);
		service.delete(id);
		
		return ResponseEntity.of(Optional.of(community));
	}
}
