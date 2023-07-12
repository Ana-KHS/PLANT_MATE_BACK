/*
 * 
 */
package com.sqisoft.plantmate.common;

import java.util.Arrays;
import java.util.Objects;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @author jynius
 */
public class HeaderUtils {
	
    private static final String[] IP_HEADER_CANDIDATES = {
            "X-Forwarded-For",
            "Proxy-Client-IP",
            "WL-Proxy-Client-IP",
            "HTTP_X_FORWARDED_FOR",
            "HTTP_X_FORWARDED",
            "HTTP_X_CLUSTER_CLIENT_IP",
            "HTTP_CLIENT_IP",
            "HTTP_FORWARDED_FOR",
            "HTTP_FORWARDED",
            "HTTP_VIA",
            "REMOTE_ADDR"
        };
    
    public static String remoteAddress(HttpServletRequest request) {
    	return Arrays.stream(IP_HEADER_CANDIDATES)
    			.map(s->request.getHeader(s))
    			.filter(Objects::nonNull)
    			.findFirst()
    			.orElseGet(()->request.getRemoteAddr());
    }
}
