/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**
 * table tb_comment
 * 
 * @author jynius
 */
@Data
@ToString
public class Comment implements Serializable {

	private static final long serialVersionUID = -2001771442021429025L;

	/**
     * column tb_comment.COMMENTID
     */
    private Integer id;

    /**
     * column tb_comment.COMMUNITYID
     */
    private Integer communityId;

    /**
     * column tb_comment.USER_ID
     */
    private String userId;

    /**
     * column tb_comment.COMMENT
     */
    private String comment;

    /**
     * column tb_comment.CREATE_DATE
     */
    private Date createDate;

    /**
     * column tb_comment.MODIFY_DATE
     */
    private Date modifyDate;

    /**
     * column tb_comment.FILEID
     */
    private Integer fileId;
}