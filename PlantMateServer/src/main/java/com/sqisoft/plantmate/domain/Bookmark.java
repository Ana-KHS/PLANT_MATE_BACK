/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**
 * table tb_bookmark
 * 
 * @author jynius
 */
@Data
@ToString
public class Bookmark implements Serializable {

	private static final long serialVersionUID = 6477457825733723290L;

	/**
     * column tb_bookmark.BOOKMARKID
     */
    private Integer id;

    /**
     * column tb_bookmark.USER_ID
     */
    private String userId;

    /**
     * column tb_bookmark.COMMUNITYID
     */
    private Integer communityId;

	/**
     * column tb_bookmark.CREATE_DATE
     */
    private Date createDate;

    /**
     * column tb_bookmark.MODIFY_DATE
     */
    private Date modifyDate;
}