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

import com.sqisoft.plantmate.domain.Comment;
import com.sqisoft.plantmate.domain.CommentFilter;

/**
 * @author jynius
 */
@Mapper
public interface CommentMapper {
	
    /**
     * table tb_comment
     */
    @SelectProvider(type=CommentSqlProvider.class, method="countByFilter")
    long countByFilter(CommentFilter filter);

    /**
     * table tb_comment
     */
    @SelectProvider(type=CommentSqlProvider.class, method="selectByFilter")
    @Results({
        @Result(column="COMMENTID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="COMMUNITYID", property="communityId", jdbcType=JdbcType.INTEGER),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FILEID", property="fileId", jdbcType=JdbcType.INTEGER)
    })
    List<Comment> selectByFilter(CommentFilter filter);

    /**
     * table tb_comment
     */
    @Select({
        "select",
        "COMMENTID, COMMUNITYID, USER_ID, COMMENT, CREATE_DATE, MODIFY_DATE, FILEID",
        "from tb_comment",
        "where COMMENTID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="COMMENTID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="COMMUNITYID", property="communityId", jdbcType=JdbcType.INTEGER),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FILEID", property="fileId", jdbcType=JdbcType.INTEGER)
    })
    Comment selectByPrimaryKey(Integer id);

    /**
     * table tb_comment
     */
    @Insert({
        "insert into tb_comment (COMMENTID, COMMUNITYID, ",
        "USER_ID, COMMENT, ",
        "CREATE_DATE, MODIFY_DATE, ",
        "FILEID)",
        "values (#{id,jdbcType=INTEGER}, #{communityId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=VARCHAR}, #{comment,jdbcType=VARCHAR}, ",
        "  current_timestamp, current_timestamp,",
        "#{fileId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="select coalesce(max(COMMENTID), 0) + 1 from tb_comment", keyProperty="id", before=true, resultType=Integer.class)
    int insert(Comment row);

    /**
     * table tb_comment
     */
    @InsertProvider(type=CommentSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select coalesce(max(COMMENTID), 0) + 1 from tb_comment", keyProperty="id", before=true, resultType=Integer.class)
    int insertSelective(Comment row);

    /**
     * table tb_comment
     */
    @UpdateProvider(type=CommentSqlProvider.class, method="updateByFilterSelective")
    int updateByFilterSelective(@Param("row") Comment row, @Param("example") CommentFilter filter);

    /**
     * table tb_comment
     */
    @UpdateProvider(type=CommentSqlProvider.class, method="updateByFilter")
    int updateByFilter(@Param("row") Comment row, @Param("example") CommentFilter filter);

    /**
     * table tb_comment
     */
    @UpdateProvider(type=CommentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Comment row);

    /**
     * table tb_comment
     */
    @Update({
        "update tb_comment",
        "set COMMUNITYID = #{communityId,jdbcType=INTEGER},",
          "USER_ID = #{userId,jdbcType=VARCHAR},",
          "COMMENT = #{comment,jdbcType=VARCHAR},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP},",
          "FILEID = #{fileId,jdbcType=INTEGER}",
        "where COMMENTID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Comment row);

    /**
     * table tb_comment
     */
    @DeleteProvider(type=CommentSqlProvider.class, method="deleteByFilter")
    int deleteByFilter(CommentFilter filter);

    /**
     * table tb_comment
     */
    @Delete({
        "delete from tb_comment",
        "where COMMENTID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);
}