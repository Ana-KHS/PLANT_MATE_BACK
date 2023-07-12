/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;

/**
 * @author jynius
 */
@Getter
public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = 2274603402135926296L;

	@JsonIgnore
	private String access;
	
	public AuthenticationResponse(String access) {
		this.access = access;
	}
	
	public String getJwt() {
		return access;
	}
}
