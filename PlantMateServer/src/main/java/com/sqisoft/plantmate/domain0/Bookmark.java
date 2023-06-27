/*
 * 
 */
package com.sqisoft.plantmate.domain0;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class Bookmark implements Serializable {

	private static final long serialVersionUID = -683138495914007113L;

	private Integer id;
	private User user;
	private Community post;
	
	private LocalDateTime createDate;
	private LocalDateTime modifyDate;
}
