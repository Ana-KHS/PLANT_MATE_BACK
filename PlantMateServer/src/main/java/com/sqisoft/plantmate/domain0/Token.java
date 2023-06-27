/*
 * 
 */
package com.sqisoft.plantmate.domain0;

import java.io.Serializable;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class Token implements Serializable {

	private static final long serialVersionUID = 2274603402135926296L;

	private String token;
	
	public Token(String token) {
		this.token = token;
	}
}
