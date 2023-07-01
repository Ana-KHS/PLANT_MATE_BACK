/*
 * 
 */
package com.sqisoft.plantmate.domain.filter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jynius
 */
@Getter
@Setter
public class CriteriaBased implements CriteriaInterface, Serializable {

	private static final long serialVersionUID = 1701087473179067357L;
	
	private static final String TARGET = "\\{rootCriteria\\.";
	private static final String FORMAT = "{rootCriteria.criteria[%d].";

    private List<CriteriaInterface> criteria = new ArrayList<>();
    private String conjunction;

    public void add(CriteriaInterface statement) {
    	criteria.add(statement);
    }
    
    protected void addCriterion(String condition) {
    	add(new Criterion(condition));
    }

    protected void addCriterion(String condition, Object value) {
    	add(new Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2) {
    	add(new Criterion(condition, value1, value2));
    }

    @Override
	public String toString() {

	    List<CriteriaInterface> statements = getCriteria();
	    int size = statements.size();
	    if(size==0) {
	    	return "";
	    }
	    
	    StringBuilder sb = new StringBuilder();
		for (int j = 0; j < size; j++) {
			CriteriaInterface statement = statements.get(j);
	        sb.append(" ").append(conjunction).append(" ");
	        sb.append(statement.toString().replaceAll(TARGET, String.format(FORMAT, j)));
	    }
	    
	    return String.format("(%s)", sb.substring(conjunction.length()+2)); // " and", " or"
	}
}
