/**
 * 
 */
package com.sqisoft.plantmate.common;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @author jynius
 *
 */
@Data
public class Paging<T> implements Serializable {

	private static final long serialVersionUID = 3957518065865689739L;
	
	private Integer current;

	private Long total;
	
	private List<T> list;
}
