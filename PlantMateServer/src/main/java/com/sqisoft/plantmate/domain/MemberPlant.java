/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**
 * table tb_member_plant
 * 
 * @author jynius
 */
@Data
@ToString
public class MemberPlant implements Serializable {

	private static final long serialVersionUID = 6059069447333325908L;

	/**
     * column tb_member_plant.PLANTID
     */
    private Integer id;

    /**
     * column tb_member_plant.USER_ID
     */
    private String userId;

    /**
     * column tb_member_plant.NAME
     */
    private String name;

    /**
     * column tb_member_plant.NICKNAME
     */
    private String nickname;

    /**
     * column tb_member_plant.MEMO
     */
    private String memo;

    /**
     * column tb_member_plant.THUMBNAIL
     */
    private String thumbnail;

    /**
     * column tb_member_plant.START_DATE
     */
    private Date startDate;

    /**
     * Database Column Remarks:
     *   Y / N (ON/OFF)
     * column tb_member_plant.WATER_ALARM
     */
    private String waterAlarm;

    /**
     * column tb_member_plant.WATER_CYCLE
     */
    private Integer waterCycle;

    /**
     * column tb_member_plant.LAST_WATER_DATE
     */
    private Date lastWaterDate;

    /**
     * column tb_member_plant.CREATE_DATE
     */
    private Date createDate;

    /**
     * column tb_member_plant.MODIFY_DATE
     */
    private Date modifyDate;
}