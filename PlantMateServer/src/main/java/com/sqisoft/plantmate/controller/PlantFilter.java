/**
 * 
 */
package com.sqisoft.plantmate.controller;

import java.io.Serializable;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class PlantFilter implements Serializable {

	private static final long serialVersionUID = -2842539556506309876L;
	
	public static enum SortType {
		
		RECENT("최신 순"),
		OLDER("오래된 순");
		
		private String title;
		private SortType(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}
	
	private String userid;
	
	private SortType sortType;	// 정렬 유형
}
