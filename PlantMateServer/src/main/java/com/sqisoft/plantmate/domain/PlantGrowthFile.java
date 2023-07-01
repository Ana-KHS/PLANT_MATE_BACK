/*
 * 
 */
package com.sqisoft.plantmate.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * table tb_plant_growth_file
 * 
 * @author jynius
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class PlantGrowthFile extends PlantGrowthFileKey {

	private static final long serialVersionUID = -7241359397522704764L;
	/**
     * column tb_plant_growth_file.FILEID
     */
    private Integer fileid;
}