/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

/**
 * @author jynius
 */
@Data
@ToString
public class Account implements Serializable {

	private static final long serialVersionUID = -3444359105850225774L;

	private String userid;
	private String passwd;
}
