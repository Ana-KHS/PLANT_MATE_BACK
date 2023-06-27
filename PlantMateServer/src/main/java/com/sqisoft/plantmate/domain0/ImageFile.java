/*
 * 
 */
package com.sqisoft.plantmate.domain0;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jynius
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ImageFile extends UploadFile {

	private static final long serialVersionUID = 4222646866437894942L;

	public final String getType() {
		return "";
	}
}
