package com.sqisoft.plantmate.mapper;

import com.sqisoft.plantmate.domain.PlantGrowthFile;
import com.sqisoft.plantmate.domain.PlantGrowthFileFilter;
import com.sqisoft.plantmate.domain.PlantGrowthFileKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PlantGrowthFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @SelectProvider(type=PlantGrowthFileSqlProvider.class, method="countByExample")
    long countByExample(PlantGrowthFileFilter example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @DeleteProvider(type=PlantGrowthFileSqlProvider.class, method="deleteByExample")
    int deleteByExample(PlantGrowthFileFilter example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @Delete({
        "delete from tb_plant_growth_file",
        "where GROWTHFILEID = #{growthfileid,jdbcType=INTEGER}",
          "and GROWTHID = #{growthid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(PlantGrowthFileKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @Insert({
        "insert into tb_plant_growth_file (GROWTHFILEID, GROWTHID, ",
        "FILEID)",
        "values (#{growthfileid,jdbcType=INTEGER}, #{growthid,jdbcType=INTEGER}, ",
        "#{fileid,jdbcType=INTEGER})"
    })
    int insert(PlantGrowthFile row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @InsertProvider(type=PlantGrowthFileSqlProvider.class, method="insertSelective")
    int insertSelective(PlantGrowthFile row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @SelectProvider(type=PlantGrowthFileSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GROWTHFILEID", property="growthfileid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="GROWTHID", property="growthid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FILEID", property="fileid", jdbcType=JdbcType.INTEGER)
    })
    List<PlantGrowthFile> selectByExample(PlantGrowthFileFilter example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "GROWTHFILEID, GROWTHID, FILEID",
        "from tb_plant_growth_file",
        "where GROWTHFILEID = #{growthfileid,jdbcType=INTEGER}",
          "and GROWTHID = #{growthid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="GROWTHFILEID", property="growthfileid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="GROWTHID", property="growthid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FILEID", property="fileid", jdbcType=JdbcType.INTEGER)
    })
    PlantGrowthFile selectByPrimaryKey(PlantGrowthFileKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PlantGrowthFileSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") PlantGrowthFile row, @Param("example") PlantGrowthFileFilter example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PlantGrowthFileSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") PlantGrowthFile row, @Param("example") PlantGrowthFileFilter example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PlantGrowthFileSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PlantGrowthFile row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_growth_file
     *
     * @mbg.generated
     */
    @Update({
        "update tb_plant_growth_file",
        "set FILEID = #{fileid,jdbcType=INTEGER}",
        "where GROWTHFILEID = #{growthfileid,jdbcType=INTEGER}",
          "and GROWTHID = #{growthid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PlantGrowthFile row);
}