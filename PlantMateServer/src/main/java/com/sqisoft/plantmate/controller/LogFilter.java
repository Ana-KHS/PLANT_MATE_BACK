/**
 * 
 */
package com.sqisoft.plantmate.controller;

import java.io.Serializable;

import lombok.Data;

/**
 * @author jynius
 *
 */
@Data
public class LogFilter implements Serializable {

	private static final long serialVersionUID = -4979726892627597187L;
	
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
	
	private String plantName;
	private String title;
	
	private SortType sortType;
}
