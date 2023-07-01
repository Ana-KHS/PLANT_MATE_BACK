/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.sqisoft.plantmate.domain.PlantGrowthFileFilter;
import com.sqisoft.plantmate.domain.PlantGrowthFileKey;

/**
 * @author jynius
 */
public class PlantGrowthFileSqlProvider extends BaseSqlProvider {

    /**
     * table tb_plant_growth_file
     */
    public String countByFilter(PlantGrowthFileFilter example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_plant_growth_file");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * table tb_plant_growth_file
     */
    public String selectByFilter(PlantGrowthFileFilter example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("RECORD_ID");
        } else {
            sql.SELECT("RECORD_ID");
        }
        sql.SELECT("FILEID");
        sql.FROM("tb_plant_growth_file");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * table tb_plant_growth_file
     */
    public String insertSelective(PlantGrowthFileKey row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_plant_growth_file");
        
        if (row.getRecordId() != null) {
            sql.VALUES("RECORD_ID", "#{recordId,jdbcType=INTEGER}");
        }
        
        if (row.getFileId() != null) {
            sql.VALUES("FILEID", "#{fileId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * table tb_plant_growth_file
     */
    public String updateByFilterSelective(Map<String, Object> parameter) {
        PlantGrowthFileKey row = (PlantGrowthFileKey) parameter.get("row");
        PlantGrowthFileFilter example = (PlantGrowthFileFilter) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_plant_growth_file");
        
        if (row.getRecordId() != null) {
            sql.SET("RECORD_ID = #{row.recordId,jdbcType=INTEGER}");
        }
        
        if (row.getFileId() != null) {
            sql.SET("FILEID = #{row.fileId,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_plant_growth_file
     */
    public String updateByFilter(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_plant_growth_file");
        
        sql.SET("RECORD_ID = #{row.recordId,jdbcType=INTEGER}");
        sql.SET("FILEID = #{row.fileId,jdbcType=INTEGER}");
        
        PlantGrowthFileFilter example = (PlantGrowthFileFilter) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_plant_growth_file
     */
    public String deleteByFilter(PlantGrowthFileFilter example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_plant_growth_file");
        applyWhere(sql, example, false);
        return sql.toString();
    }
}