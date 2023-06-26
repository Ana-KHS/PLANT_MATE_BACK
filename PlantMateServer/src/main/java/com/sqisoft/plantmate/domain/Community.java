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
public class Community implements Serializable {

	private static final long serialVersionUID = 3301170234059276578L;
	
	public static enum Category {
		
		ASK("A", "질문해요"),
		BRAG("B", "자랑해요"),
		LIVING("L", "생활정보");
		
		private String id;
		private String title;
		private Category(String id, String title) {
			this.id = id;
			this.title = title;
		}
		
		public String getId() {
			return this.id;
		}
		
		public String getTitle() {
			return this.title;
		}
	}

	private Integer id;			// 컴뮤니티ID
	private Category category;	// 카테고리
	private MemberPlant plant;	// 게시하고싶다면 나의 식물 정보도 같이

	private String title;	// 글제목
	private String content;	// 본문
	private ImageFile photo;	// 사진
	
//	private String creator;	// 닉네임
	private LocalDateTime createTime;	// 등록일
	private LocalDateTime modifyDate;	// 수정일
	
	private Integer viewCount;	// 조회수
	private Boolean marked;	// 북마크여부
	
	private Integer commentCount;	// 댓글수
	private List<Comment> comments;	// 댓글
}
