/*
 * 
 */
package com.sqisoft.plantmate.domain0;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class PlantRecord implements Serializable {

	private static final long serialVersionUID = 2001221942134490163L;

	private Integer plantId;	// 내식물ID
	private Integer id;			// 성장일지ID
	private String title;		// 제목
	private LocalDate date;		// 작성일
	private Integer length;		// 식물길이
	private Integer amount;		// 잎의 수
	private State state;		// 성장상태
	private Integer water;		// 물공급
	private String soilKind;	// 토양종류
	private String fertilizer;	// 비료종류
	private Integer temperature;// 온도
	private Integer humidity;	// 습도
	private String content;		// 성장내용
	private String unusual;		// 특이사항

//	private Environment environment;
//	private MemberPlant plant;
//	
//	private LocalDateTime createdTime;
}
