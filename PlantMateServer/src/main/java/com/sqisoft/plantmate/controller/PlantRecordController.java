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

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.PlantRecord;
import com.sqisoft.plantmate.domain.PlantRecordFilter;
import com.sqisoft.plantmate.service.PlantRecordService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/record")
@Tag(name="일지", description="일지를 다룬다.")
public class PlantRecordController {

	@Resource
	private PlantRecordService service;
	
	@GetMapping("")
	@Operation(
			summary="일지 목록 반환",
			description="일지 목록을 반환한다.",
			tags={"일지"})
	public ResponseEntity<Paging<PlantRecord>> list(PlantRecordFilter filter) {
		
		Paging<PlantRecord> page = service.selectPage(filter);
		
		return ResponseEntity.of(Optional.of(page));
	}

	@PostMapping("")
	@Operation(
			summary="일지 등록",
			description="일지를 등록한다.",
			tags={"일지"})
	public ResponseEntity<PlantRecord> save(PlantRecord log) {
		
		service.save(log);
		
		return ResponseEntity.of(Optional.of(log));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 일지 반환",
			description="특정(id) 일지를 반환한다.",
			tags={"일지"})
	public ResponseEntity<PlantRecord> one(@PathVariable Integer id) {

		PlantRecord log = service.selectOne(id);
		
		return ResponseEntity.of(Optional.of(log));
	}

	@PatchMapping("/{id}")
	@Operation(
			summary="특정 일지 수정",
			description="특정(id) 일지를 수정한다.",
			tags={"일지"})
	public ResponseEntity<PlantRecord> save(@PathVariable Integer id, PlantRecord log) {
		
		log.setId(id);
		service.save(log);
		
		return ResponseEntity.of(Optional.of(log));
	}
}
