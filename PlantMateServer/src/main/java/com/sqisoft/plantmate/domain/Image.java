/*
 * 
 */
package com.sqisoft.plantmate.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jynius
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class Image extends Attach {

	private static final long serialVersionUID = 4222646866437894942L;

	public String getType() {
		return "";
	}
}
