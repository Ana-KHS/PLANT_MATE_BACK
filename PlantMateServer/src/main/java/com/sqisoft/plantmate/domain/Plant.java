/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class Plant implements Serializable {

	private static final long serialVersionUID = -3919097711064508508L;

	private String name;	// 식물 이름
	
	private String nickname;	// 애칭
	private LocalDate start;	// 기르기 시작한 날짜
	private String description;	// 설명 
	
	private List<Image> thumbnail;	// 식물 사진
}
