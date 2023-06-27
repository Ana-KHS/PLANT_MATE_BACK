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
		return ResponseEntity.of(Optional.of(new Paging<Bookmark>()));
	}

	@PostMapping("")
	@Operation(
			summary="북마크 등록",
			description="북마크을 등록한다.",
			tags={"북마크"})
	public ResponseEntity<Bookmark> save(Bookmark post) {
		return ResponseEntity.of(Optional.of(new Bookmark()));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 북마크 반환",
			description="특정(id) 북마크을 반환한다.",
			tags={"북마크"})
	public ResponseEntity<Bookmark> one(@PathVariable String id) {
		return ResponseEntity.of(Optional.of(new Bookmark()));
	}

	@PatchMapping("/{id}")
	@Operation(
			summary="특정 북마크 수정",
			description="특정(id) 북마크을 수정한다.",
			tags={"북마크"})
	public ResponseEntity<Bookmark> save(@PathVariable String id, Bookmark post) {
		return ResponseEntity.of(Optional.of(new Bookmark()));
	}

	@DeleteMapping("/{id}")
	@Operation(
			summary="특정 북마크 삭제",
			description="특정(id) 북마크을 삭제한다.",
			tags={"북마크"})
	public ResponseEntity<Bookmark> delete(@PathVariable String id) {
		return ResponseEntity.of(Optional.of(new Bookmark()));
	}
}
