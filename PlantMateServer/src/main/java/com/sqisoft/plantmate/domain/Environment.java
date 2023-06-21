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
public class Environment implements Serializable {

	private static final long serialVersionUID = -5595383523854882600L;

	private String location;
	private String soil; // 토양 상태
	
	private Integer temperature;
	private Integer humidity;
	
	private LocalDateTime measuredTime;
}
