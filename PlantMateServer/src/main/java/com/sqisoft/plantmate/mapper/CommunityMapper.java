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

import com.sqisoft.plantmate.domain.Community;
import com.sqisoft.plantmate.domain.CommunityFilter;

/**
 * @author jynius
 */
@Mapper
public interface CommunityMapper {
	
    /**
     * table tb_community
     */
    @SelectProvider(type=CommunitySqlProvider.class, method="countByFilter")
    long countByFilter(CommunityFilter filter);

    /**
     * table tb_community
     */
    @SelectProvider(type=CommunitySqlProvider.class, method="selectByFilter")
    @Results({
        @Result(column="COMMUNITYID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONTENT", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CATEGORYID", property="categoryId", jdbcType=JdbcType.CHAR),
        @Result(column="FILEID", property="fileId", jdbcType=JdbcType.INTEGER),
        @Result(column="PLANTID", property="plantId", jdbcType=JdbcType.INTEGER)
    })
    List<Community> selectByFilter(CommunityFilter filter);

    /**
     * table tb_community
     */
    @Select({
        "select",
        "COMMUNITYID, TITLE, CONTENT, CREATE_DATE, MODIFY_DATE, CATEGORYID, FILEID, PLANTID",
        "from tb_community",
        "where COMMUNITYID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="COMMUNITYID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONTENT", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CATEGORYID", property="categoryId", jdbcType=JdbcType.CHAR),
        @Result(column="FILEID", property="fileId", jdbcType=JdbcType.INTEGER),
        @Result(column="PLANTID", property="plantId", jdbcType=JdbcType.INTEGER)
    })
    Community selectByPrimaryKey(Integer id);

    /**
     * table tb_community
     */
    @Insert({
        "insert into tb_community (",
        "  PLANTID,",
        "  CATEGORYID, FILEID,",
        "  TITLE, CONTENT,",
        "  CREATE_DATE, MODIFY_DATE",
        ")",
        "values (",
        "  #{plantId,jdbcType=INTEGER},",
        "  #{categoryId,jdbcType=CHAR}, #{fileId,jdbcType=INTEGER},",
        "  #{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR},",
        "  current_timestamp, current_timestamp",
        ")"
    })
    @SelectKey(statement="select last_insert_id()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Community row);

    /**
     * table tb_community
     */
    @InsertProvider(type=CommunitySqlProvider.class, method="insertSelective")
    @SelectKey(statement="select coalesce(max(COMMUNITYID), 0) + 1 from tb_community", keyProperty="id", before=true, resultType=Integer.class)
    int insertSelective(Community row);

    /**
     * table tb_community
     */
    @UpdateProvider(type=CommunitySqlProvider.class, method="updateByFilterSelective")
    int updateByFilterSelective(@Param("row") Community row, @Param("example") CommunityFilter filter);

    /**
     * table tb_community
     */
    @UpdateProvider(type=CommunitySqlProvider.class, method="updateByFilter")
    int updateByFilter(@Param("row") Community row, @Param("example") CommunityFilter filter);

    /**
     * table tb_community
     */
    @UpdateProvider(type=CommunitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Community row);

    /**
     * table tb_community
     */
    @Update({
        "update tb_community",
        "set TITLE = #{title,jdbcType=VARCHAR},",
          "CONTENT = #{content,jdbcType=VARCHAR},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP},",
          "CATEGORYID = #{categoryId,jdbcType=CHAR},",
          "FILEID = #{fileId,jdbcType=INTEGER},",
          "PLANTID = #{plantId,jdbcType=INTEGER}",
        "where COMMUNITYID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Community row);

    /**
     * table tb_community
     */
    @DeleteProvider(type=CommunitySqlProvider.class, method="deleteByFilter")
    int deleteByFilter(CommunityFilter filter);

    /**
     * table tb_community
     */
    @Delete({
        "delete from tb_community",
        "where COMMUNITYID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);
}