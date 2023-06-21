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
public class Attach implements Serializable {

	private static final long serialVersionUID = 6935170206010029554L;

	private String type;
	private String path;
	private String name;
	private Long size;
}
