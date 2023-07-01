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
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.sqisoft.plantmate.domain.User;
import com.sqisoft.plantmate.domain.UserFilter;

/**
 * @author jynius
 */
@Mapper
public interface UserMapper {
	
    /**
     * table tb_user
     */
    @SelectProvider(type=UserSqlProvider.class, method="countByFilter")
    long countByFilter(UserFilter filter);

    /**
     * table tb_user
     */
    @SelectProvider(type=UserSqlProvider.class, method="selectByFilter")
    @Results({
        @Result(column="USER_ID", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_NICKNAME", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<User> selectByFilter(UserFilter filter);

    /**
     * table tb_user
     */
    @Select({
        "select",
        "USER_ID, USER_NAME, USER_NICKNAME, USER_PASSWORD, USER_EMAIL, CREATE_DATE, MODIFY_DATE",
        "from tb_user",
        "where USER_ID = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="USER_ID", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_NICKNAME", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP)
    })
    User selectByPrimaryKey(String id);

    /**
     * table tb_user
     */
    @Insert({
        "insert into tb_user (",
        "  USER_ID, USER_NAME, USER_PASSWORD,",
        "  USER_NICKNAME, USER_EMAIL,",
        "  CREATE_DATE, MODIFY_DATE",
        ")",
        "values (",
        "  #{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR},",
        "  #{nickname,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR},",
        "  current_timestamp, current_timestamp",
        ")"
    })
    int insert(User row);

    /**
     * table tb_user
     */
    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User row);

    /**
     * table tb_user
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByFilterSelective")
    int updateByFilterSelective(@Param("row") User row, @Param("example") UserFilter filter);

    /**
     * table tb_user
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByFilter")
    int updateByFilter(@Param("row") User row, @Param("example") UserFilter filter);

    /**
     * table tb_user
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User row);

    /**
     * table tb_user
     */
    @Update({
        "update tb_user",
        "set USER_NAME = #{name,jdbcType=VARCHAR},",
          "USER_NICKNAME = #{nickname,jdbcType=VARCHAR},",
          "USER_PASSWORD = #{password,jdbcType=VARCHAR},",
          "USER_EMAIL = #{email,jdbcType=VARCHAR},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP}",
        "where USER_ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User row);

    /**
     * table tb_user
     */
    @DeleteProvider(type=UserSqlProvider.class, method="deleteByFilter")
    int deleteByFilter(UserFilter filter);

    /**
     * table tb_user
     */
    @Delete({
        "delete from tb_user",
        " where USER_ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);
}