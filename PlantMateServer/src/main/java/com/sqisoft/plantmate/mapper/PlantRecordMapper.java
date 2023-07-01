/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.sqisoft.plantmate.domain.PlantRecord;
import com.sqisoft.plantmate.domain.PlantRecordFilter;

/**
 * @author jynius
 */
@Mapper
public interface PlantRecordMapper {
	
    /**
     * table tb_plant_record
     */
    @SelectProvider(type=PlantRecordSqlProvider.class, method="countByFilter")
    long countByFilter(PlantRecordFilter filter);

    /**
     * table tb_plant_record
     */
    @SelectProvider(type=PlantRecordSqlProvider.class, method="selectByFilter")
    @Results({
        @Result(column="RECORD_ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PLANT_ID", property="plantId", jdbcType=JdbcType.INTEGER),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATE", property="date", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LENGTH", property="length", jdbcType=JdbcType.INTEGER),
        @Result(column="LEAF_COUNT", property="leafCount", jdbcType=JdbcType.INTEGER),
        @Result(column="GROWTH_STATUS", property="growthStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="WATER_SUPPLY", property="waterSupply", jdbcType=JdbcType.INTEGER),
        @Result(column="SOIL_TYPE", property="soilType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FERTILIZER_TYPE", property="fertilizerType", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEMPERATURE", property="temperature", jdbcType=JdbcType.INTEGER),
        @Result(column="HUMIDITY", property="humidity", jdbcType=JdbcType.INTEGER),
        @Result(column="GROWTH_CONTENT", property="growthContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARKS", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<PlantRecord> selectByFilter(PlantRecordFilter filter);

    /**
     * table tb_plant_record
     */
    @Select({
        "select",
        "RECORD_ID, PLANT_ID, TITLE, DATE, LENGTH, LEAF_COUNT, GROWTH_STATUS, WATER_SUPPLY, ",
        "SOIL_TYPE, FERTILIZER_TYPE, TEMPERATURE, HUMIDITY, GROWTH_CONTENT, REMARKS",
        "from tb_plant_record",
        "where RECORD_ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="RECORD_ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PLANT_ID", property="plantId", jdbcType=JdbcType.INTEGER),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATE", property="date", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LENGTH", property="length", jdbcType=JdbcType.INTEGER),
        @Result(column="LEAF_COUNT", property="leafCount", jdbcType=JdbcType.INTEGER),
        @Result(column="GROWTH_STATUS", property="growthStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="WATER_SUPPLY", property="waterSupply", jdbcType=JdbcType.INTEGER),
        @Result(column="SOIL_TYPE", property="soilType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FERTILIZER_TYPE", property="fertilizerType", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEMPERATURE", property="temperature", jdbcType=JdbcType.INTEGER),
        @Result(column="HUMIDITY", property="humidity", jdbcType=JdbcType.INTEGER),
        @Result(column="GROWTH_CONTENT", property="growthContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARKS", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    PlantRecord selectByPrimaryKey(Integer id);

    /**
     * table tb_plant_record
     */
    @Insert({
        "insert into tb_plant_record (",
        "  RECORD_ID, PLANT_ID, TITLE,",
        "  LENGTH, LEAF_COUNT, GROWTH_STATUS,",
        "  WATER_SUPPLY, SOIL_TYPE, FERTILIZER_TYPE,",
        "  TEMPERATURE, HUMIDITY,",
        "  GROWTH_CONTENT, REMARKS,",
        "  DATE",
        ")",
        "values (",
        "  #{id,jdbcType=INTEGER}, #{plantId,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR},",
        "  #{length,jdbcType=INTEGER}, #{leafCount,jdbcType=INTEGER}, #{growthStatus,jdbcType=VARCHAR},",
        "  #{waterSupply,jdbcType=INTEGER}, #{soilType,jdbcType=VARCHAR}, #{fertilizerType,jdbcType=VARCHAR},",
        "  #{temperature,jdbcType=INTEGER}, #{humidity,jdbcType=INTEGER},",
        "  #{growthContent,jdbcType=VARCHAR}, #{remarks,jdbcType=VARCHAR},",
        "  coalesce(#{date,jdbcType=TIMESTAMP}, current_timestamp)",
        ")"
    })
    @SelectKey(statement="select coalesce(max(RECORD_ID), 0) + 1 from tb_plant_record", keyProperty="id", before=true, resultType=Integer.class)
    int insert(PlantRecord row);

    /**
     * table tb_plant_record
     */
    @InsertProvider(type=PlantRecordSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select coalesce(max(RECORD_ID), 0) + 1 from tb_plant_record", keyProperty="id", before=true, resultType=Integer.class)
    int insertSelective(PlantRecord row);

    /**
     * table tb_plant_record
     */
    @UpdateProvider(type=PlantRecordSqlProvider.class, method="updateByFilterSelective")
    int updateByFilterSelective(@Param("row") PlantRecord row, @Param("example") PlantRecordFilter filter);

    /**
     * table tb_plant_record
     */
    @UpdateProvider(type=PlantRecordSqlProvider.class, method="updateByFilter")
    int updateByFilter(@Param("row") PlantRecord row, @Param("example") PlantRecordFilter filter);

    /**
     * table tb_plant_record
     */
    @UpdateProvider(type=PlantRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PlantRecord row);

    /**
     * table tb_plant_record
     */
    @Update({
        "update tb_plant_record",
        "set PLANT_ID = #{plantId,jdbcType=INTEGER},",
          "TITLE = #{title,jdbcType=VARCHAR},",
          "DATE = #{date,jdbcType=TIMESTAMP},",
          "LENGTH = #{length,jdbcType=INTEGER},",
          "LEAF_COUNT = #{leafCount,jdbcType=INTEGER},",
          "GROWTH_STATUS = #{growthStatus,jdbcType=VARCHAR},",
          "WATER_SUPPLY = #{waterSupply,jdbcType=INTEGER},",
          "SOIL_TYPE = #{soilType,jdbcType=VARCHAR},",
          "FERTILIZER_TYPE = #{fertilizerType,jdbcType=VARCHAR},",
          "TEMPERATURE = #{temperature,jdbcType=INTEGER},",
          "HUMIDITY = #{humidity,jdbcType=INTEGER},",
          "GROWTH_CONTENT = #{growthContent,jdbcType=VARCHAR},",
          "REMARKS = #{remarks,jdbcType=VARCHAR}",
        "where RECORD_ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PlantRecord row);

    /**
     * table tb_plant_record
     */
    @DeleteProvider(type=PlantRecordSqlProvider.class, method="deleteByFilter")
    int deleteByFilter(PlantRecordFilter filter);

    /**
     * table tb_plant_record
     */
    @Delete({
        "delete from tb_plant_record",
        "where RECORD_ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);
}