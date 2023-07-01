/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import org.apache.ibatis.jdbc.SQL;

import com.sqisoft.plantmate.domain.filter.CriteriaBased;
import com.sqisoft.plantmate.domain.filter.BaseFilter;

/**
 * @author jynius
 */
public class BaseSqlProvider {
	
	private static final String TARGET = "\\{rootCriteria\\.";
	private static final String FORMAT = "{example.rootCriteria.";

    /**
     * 
     */
    protected void applyWhere(SQL sql, BaseFilter<? extends CriteriaBased> example, boolean includeFilterPhrase) {
    	
        if (example==null) {
            return;
        }
        
        String s = example.whereStatement();
        if(s!=null && !s.isBlank()) {
        	
        	if(includeFilterPhrase) {
        		s.replaceAll(TARGET, FORMAT);
        	}
        	
        	sql.WHERE(s);
        }
    }
}
