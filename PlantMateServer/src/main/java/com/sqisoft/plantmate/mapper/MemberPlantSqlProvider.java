/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.sqisoft.plantmate.domain.MemberPlant;
import com.sqisoft.plantmate.domain.MemberPlantFilter;

/**
 * @author jynius
 */
public class MemberPlantSqlProvider extends BaseSqlProvider {

    /**
     * table tb_member_plant
     */
    public String countByFilter(MemberPlantFilter example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_member_plant");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * table tb_member_plant
     */
    public String selectByFilter(MemberPlantFilter example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("PLANTID");
        } else {
            sql.SELECT("PLANTID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("NAME");
        sql.SELECT("NICKNAME");
        sql.SELECT("MEMO");
        sql.SELECT("THUMBNAIL");
        sql.SELECT("START_DATE");
        sql.SELECT("WATER_ALARM");
        sql.SELECT("WATER_CYCLE");
        sql.SELECT("LAST_WATER_DATE");
        sql.SELECT("CREATE_DATE");
        sql.SELECT("MODIFY_DATE");
        sql.FROM("tb_member_plant");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * table tb_member_plant
     */
    public String insertSelective(MemberPlant row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_member_plant");
        
        sql.VALUES("PLANTID", "#{id,jdbcType=INTEGER}");
        
        if (row.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (row.getNickname() != null) {
            sql.VALUES("NICKNAME", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (row.getMemo() != null) {
            sql.VALUES("MEMO", "#{memo,jdbcType=VARCHAR}");
        }
        
        if (row.getThumbnail() != null) {
            sql.VALUES("THUMBNAIL", "#{thumbnail,jdbcType=VARCHAR}");
        }
        
        if (row.getStartDate() != null) {
            sql.VALUES("START_DATE", "#{startDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getWaterAlarm() != null) {
            sql.VALUES("WATER_ALARM", "#{waterAlarm,jdbcType=VARCHAR}");
        }
        
        if (row.getWaterCycle() != null) {
            sql.VALUES("WATER_CYCLE", "#{waterCycle,jdbcType=INTEGER}");
        }
        
        if (row.getLastWaterDate() != null) {
            sql.VALUES("LAST_WATER_DATE", "#{lastWaterDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCreateDate() != null) {
            sql.VALUES("CREATE_DATE", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.VALUES("MODIFY_DATE", "#{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * table tb_member_plant
     */
    public String updateByFilterSelective(Map<String, Object> parameter) {
        MemberPlant row = (MemberPlant) parameter.get("row");
        MemberPlantFilter example = (MemberPlantFilter) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_member_plant");
        
        if (row.getId() != null) {
            sql.SET("PLANTID = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getUserId() != null) {
            sql.SET("USER_ID = #{row.userId,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.SET("NAME = #{row.name,jdbcType=VARCHAR}");
        }
        
        if (row.getNickname() != null) {
            sql.SET("NICKNAME = #{row.nickname,jdbcType=VARCHAR}");
        }
        
        if (row.getMemo() != null) {
            sql.SET("MEMO = #{row.memo,jdbcType=VARCHAR}");
        }
        
        if (row.getThumbnail() != null) {
            sql.SET("THUMBNAIL = #{row.thumbnail,jdbcType=VARCHAR}");
        }
        
        if (row.getStartDate() != null) {
            sql.SET("START_DATE = #{row.startDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getWaterAlarm() != null) {
            sql.SET("WATER_ALARM = #{row.waterAlarm,jdbcType=VARCHAR}");
        }
        
        if (row.getWaterCycle() != null) {
            sql.SET("WATER_CYCLE = #{row.waterCycle,jdbcType=INTEGER}");
        }
        
        if (row.getLastWaterDate() != null) {
            sql.SET("LAST_WATER_DATE = #{row.lastWaterDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCreateDate() != null) {
            sql.SET("CREATE_DATE = #{row.createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.SET("MODIFY_DATE = #{row.modifyDate,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_member_plant
     */
    public String updateByFilter(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_member_plant");
        
        sql.SET("PLANTID = #{row.id,jdbcType=INTEGER}");
        sql.SET("USER_ID = #{row.userId,jdbcType=VARCHAR}");
        sql.SET("NAME = #{row.name,jdbcType=VARCHAR}");
        sql.SET("NICKNAME = #{row.nickname,jdbcType=VARCHAR}");
        sql.SET("MEMO = #{row.memo,jdbcType=VARCHAR}");
        sql.SET("THUMBNAIL = #{row.thumbnail,jdbcType=VARCHAR}");
        sql.SET("START_DATE = #{row.startDate,jdbcType=TIMESTAMP}");
        sql.SET("WATER_ALARM = #{row.waterAlarm,jdbcType=VARCHAR}");
        sql.SET("WATER_CYCLE = #{row.waterCycle,jdbcType=INTEGER}");
        sql.SET("LAST_WATER_DATE = #{row.lastWaterDate,jdbcType=TIMESTAMP}");
        sql.SET("CREATE_DATE = #{row.createDate,jdbcType=TIMESTAMP}");
        sql.SET("MODIFY_DATE = #{row.modifyDate,jdbcType=TIMESTAMP}");
        
        MemberPlantFilter example = (MemberPlantFilter) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_member_plant
     */
    public String updateByPrimaryKeySelective(MemberPlant row) {
        SQL sql = new SQL();
        sql.UPDATE("tb_member_plant");
        
        if (row.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (row.getNickname() != null) {
            sql.SET("NICKNAME = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (row.getMemo() != null) {
            sql.SET("MEMO = #{memo,jdbcType=VARCHAR}");
        }
        
        if (row.getThumbnail() != null) {
            sql.SET("THUMBNAIL = #{thumbnail,jdbcType=VARCHAR}");
        }
        
        if (row.getStartDate() != null) {
            sql.SET("START_DATE = #{startDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getWaterAlarm() != null) {
            sql.SET("WATER_ALARM = #{waterAlarm,jdbcType=VARCHAR}");
        }
        
        if (row.getWaterCycle() != null) {
            sql.SET("WATER_CYCLE = #{waterCycle,jdbcType=INTEGER}");
        }
        
        if (row.getLastWaterDate() != null) {
            sql.SET("LAST_WATER_DATE = #{lastWaterDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCreateDate() != null) {
            sql.SET("CREATE_DATE = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.SET("MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("PLANTID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * table tb_member_plant
     */
    public String deleteByFilter(MemberPlantFilter example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_member_plant");
        applyWhere(sql, example, false);
        return sql.toString();
    }
}