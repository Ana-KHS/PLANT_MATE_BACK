/*
 * 
 */
package com.sqisoft.plantmate.controller;

import java.io.Serializable;

import com.sqisoft.plantmate.domain.Post.Category;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class PostFilter implements Serializable {

	private static final long serialVersionUID = 3369035797366242131L;
	
	public static enum ViewType {
		
		DETAIL("게시글 상세"),
		LIST("리스트"),
		PHOTO("사진형");
		
		private String title;
		private ViewType(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}
	
	public static enum Range {
		
		ALL("제목+본문"),
		CONTENT("본문만"),
		TITLE("제목만");
		
		private String title;
		private Range(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}
	
	public static enum SortType {
		
		RECENT("최신 순"),
		OLDER("오래된 순"),
		COMMENT_COUNT("댓글 순");
		
		private String title;
		private SortType(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}

	private ViewType viewType;	// 조회 형식
	
	private Category category;	// 카테고리
	private Range range;		// 검색어 검색 영역
	private String searchWord;	// 검색어
	
	private SortType sortType;	// 정렬 유형
}
