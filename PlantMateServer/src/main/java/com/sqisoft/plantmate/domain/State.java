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
public class State implements Serializable {

	private static final long serialVersionUID = 9190706766190379511L;

	public static enum Step {
		
		SEED("씨앗 단계"),
		BUD("발아 단계"),
		GROWTH("성장 단계"),
		BLOOM("개화 단계");
		
		private String title;
		private Step(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}

	private Step step;
	
	private Integer height;
	private Integer leafCount;
	
	private List<Image> Photos;
	
	private LocalDateTime observedTime;
}
