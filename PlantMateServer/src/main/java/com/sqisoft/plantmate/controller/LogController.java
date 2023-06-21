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

import com.sqisoft.plantmate.common.Page;
import com.sqisoft.plantmate.domain.Log;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/logs")
@Tag(name="일지", description="일지를 다룬다.")
public class LogController {

	@GetMapping("")
	@Operation(
			summary="일지 목록 반환",
			description="일지 목록을 반환한다.",
			tags={"일지"})
	public ResponseEntity<Page<Log>> list(LogFilter filter) {
		return ResponseEntity.of(Optional.of(new Page<Log>()));
	}

	@PostMapping("")
	@Operation(
			summary="일지 등록",
			description="일지를 등록한다.",
			tags={"일지"})
	public ResponseEntity<Log> save(Log log) {
		return ResponseEntity.of(Optional.of(new Log()));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 일지 반환",
			description="특정(id) 일지를 반환한다.",
			tags={"일지"})
	public ResponseEntity<Log> one(@PathVariable String id) {
		return ResponseEntity.of(Optional.of(new Log()));
	}

	@PatchMapping("/{id}")
	@Operation(
			summary="특정 일지 수정",
			description="특정(id) 일지를 수정한다.",
			tags={"일지"})
	public ResponseEntity<Log> save(@PathVariable String id, Log log) {
		return ResponseEntity.of(Optional.of(new Log()));
	}
}
