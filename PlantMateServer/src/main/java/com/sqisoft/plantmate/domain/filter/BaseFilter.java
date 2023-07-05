/*
 * 
 */
package com.sqisoft.plantmate.domain.filter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public abstract class BaseFilter<T extends CriteriaBased> implements Serializable {

	private static final long serialVersionUID = -9128103062151161956L;

	@JsonIgnore
	private T rootCriteria;
	
	@JsonIgnore
    protected boolean distinct;
	
	@JsonIgnore
    protected String orderByClause;
	
	public abstract T buildCriteria();
	
	public String whereStatement() {
        
		rootCriteria = buildCriteria();

    	return rootCriteria==null? null: rootCriteria.toString();
	}
}
