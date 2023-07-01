/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * table tb_plant_record
 * 
 * @author jynius
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class PlantRecord implements Serializable {

	private static final long serialVersionUID = 5303960794210102516L;

	/**
     * column tb_plant_record.RECORD_ID
     */
    private Integer id;

    /**
     * column tb_plant_record.PLANT_ID
     */
    private Integer plantId;

	/**
     * column tb_plant_record.TITLE
     */
    private String title;

    /**
     * column tb_plant_record.DATE
     */
    private Date date;

    /**
     * column tb_plant_record.LENGTH
     */
    private Integer length;

    /**
     * column tb_plant_record.LEAF_COUNT
     */
    private Integer leafCount;

    /**
     * Database Column Remarks:
     *   씨앗,발아,성장,개화
     * column tb_plant_record.GROWTH_STATUS
     */
    private String growthStatus;

    /**
     * column tb_plant_record.WATER_SUPPLY
     */
    private Integer waterSupply;

    /**
     * Database Column Remarks:
     *   고갈성,진흙,흙
     * column tb_plant_record.SOIL_TYPE
     */
    private String soilType;

    /**
     * Database Column Remarks:
     *   화학비료,유기질비료
     * column tb_plant_record.FERTILIZER_TYPE
     */
    private String fertilizerType;

    /**
     * column tb_plant_record.TEMPERATURE
     */
    private Integer temperature;

    /**
     * column tb_plant_record.HUMIDITY
     */
    private Integer humidity;

    /**
     * column tb_plant_record.GROWTH_CONTENT
     */
    private String growthContent;

    /**
     * column tb_plant_record.REMARKS
     */
    private String remarks;
}