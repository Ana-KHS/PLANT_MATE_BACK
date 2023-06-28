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

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.Bookmark;
import com.sqisoft.plantmate.domain.BookmarkFilter;
import com.sqisoft.plantmate.service.BookmarkService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/bookmark")
@Tag(name="북마크", description="북마크를 다룬다.")
public class BookmarkController {

	@Resource
	private BookmarkService service;
	
	@GetMapping("")
	@Operation(
			summary="북마크 목록",
			description="북마크 목록을 반환한다.",
			tags={"북마크"})
	public ResponseEntity<Paging<Bookmark>> list(BookmarkFilter filter) {
		
		Paging<Bookmark> page = service.selectPage(filter);
		
		return ResponseEntity.of(Optional.of(page));
	}

	@PostMapping("")
	@Operation(
			summary="북마크 등록",
			description="북마크을 등록한다.",
			tags={"북마크"})
	public ResponseEntity<Bookmark> save(Bookmark post) {
		
		service.save(post);
		
		return ResponseEntity.of(Optional.of(post));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 북마크 반환",
			description="특정(id) 북마크을 반환한다.",
			tags={"북마크"})
	public ResponseEntity<Bookmark> one(@PathVariable Integer id) {
		
		Bookmark bookmark = service.selectOne(id);
		
		return ResponseEntity.of(Optional.of(bookmark));
	}

	@PatchMapping("/{id}")
	@Operation(
			summary="특정 북마크 수정",
			description="특정(id) 북마크을 수정한다.",
			tags={"북마크"})
	public ResponseEntity<Bookmark> save(@PathVariable Integer id, Bookmark post) {
		
		post.setId(id);
		service.save(post);
		
		return ResponseEntity.of(Optional.of(post));
	}

	@DeleteMapping("/{id}")
	@Operation(
			summary="특정 북마크 삭제",
			description="특정(id) 북마크을 삭제한다.",
			tags={"북마크"})
	public ResponseEntity<Bookmark> delete(@PathVariable Integer id) {
		
		Bookmark bookmark = service.selectOne(id);
		service.delete(id);
		
		return ResponseEntity.of(Optional.of(bookmark));
	}
}
