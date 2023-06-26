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
public class User implements Serializable {

	private static final long serialVersionUID = -7387098299582811392L;

	private String id;
	private String passwd;

	private String nickname;
	private String name;
	private String email;
	
	private LocalDateTime createDate;
	private LocalDateTime modifyDate;
	
	private ImageFile photo;
	
	private List<MemberPlant> plants;
}
