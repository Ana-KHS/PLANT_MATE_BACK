/*
 * 
 */
package com.sqisoft.plantmate.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqisoft.plantmate.common.Page;
import com.sqisoft.plantmate.domain.MemberPlant;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/plants")
@Tag(name="식물", description="식물 정보를 다룬다.")
public class PlantController {

	@GetMapping("")
	@Operation(
			summary="식물 목록",
			description="식물 목록을 반환한다.",
			tags={"식물"})
	public ResponseEntity<Page<MemberPlant>> list(PlantFilter filter) {
		return ResponseEntity.of(Optional.of(new Page<MemberPlant>()));
	}

	@PostMapping("")
	@Operation(
			summary="식물 등록",
			description="식물 정보를 등록한다.",
			tags={"식물"})
	public ResponseEntity<MemberPlant> save(MemberPlant plant) {
		return ResponseEntity.of(Optional.of(new MemberPlant()));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 식물 정보 반환",
			description="특정(id) 식물 정보를 반환한다.",
			tags={"식물"})
	public ResponseEntity<MemberPlant> one(@PathVariable String id) {
		return ResponseEntity.of(Optional.of(new MemberPlant()));
	}

	@PostMapping("/{id}")
	@Operation(
			summary="특정 식물 정보 수정",
			description="특정(id) 식물 정보를 수정한다.",
			tags={"식물"})
	public ResponseEntity<MemberPlant> save(@PathVariable String id, MemberPlant plant) {
		return ResponseEntity.of(Optional.of(new MemberPlant()));
	}

	@DeleteMapping("/{id}")
	@Operation(
			summary="특정 식물 정보 삭제",
			description="특정(id) 식물 정보를 삭제한다.",
			tags={"식물"})
	public ResponseEntity<MemberPlant> delete(@PathVariable String id) {
		return ResponseEntity.of(Optional.of(new MemberPlant()));
	}
}
