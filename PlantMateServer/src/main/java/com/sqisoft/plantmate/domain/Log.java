/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class Log implements Serializable {

	private static final long serialVersionUID = 2001221942134490163L;
	
	private Integer id;
	private String title;

	private Environment environment;
	private Plant plant;
	private State state;
	
	private LocalDateTime createdTime;
}
