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
import com.sqisoft.plantmate.domain.Plant;

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
	public ResponseEntity<Page<Plant>> list(PlantFilter filter) {
		return ResponseEntity.of(Optional.of(new Page<Plant>()));
	}

	@PostMapping("")
	@Operation(
			summary="식물 등록",
			description="식물 정보를 등록한다.",
			tags={"식물"})
	public ResponseEntity<Plant> save(Plant plant) {
		return ResponseEntity.of(Optional.of(new Plant()));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 식물 정보 반환",
			description="특정(id) 식물 정보를 반환한다.",
			tags={"식물"})
	public ResponseEntity<Plant> one(@PathVariable String id) {
		return ResponseEntity.of(Optional.of(new Plant()));
	}

	@PostMapping("/{id}")
	@Operation(
			summary="특정 식물 정보 수정",
			description="특정(id) 식물 정보를 수정한다.",
			tags={"식물"})
	public ResponseEntity<Plant> save(@PathVariable String id, Plant plant) {
		return ResponseEntity.of(Optional.of(new Plant()));
	}

	@DeleteMapping("/{id}")
	@Operation(
			summary="특정 식물 정보 삭제",
			description="특정(id) 식물 정보를 삭제한다.",
			tags={"식물"})
	public ResponseEntity<Plant> delete(@PathVariable String id) {
		return ResponseEntity.of(Optional.of(new Plant()));
	}
}
