/*
 * 
 */
package com.sqisoft.plantmate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sqisoft.plantmate.domain.PlantSearchFilter;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/search")
@Tag(name="계정", description="계정을 다룬다.")
public class PlantSearchController {

	private static final RestTemplate REST_TEMPLATE = new RestTemplate();
	
	@GetMapping("")
	@Operation(
			summary="산림청 국립수목원 식물자원 서비스",
			description="식물자원 서비스의 Open API 서비스를 이용하여 식물 정보를 검색한다.",
			tags={"국립수목원"})
    public ResponseEntity<String> search(PlantSearchFilter filter) {
		
		ResponseEntity<String> response = REST_TEMPLATE.getForEntity(filter.getUri(), String.class);

        return response;
    }
}
