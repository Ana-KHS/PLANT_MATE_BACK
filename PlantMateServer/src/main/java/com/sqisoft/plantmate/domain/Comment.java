/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tb_comment
 * 
 * @author jynius
 */
@Data
@ToString
public class Comment implements Serializable {

	private static final long serialVersionUID = -2001771442021429025L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.COMMENTID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.COMMUNITYID
     *
     * @mbg.generated
     */
    private Integer communityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.USER_ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.COMMENT
     *
     * @mbg.generated
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.CREATE_DATE
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.MODIFY_DATE
     *
     * @mbg.generated
     */
    private Date modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.FILEID
     *
     * @mbg.generated
     */
    private Integer fileId;
}