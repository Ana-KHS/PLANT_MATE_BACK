/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.sqisoft.plantmate.domain.User;
import com.sqisoft.plantmate.domain.UserFilter;

/**
 * @author jynius
 */
public class UserSqlProvider extends BaseSqlProvider {

    /**
     * table tb_user
     */
    public String countByFilter(UserFilter example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * table tb_user
     */
    public String selectByFilter(UserFilter example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USER_ID");
        } else {
            sql.SELECT("USER_ID");
        }
        sql.SELECT("USER_NAME");
        sql.SELECT("USER_NICKNAME");
        sql.SELECT("USER_PASSWORD");
        sql.SELECT("USER_EMAIL");
        sql.SELECT("CREATE_DATE");
        sql.SELECT("MODIFY_DATE");
        sql.FROM("tb_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * table tb_user
     */
    public String insertSelective(User row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_user");
        
        if (row.getId() != null) {
            sql.VALUES("USER_ID", "#{id,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.VALUES("USER_NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (row.getNickname() != null) {
            sql.VALUES("USER_NICKNAME", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (row.getPassword() != null) {
            sql.VALUES("USER_PASSWORD", "#{password,jdbcType=VARCHAR}");
        }
        
        if (row.getEmail() != null) {
            sql.VALUES("USER_EMAIL", "#{email,jdbcType=VARCHAR}");
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
     * table tb_user
     */
    public String updateByFilterSelective(Map<String, Object> parameter) {
        User row = (User) parameter.get("row");
        UserFilter example = (UserFilter) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_user");
        
        if (row.getId() != null) {
            sql.SET("USER_ID = #{row.id,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.SET("USER_NAME = #{row.name,jdbcType=VARCHAR}");
        }
        
        if (row.getNickname() != null) {
            sql.SET("USER_NICKNAME = #{row.nickname,jdbcType=VARCHAR}");
        }
        
        if (row.getPassword() != null) {
            sql.SET("USER_PASSWORD = #{row.password,jdbcType=VARCHAR}");
        }
        
        if (row.getEmail() != null) {
            sql.SET("USER_EMAIL = #{row.email,jdbcType=VARCHAR}");
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
     * table tb_user
     */
    public String updateByFilter(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_user");
        
        sql.SET("USER_ID = #{row.id,jdbcType=VARCHAR}");
        sql.SET("USER_NAME = #{row.name,jdbcType=VARCHAR}");
        sql.SET("USER_NICKNAME = #{row.nickname,jdbcType=VARCHAR}");
        sql.SET("USER_PASSWORD = #{row.password,jdbcType=VARCHAR}");
        sql.SET("USER_EMAIL = #{row.email,jdbcType=VARCHAR}");
        sql.SET("CREATE_DATE = #{row.createDate,jdbcType=TIMESTAMP}");
        sql.SET("MODIFY_DATE = #{row.modifyDate,jdbcType=TIMESTAMP}");
        
        UserFilter example = (UserFilter) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_user
     */
    public String updateByPrimaryKeySelective(User row) {
        SQL sql = new SQL();
        sql.UPDATE("tb_user");
        
        if (row.getName() != null) {
            sql.SET("USER_NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (row.getNickname() != null) {
            sql.SET("USER_NICKNAME = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (row.getPassword() != null) {
            sql.SET("USER_PASSWORD = #{password,jdbcType=VARCHAR}");
        }
        
        if (row.getEmail() != null) {
            sql.SET("USER_EMAIL = #{email,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDate() != null) {
            sql.SET("CREATE_DATE = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.SET("MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("USER_ID = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * table tb_user
     */
    public String deleteByFilter(UserFilter example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }
}