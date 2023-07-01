/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.sqisoft.plantmate.domain.PlantRecord;
import com.sqisoft.plantmate.domain.PlantRecordFilter;

/**
 * @author jynius
 */
public class PlantRecordSqlProvider extends BaseSqlProvider {

    /**
     * table tb_plant_record
     */
    public String countByFilter(PlantRecordFilter example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_plant_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * table tb_plant_record
     */
    public String selectByFilter(PlantRecordFilter example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("RECORD_ID");
        } else {
            sql.SELECT("RECORD_ID");
        }
        sql.SELECT("PLANT_ID");
        sql.SELECT("TITLE");
        sql.SELECT("DATE");
        sql.SELECT("LENGTH");
        sql.SELECT("LEAF_COUNT");
        sql.SELECT("GROWTH_STATUS");
        sql.SELECT("WATER_SUPPLY");
        sql.SELECT("SOIL_TYPE");
        sql.SELECT("FERTILIZER_TYPE");
        sql.SELECT("TEMPERATURE");
        sql.SELECT("HUMIDITY");
        sql.SELECT("GROWTH_CONTENT");
        sql.SELECT("REMARKS");
        sql.FROM("tb_plant_record");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * table tb_plant_record
     */
    public String updateByFilterSelective(Map<String, Object> parameter) {
        PlantRecord row = (PlantRecord) parameter.get("row");
        PlantRecordFilter example = (PlantRecordFilter) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_plant_record");
        
        if (row.getId() != null) {
            sql.SET("RECORD_ID = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getPlantId() != null) {
            sql.SET("PLANT_ID = #{row.plantId,jdbcType=INTEGER}");
        }
        
        if (row.getTitle() != null) {
            sql.SET("TITLE = #{row.title,jdbcType=VARCHAR}");
        }
        
        if (row.getDate() != null) {
            sql.SET("DATE = #{row.date,jdbcType=TIMESTAMP}");
        }
        
        if (row.getLength() != null) {
            sql.SET("LENGTH = #{row.length,jdbcType=INTEGER}");
        }
        
        if (row.getLeafCount() != null) {
            sql.SET("LEAF_COUNT = #{row.leafCount,jdbcType=INTEGER}");
        }
        
        if (row.getGrowthStatus() != null) {
            sql.SET("GROWTH_STATUS = #{row.growthStatus,jdbcType=VARCHAR}");
        }
        
        if (row.getWaterSupply() != null) {
            sql.SET("WATER_SUPPLY = #{row.waterSupply,jdbcType=INTEGER}");
        }
        
        if (row.getSoilType() != null) {
            sql.SET("SOIL_TYPE = #{row.soilType,jdbcType=VARCHAR}");
        }
        
        if (row.getFertilizerType() != null) {
            sql.SET("FERTILIZER_TYPE = #{row.fertilizerType,jdbcType=VARCHAR}");
        }
        
        if (row.getTemperature() != null) {
            sql.SET("TEMPERATURE = #{row.temperature,jdbcType=INTEGER}");
        }
        
        if (row.getHumidity() != null) {
            sql.SET("HUMIDITY = #{row.humidity,jdbcType=INTEGER}");
        }
        
        if (row.getGrowthContent() != null) {
            sql.SET("GROWTH_CONTENT = #{row.growthContent,jdbcType=VARCHAR}");
        }
        
        if (row.getRemarks() != null) {
            sql.SET("REMARKS = #{row.remarks,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_plant_record
     */
    public String insertSelective(PlantRecord row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_plant_record");
        
        sql.VALUES("RECORD_ID", "#{id,jdbcType=INTEGER}");
        
        if (row.getPlantId() != null) {
            sql.VALUES("PLANT_ID", "#{plantId,jdbcType=INTEGER}");
        }
        
        if (row.getTitle() != null) {
            sql.VALUES("TITLE", "#{title,jdbcType=VARCHAR}");
        }
        
        if (row.getDate() != null) {
            sql.VALUES("DATE", "#{date,jdbcType=TIMESTAMP}");
        }
        
        if (row.getLength() != null) {
            sql.VALUES("LENGTH", "#{length,jdbcType=INTEGER}");
        }
        
        if (row.getLeafCount() != null) {
            sql.VALUES("LEAF_COUNT", "#{leafCount,jdbcType=INTEGER}");
        }
        
        if (row.getGrowthStatus() != null) {
            sql.VALUES("GROWTH_STATUS", "#{growthStatus,jdbcType=VARCHAR}");
        }
        
        if (row.getWaterSupply() != null) {
            sql.VALUES("WATER_SUPPLY", "#{waterSupply,jdbcType=INTEGER}");
        }
        
        if (row.getSoilType() != null) {
            sql.VALUES("SOIL_TYPE", "#{soilType,jdbcType=VARCHAR}");
        }
        
        if (row.getFertilizerType() != null) {
            sql.VALUES("FERTILIZER_TYPE", "#{fertilizerType,jdbcType=VARCHAR}");
        }
        
        if (row.getTemperature() != null) {
            sql.VALUES("TEMPERATURE", "#{temperature,jdbcType=INTEGER}");
        }
        
        if (row.getHumidity() != null) {
            sql.VALUES("HUMIDITY", "#{humidity,jdbcType=INTEGER}");
        }
        
        if (row.getGrowthContent() != null) {
            sql.VALUES("GROWTH_CONTENT", "#{growthContent,jdbcType=VARCHAR}");
        }
        
        if (row.getRemarks() != null) {
            sql.VALUES("REMARKS", "#{remarks,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * table tb_plant_record
     */
    public String updateByFilter(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_plant_record");
        
        sql.SET("RECORD_ID = #{row.id,jdbcType=INTEGER}");
        sql.SET("PLANT_ID = #{row.plantId,jdbcType=INTEGER}");
        sql.SET("TITLE = #{row.title,jdbcType=VARCHAR}");
        sql.SET("DATE = #{row.date,jdbcType=TIMESTAMP}");
        sql.SET("LENGTH = #{row.length,jdbcType=INTEGER}");
        sql.SET("LEAF_COUNT = #{row.leafCount,jdbcType=INTEGER}");
        sql.SET("GROWTH_STATUS = #{row.growthStatus,jdbcType=VARCHAR}");
        sql.SET("WATER_SUPPLY = #{row.waterSupply,jdbcType=INTEGER}");
        sql.SET("SOIL_TYPE = #{row.soilType,jdbcType=VARCHAR}");
        sql.SET("FERTILIZER_TYPE = #{row.fertilizerType,jdbcType=VARCHAR}");
        sql.SET("TEMPERATURE = #{row.temperature,jdbcType=INTEGER}");
        sql.SET("HUMIDITY = #{row.humidity,jdbcType=INTEGER}");
        sql.SET("GROWTH_CONTENT = #{row.growthContent,jdbcType=VARCHAR}");
        sql.SET("REMARKS = #{row.remarks,jdbcType=VARCHAR}");
        
        PlantRecordFilter example = (PlantRecordFilter) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_plant_record
     */
    public String updateByPrimaryKeySelective(PlantRecord row) {
        SQL sql = new SQL();
        sql.UPDATE("tb_plant_record");
        
        if (row.getPlantId() != null) {
            sql.SET("PLANT_ID = #{plantId,jdbcType=INTEGER}");
        }
        
        if (row.getTitle() != null) {
            sql.SET("TITLE = #{title,jdbcType=VARCHAR}");
        }
        
        if (row.getDate() != null) {
            sql.SET("DATE = #{date,jdbcType=TIMESTAMP}");
        }
        
        if (row.getLength() != null) {
            sql.SET("LENGTH = #{length,jdbcType=INTEGER}");
        }
        
        if (row.getLeafCount() != null) {
            sql.SET("LEAF_COUNT = #{leafCount,jdbcType=INTEGER}");
        }
        
        if (row.getGrowthStatus() != null) {
            sql.SET("GROWTH_STATUS = #{growthStatus,jdbcType=VARCHAR}");
        }
        
        if (row.getWaterSupply() != null) {
            sql.SET("WATER_SUPPLY = #{waterSupply,jdbcType=INTEGER}");
        }
        
        if (row.getSoilType() != null) {
            sql.SET("SOIL_TYPE = #{soilType,jdbcType=VARCHAR}");
        }
        
        if (row.getFertilizerType() != null) {
            sql.SET("FERTILIZER_TYPE = #{fertilizerType,jdbcType=VARCHAR}");
        }
        
        if (row.getTemperature() != null) {
            sql.SET("TEMPERATURE = #{temperature,jdbcType=INTEGER}");
        }
        
        if (row.getHumidity() != null) {
            sql.SET("HUMIDITY = #{humidity,jdbcType=INTEGER}");
        }
        
        if (row.getGrowthContent() != null) {
            sql.SET("GROWTH_CONTENT = #{growthContent,jdbcType=VARCHAR}");
        }
        
        if (row.getRemarks() != null) {
            sql.SET("REMARKS = #{remarks,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("RECORD_ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * table tb_plant_record
     */
    public String deleteByFilter(PlantRecordFilter example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_plant_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }
}