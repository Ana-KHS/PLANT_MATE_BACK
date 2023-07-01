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

import com.sqisoft.plantmate.domain.Bookmark;
import com.sqisoft.plantmate.domain.BookmarkFilter;

/**
 * @author jynius
 */
@Mapper
public interface BookmarkMapper {
	
    /**
     * table tb_bookmark
     */
    @SelectProvider(type=BookmarkSqlProvider.class, method="countByFilter")
    long countByFilter(BookmarkFilter filter);

    /**
     * table tb_bookmark
     */
    @SelectProvider(type=BookmarkSqlProvider.class, method="selectByFilter")
    @Results({
        @Result(column="BOOKMARKID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMUNITYID", property="communityId", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Bookmark> selectByFilter(BookmarkFilter filter);

    /**
     * table tb_bookmark
     */
    @Select({
        "select",
        "BOOKMARKID, USER_ID, COMMUNITYID, CREATE_DATE, MODIFY_DATE",
        "from tb_bookmark",
        "where BOOKMARKID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="BOOKMARKID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMUNITYID", property="communityId", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP)
    })
    Bookmark selectByPrimaryKey(Integer id);

    /**
     * table tb_bookmark
     */
    @Insert({
        "insert into tb_bookmark (BOOKMARKID, USER_ID, ",
        "COMMUNITYID, CREATE_DATE, ",
        "MODIFY_DATE)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=VARCHAR}, ",
        "#{communityId,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{modifyDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="select coalesce(max(BOOKMARKID), 0) + 1 from tb_bookmark", keyProperty="id", before=true, resultType=Integer.class)
    int insert(Bookmark row);

    /**
     * table tb_bookmark
     */
    @InsertProvider(type=BookmarkSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select coalesce(max(BOOKMARKID), 0) + 1 from tb_bookmark", keyProperty="id", before=true, resultType=Integer.class)
    int insertSelective(Bookmark row);

    /**
     * table tb_bookmark
     */
    @UpdateProvider(type=BookmarkSqlProvider.class, method="updateByFilterSelective")
    int updateByFilterSelective(@Param("row") Bookmark row, @Param("example") BookmarkFilter filter);

    /**
     * table tb_bookmark
     */
    @UpdateProvider(type=BookmarkSqlProvider.class, method="updateByFilter")
    int updateByFilter(@Param("row") Bookmark row, @Param("example") BookmarkFilter filter);

    /**
     * table tb_bookmark
     */
    @UpdateProvider(type=BookmarkSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Bookmark row);

    /**
     * table tb_bookmark
     */
    @Update({
        "update tb_bookmark",
        "set USER_ID = #{userId,jdbcType=VARCHAR},",
          "COMMUNITYID = #{communityId,jdbcType=INTEGER},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP}",
        "where BOOKMARKID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Bookmark row);

    /**
     * table tb_bookmark
     */
    @DeleteProvider(type=BookmarkSqlProvider.class, method="deleteByFilter")
    int deleteByFilter(BookmarkFilter filter);

    /**
     * table tb_bookmark
     */
    @Delete({
        "delete from tb_bookmark",
        "where BOOKMARKID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);
}