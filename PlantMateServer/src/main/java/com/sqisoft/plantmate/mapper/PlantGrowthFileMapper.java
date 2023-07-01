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
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.sqisoft.plantmate.domain.PlantGrowthFileFilter;
import com.sqisoft.plantmate.domain.PlantGrowthFileKey;

/**
 * @author jynius
 */
@Mapper
public interface PlantGrowthFileMapper {
	
    /**
     * table tb_plant_growth_file
     */
    @SelectProvider(type=PlantGrowthFileSqlProvider.class, method="countByFilter")
    long countByFilter(PlantGrowthFileFilter filter);

    /**
     * table tb_plant_growth_file
     */
    @SelectProvider(type=PlantGrowthFileSqlProvider.class, method="selectByFilter")
    @Results({
        @Result(column="RECORD_ID", property="recordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FILEID", property="fileId", jdbcType=JdbcType.INTEGER, id=true)
    })
    List<PlantGrowthFileKey> selectByFilter(PlantGrowthFileFilter filter);

    /**
     * table tb_plant_growth_file
     */
    @Insert({
        "insert into tb_plant_growth_file (RECORD_ID, FILEID)",
        "values (#{recordId,jdbcType=INTEGER}, #{fileId,jdbcType=INTEGER})"
    })
    int insert(PlantGrowthFileKey row);

    /**
     * table tb_plant_growth_file
     */
    @InsertProvider(type=PlantGrowthFileSqlProvider.class, method="insertSelective")
    int insertSelective(PlantGrowthFileKey row);

    /**
     * table tb_plant_growth_file
     */
    @UpdateProvider(type=PlantGrowthFileSqlProvider.class, method="updateByFilterSelective")
    int updateByFilterSelective(@Param("row") PlantGrowthFileKey row, @Param("example") PlantGrowthFileFilter filter);

    /**
     * table tb_plant_growth_file
     */
    @UpdateProvider(type=PlantGrowthFileSqlProvider.class, method="updateByFilter")
    int updateByFilter(@Param("row") PlantGrowthFileKey row, @Param("example") PlantGrowthFileFilter filter);

    /**
     * table tb_plant_growth_file
     */
    @DeleteProvider(type=PlantGrowthFileSqlProvider.class, method="deleteByFilter")
    int deleteByFilter(PlantGrowthFileFilter filter);

    /**
     * table tb_plant_growth_file
     */
    @Delete({
        "delete from tb_plant_growth_file",
        "where RECORD_ID = #{recordId,jdbcType=INTEGER}",
          "and FILEID = #{fileId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(PlantGrowthFileKey key);
}