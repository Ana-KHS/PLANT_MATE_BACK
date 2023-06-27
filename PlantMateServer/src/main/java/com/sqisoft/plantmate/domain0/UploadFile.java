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
public class UploadFile implements Serializable {

	private static final long serialVersionUID = 6935170206010029554L;

	private Integer id;
	private String type;
	private String path;
	private String name;
	private Long size;
}
