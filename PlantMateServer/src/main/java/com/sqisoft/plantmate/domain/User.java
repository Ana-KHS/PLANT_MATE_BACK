package com.sqisoft.plantmate.domain;

import java.io.Serializable;
/*
 * 
 */
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**
 * table tb_user
 * 
 * @author jynius
 */
@Data
@ToString
public class User implements Serializable {

	private static final long serialVersionUID = 2631599305164110295L;

	/**
     * column tb_user.USER_ID
     */
    private String id;

    /**
     * column tb_user.USER_NAME
     */
    private String name;

    /**
     * column tb_user.USER_NICKNAME
     */
    private String nickname;

    /**
     * Database Column Remarks:
     *   암호화필요
     * column tb_user.USER_PASSWORD
     */
    private String password;

    /**
     * column tb_user.USER_EMAIL
     */
    private String email;

    /**
     * Database Column Remarks:
     *   YYYY-MM-DD HH:MM:SS
     * column tb_user.CREATE_DATE
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   YYYY-MM-DD HH:MM:SS
     * column tb_user.MODIFY_DATE
     */
    private Date modifyDate;
}