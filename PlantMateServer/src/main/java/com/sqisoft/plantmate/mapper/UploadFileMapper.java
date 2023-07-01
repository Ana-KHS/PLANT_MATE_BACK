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

import com.sqisoft.plantmate.domain.UploadFile;
import com.sqisoft.plantmate.domain.UploadFileFilter;

/**
 * @author jynius
 */
@Mapper
public interface UploadFileMapper {
	
    /**
     * table tb_file
     */
    @SelectProvider(type=UploadFileSqlProvider.class, method="countByFilter")
    long countByFilter(UploadFileFilter filter);

    /**
     * table tb_file
     */
    @SelectProvider(type=UploadFileSqlProvider.class, method="selectByFilter")
    @Results({
        @Result(column="FILEID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FILENAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILEPATH", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILESIZE", property="size", jdbcType=JdbcType.INTEGER),
        @Result(column="USERFILENAME", property="userfilename", jdbcType=JdbcType.VARCHAR)
    })
    List<UploadFile> selectByFilter(UploadFileFilter filter);

    /**
     * table tb_file
     */
    @Select({
        "select",
        "FILEID, FILENAME, FILEPATH, FILESIZE, USERFILENAME",
        "from tb_file",
        "where FILEID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="FILEID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FILENAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILEPATH", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILESIZE", property="size", jdbcType=JdbcType.INTEGER),
        @Result(column="USERFILENAME", property="userfilename", jdbcType=JdbcType.VARCHAR)
    })
    UploadFile selectByPrimaryKey(Integer id);

    /**
     * table tb_file
     */
    @Insert({
        "insert into tb_file (FILEID, FILENAME, ",
        "FILEPATH, FILESIZE, USERFILENAME)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{path,jdbcType=VARCHAR}, #{size,jdbcType=INTEGER}, #{userfilename,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="select coalesce(max(FILEID), 0) + 1 from tb_file", keyProperty="id", before=true, resultType=Integer.class)
    int insert(UploadFile row);

    /**
     * table tb_file
     */
    @InsertProvider(type=UploadFileSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select coalesce(max(FILEID), 0) + 1 from tb_file", keyProperty="id", before=true, resultType=Integer.class)
    int insertSelective(UploadFile row);

    /**
     * table tb_file
     */
    @UpdateProvider(type=UploadFileSqlProvider.class, method="updateByFilterSelective")
    int updateByFilterSelective(@Param("row") UploadFile row, @Param("example") UploadFileFilter filter);

    /**
     * table tb_file
     */
    @UpdateProvider(type=UploadFileSqlProvider.class, method="updateByFilter")
    int updateByFilter(@Param("row") UploadFile row, @Param("example") UploadFileFilter filter);

    /**
     * table tb_file
     */
    @UpdateProvider(type=UploadFileSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UploadFile row);

    /**
     * table tb_file
     */
    @Update({
        "update tb_file",
        "set FILENAME = #{name,jdbcType=VARCHAR},",
          "FILEPATH = #{path,jdbcType=VARCHAR},",
          "FILESIZE = #{size,jdbcType=INTEGER},",
          "USERFILENAME = #{userfilename,jdbcType=VARCHAR}",
        "where FILEID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UploadFile row);

    /**
     * table tb_file
     */
    @DeleteProvider(type=UploadFileSqlProvider.class, method="deleteByFilter")
    int deleteByFilter(UploadFileFilter filter);

    /**
     * table tb_file
     */
    @Delete({
        "delete from tb_file",
        "where FILEID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);
}