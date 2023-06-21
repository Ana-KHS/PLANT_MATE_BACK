/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class Post implements Serializable {

	private static final long serialVersionUID = 3301170234059276578L;
	
	public static enum Category {
		
		ASK("질문해요"),
		BRAG("자랑해요"),
		LIVING("생활정보");
		
		private String title;
		private Category(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}

	private Integer id;
	private Category category;	// 카테고리
	private Plant plant;	// 게시하고싶다면 나의 식물 정보도 같이
	private String title;	// 글제목
	private String content;	// 본문
	private Image photo;	// 사진
	
	private String creator;	// 닉네임
	private LocalDateTime createdTime;	// 등록일
	
	private Integer viewCount;	// 조회수
	private Boolean marked;	// 북마크여부
	
	private Integer commentCount;	// 댓글수
	private List<Comment> comments;	// 댓글
}
