/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author jynius
 *
 */
@Data
public class Comment implements Serializable {

	private static final long serialVersionUID = 553189722397206600L;

	private Post post;
	private Integer postId;
	
	private Integer id;
	private String content;
	private String writer;
	private LocalDateTime writtenTime;
	
	private Image photo;
}
