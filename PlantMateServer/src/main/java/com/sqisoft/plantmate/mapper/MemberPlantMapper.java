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

import com.sqisoft.plantmate.domain.MemberPlant;
import com.sqisoft.plantmate.domain.MemberPlantFilter;

/**
 * @author jynius
 */
@Mapper
public interface MemberPlantMapper {
	
    /**
     * table tb_member_plant
     */
    @SelectProvider(type=MemberPlantSqlProvider.class, method="countByFilter")
    long countByFilter(MemberPlantFilter filter);

    /**
     * table tb_member_plant
     */
    @SelectProvider(type=MemberPlantSqlProvider.class, method="selectByFilter")
    @Results({
        @Result(column="PLANTID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="NICKNAME", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MEMO", property="memo", jdbcType=JdbcType.VARCHAR),
        @Result(column="THUMBNAIL", property="thumbnail", jdbcType=JdbcType.VARCHAR),
        @Result(column="START_DATE", property="startDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="WATER_ALARM", property="waterAlarm", jdbcType=JdbcType.VARCHAR),
        @Result(column="WATER_CYCLE", property="waterCycle", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_WATER_DATE", property="lastWaterDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MemberPlant> selectByFilter(MemberPlantFilter filter);

    /**
     * table tb_member_plant
     */
    @Select({
        "select",
        "PLANTID, USER_ID, NAME, NICKNAME, MEMO, THUMBNAIL, START_DATE, WATER_ALARM, ",
        "WATER_CYCLE, LAST_WATER_DATE, CREATE_DATE, MODIFY_DATE",
        "from tb_member_plant",
        "where PLANTID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="PLANTID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="NICKNAME", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MEMO", property="memo", jdbcType=JdbcType.VARCHAR),
        @Result(column="THUMBNAIL", property="thumbnail", jdbcType=JdbcType.VARCHAR),
        @Result(column="START_DATE", property="startDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="WATER_ALARM", property="waterAlarm", jdbcType=JdbcType.VARCHAR),
        @Result(column="WATER_CYCLE", property="waterCycle", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_WATER_DATE", property="lastWaterDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP)
    })
    MemberPlant selectByPrimaryKey(Integer id);

    /**
     * table tb_member_plant
     */
    @Insert({
        "insert into tb_member_plant (",
        "  PLANTID, USER_ID, NAME, NICKNAME,",
        "  MEMO, THUMBNAIL, START_DATE,",
        "  WATER_ALARM, WATER_CYCLE, LAST_WATER_DATE,",
        "  CREATE_DATE, MODIFY_DATE",
        ")",
        "values (",
        "  #{id,jdbcType=INTEGER}, #{userId,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR},",
        "  #{memo,jdbcType=VARCHAR}, #{thumbnail,jdbcType=VARCHAR}, #{startDate,jdbcType=TIMESTAMP},",
        "  #{waterAlarm,jdbcType=VARCHAR}, #{waterCycle,jdbcType=INTEGER}, #{lastWaterDate,jdbcType=TIMESTAMP},",
        "  current_timestamp, current_timestamp",
        ")"
    })
    @SelectKey(statement="select coalesce(max(PLANTID), 0) + 1 from tb_member_plant", keyProperty="id", before=true, resultType=Integer.class)
    int insert(MemberPlant row);

    /**
     * table tb_member_plant
     */
    @InsertProvider(type=MemberPlantSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select coalesce(max(PLANTID), 0) + 1 from tb_member_plant", keyProperty="id", before=true, resultType=Integer.class)
    int insertSelective(MemberPlant row);

    /**
     * table tb_member_plant
     */
    @UpdateProvider(type=MemberPlantSqlProvider.class, method="updateByFilterSelective")
    int updateByFilterSelective(@Param("row") MemberPlant row, @Param("example") MemberPlantFilter filter);

    /**
     * table tb_member_plant
     */
    @UpdateProvider(type=MemberPlantSqlProvider.class, method="updateByFilter")
    int updateByFilter(@Param("row") MemberPlant row, @Param("example") MemberPlantFilter filter);

    /**
     * table tb_member_plant
     */
    @UpdateProvider(type=MemberPlantSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MemberPlant row);

    /**
     * table tb_member_plant
     */
    @Update({
        "update tb_member_plant",
        "set USER_ID = #{userId,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "NICKNAME = #{nickname,jdbcType=VARCHAR},",
          "MEMO = #{memo,jdbcType=VARCHAR},",
          "THUMBNAIL = #{thumbnail,jdbcType=VARCHAR},",
          "START_DATE = #{startDate,jdbcType=TIMESTAMP},",
          "WATER_ALARM = #{waterAlarm,jdbcType=VARCHAR},",
          "WATER_CYCLE = #{waterCycle,jdbcType=INTEGER},",
          "LAST_WATER_DATE = #{lastWaterDate,jdbcType=TIMESTAMP},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP}",
        "where PLANTID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MemberPlant row);

    /**
     * table tb_member_plant
     */
    @DeleteProvider(type=MemberPlantSqlProvider.class, method="deleteByFilter")
    int deleteByFilter(MemberPlantFilter filter);

    /**
     * table tb_member_plant
     */
    @Delete({
        "delete from tb_member_plant",
        "where PLANTID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);
}