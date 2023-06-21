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
public class Bookmark implements Serializable {

	private static final long serialVersionUID = -683138495914007113L;

	private User user;
	private Post post;
}
