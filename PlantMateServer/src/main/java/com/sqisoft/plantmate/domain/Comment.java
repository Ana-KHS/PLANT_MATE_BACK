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

	private Integer id;		// 코멘트ID
	private Community post;	// 커뮤니티ID
	private User user;		// 사용자ID
	
	private String comment;
	private LocalDateTime createDate;
	private LocalDateTime modifyDate;
	
	private ImageFile photo;
}
