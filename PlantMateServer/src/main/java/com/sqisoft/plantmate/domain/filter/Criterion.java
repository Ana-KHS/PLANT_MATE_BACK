/*
 * 
 */
package com.sqisoft.plantmate.domain.filter;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;

/**
 * @author jynius
 */
@Getter
public class Criterion implements CriteriaInterface, Serializable {
	
	private static final long serialVersionUID = -4626932774880614388L;

	private static enum ValueType {
		NO, SINGLE, BETWEEN, LIST;
	}
	
	private String condition;
    private String typeHandler;
    private Object[] values;
    private ValueType valueType;

    protected Criterion(String condition) {
        this.condition = condition;
        this.valueType = ValueType.NO;
    }

    protected Criterion(String condition, Object value) {
        this.condition = condition;
        if(value instanceof List<?>) {
            this.values = ((List<?>)value).toArray();
            this.valueType = ValueType.LIST;
        }
        else {
            this.values = new Object[]{value};
            this.valueType = ValueType.SINGLE;
        }
    }

    protected Criterion(String condition, Object value0, Object value1) {
        this.condition = condition;
        this.values = new Object[]{value0, value1};
        this.valueType = ValueType.BETWEEN;
    }

    @Override
	public String toString() {
		
		String typeHandler = getTypeHandler();
		String th = typeHandler==null || typeHandler.isBlank()? "": String.format(",typeHandler=%s", getTypeHandler());
		
		StringBuilder sb = new StringBuilder();
	    sb.append(getCondition());
	    switch(valueType) {
	    case SINGLE:
	        sb.append("#{rootCriteria.values[0]").append(th).append("}");
	        break;
	    case BETWEEN:
	        sb.append("#{rootCriteria.values[0]").append(th).append("}").append("and #{rootCriteria.values[1]").append(th).append("}");
	        break;
	    case LIST:
		    sb.append(" (");
			for (int k = 0; k < values.length; k++) {
				
				if(k>0) {
					sb.append(", ");
				}
				sb.append("#{rootCriteria.values[").append(k).append("]").append(th).append("}");
			}
		    sb.append(')');
	        break;
	    case NO:
	    default:
	    }
	    
	    return sb.toString();
	}
}
