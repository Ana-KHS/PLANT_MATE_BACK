package com.sqisoft.plantmate.domain;

import java.io.Serializable;
/*
 * 
 */
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tb_user
 * 
 * @author jynius
 */
@Data
@ToString
public class User implements Serializable {

	private static final long serialVersionUID = 2631599305164110295L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.USER_ID
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.USER_NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.USER_NICKNAME
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * Database Column Remarks:
     *   암호화필요
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.USER_PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.USER_EMAIL
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   YYYY-MM-DD HH:MM:SS
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.CREATE_DATE
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   YYYY-MM-DD HH:MM:SS
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.MODIFY_DATE
     *
     * @mbg.generated
     */
    private Date modifyDate;
}