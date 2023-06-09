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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.MemberPlant;
import com.sqisoft.plantmate.domain.MemberPlantFilter;
import com.sqisoft.plantmate.service.MemberPlantService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/myplant")
@Tag(name="식물", description="식물 정보를 다룬다.")
public class MemberPlantController {

	@Resource
	private MemberPlantService service;
	
	@GetMapping("")
	@Operation(
			summary="식물 목록",
			description="식물 목록을 반환한다.",
			tags={"식물"})
	@SecurityRequirement(name = "Bearer Authentication")
	public ResponseEntity<Paging<MemberPlant>> list(MemberPlantFilter filter) {
		
		Paging<MemberPlant> page = service.selectPage(filter);
		
		return ResponseEntity.of(Optional.of(page));
	}

	@PostMapping("")
	@Operation(
			summary="식물 등록",
			description="식물 정보를 등록한다.",
			tags={"식물"})
	@SecurityRequirement(name = "Bearer Authentication")
	public ResponseEntity<MemberPlant> save(@RequestBody MemberPlant plant) {
		
		service.save(plant);
		
		return ResponseEntity.of(Optional.of(plant));
	}

	@GetMapping("/{id}")
	@Operation(
			summary="특정 식물 정보 반환",
			description="특정(id) 식물 정보를 반환한다.",
			tags={"식물"})
	@SecurityRequirement(name = "Bearer Authentication")
	public ResponseEntity<MemberPlant> one(@PathVariable Integer id) {
		
		MemberPlant plant = service.selectOne(id);
		
		return ResponseEntity.of(Optional.of(plant));
	}

	@PostMapping("/{id}")
	@Operation(
			summary="특정 식물 정보 수정",
			description="특정(id) 식물 정보를 수정한다.",
			tags={"식물"})
	@SecurityRequirement(name = "Bearer Authentication")
	public ResponseEntity<MemberPlant> save(@PathVariable Integer id, MemberPlant plant) {
		
		plant.setId(id);
		service.save(plant);
		
		return ResponseEntity.of(Optional.of(plant));
	}

	@DeleteMapping("/{id}")
	@Operation(
			summary="특정 식물 정보 삭제",
			description="특정(id) 식물 정보를 삭제한다.",
			tags={"식물"})
	@SecurityRequirement(name = "Bearer Authentication")
	public ResponseEntity<MemberPlant> delete(@PathVariable Integer id) {
		
		MemberPlant plant = service.selectOne(id);
		service.delete(id);
		
		return ResponseEntity.of(Optional.of(plant));
	}
}
