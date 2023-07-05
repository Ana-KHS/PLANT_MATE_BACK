/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = 2274603402135926296L;

	private String jwt;
	
	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}
}
