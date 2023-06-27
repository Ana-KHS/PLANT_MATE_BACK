/*
 * 
 */
package com.sqisoft.plantmate.domain0;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class MemberPlant implements Serializable {

	private static final long serialVersionUID = -3919097711064508508L;

	private String userId;	// 아이디
	private Integer id;		// 내식물ID
	
	private String name;	// 식물명
	private String nickname;	// 애칭
	private String memo;		// 메모
	private String thumbnail;
	
	private LocalDate startDate;// 기르기 시작한 날짜
	private Boolean waterAlarm;	// 물주기 알람
	private Integer earterCycle;// 물주기
	private LocalDateTime lastWaterDate;// 마지막으로 물 준 날
	
	private LocalDateTime createDate;	// 등록일시
	private LocalDateTime modifyDate;	// 수정일시
	
//	private List<ImageFile> thumbnail;	// 식물 사진
}
