/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.sqisoft.plantmate.domain.Bookmark;
import com.sqisoft.plantmate.domain.BookmarkFilter;

/**
 * @author jynius
 */
public class BookmarkSqlProvider extends BaseSqlProvider {

    /**
     * table tb_bookmark
     */
    public String countByFilter(BookmarkFilter example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_bookmark");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * table tb_bookmark
     */
    public String selectByFilter(BookmarkFilter example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("BOOKMARKID");
        } else {
            sql.SELECT("BOOKMARKID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("COMMUNITYID");
        sql.SELECT("CREATE_DATE");
        sql.SELECT("MODIFY_DATE");
        sql.FROM("tb_bookmark");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * table tb_bookmark
     */
    public String insertSelective(Bookmark row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_bookmark");
        
        sql.VALUES("BOOKMARKID", "#{id,jdbcType=INTEGER}");
        
        if (row.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (row.getCommunityId() != null) {
            sql.VALUES("COMMUNITYID", "#{communityId,jdbcType=INTEGER}");
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
     * table tb_bookmark
     */
    public String updateByFilterSelective(Map<String, Object> parameter) {
        Bookmark row = (Bookmark) parameter.get("row");
        BookmarkFilter example = (BookmarkFilter) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_bookmark");
        
        if (row.getId() != null) {
            sql.SET("BOOKMARKID = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getUserId() != null) {
            sql.SET("USER_ID = #{row.userId,jdbcType=VARCHAR}");
        }
        
        if (row.getCommunityId() != null) {
            sql.SET("COMMUNITYID = #{row.communityId,jdbcType=INTEGER}");
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
     * table tb_bookmark
     */
    public String updateByFilter(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_bookmark");
        
        sql.SET("BOOKMARKID = #{row.id,jdbcType=INTEGER}");
        sql.SET("USER_ID = #{row.userId,jdbcType=VARCHAR}");
        sql.SET("COMMUNITYID = #{row.communityId,jdbcType=INTEGER}");
        sql.SET("CREATE_DATE = #{row.createDate,jdbcType=TIMESTAMP}");
        sql.SET("MODIFY_DATE = #{row.modifyDate,jdbcType=TIMESTAMP}");
        
        BookmarkFilter example = (BookmarkFilter) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_bookmark
     */
    public String updateByPrimaryKeySelective(Bookmark row) {
        SQL sql = new SQL();
        sql.UPDATE("tb_bookmark");
        
        if (row.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=VARCHAR}");
        }
        
        if (row.getCommunityId() != null) {
            sql.SET("COMMUNITYID = #{communityId,jdbcType=INTEGER}");
        }
        
        if (row.getCreateDate() != null) {
            sql.SET("CREATE_DATE = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.SET("MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("BOOKMARKID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * table tb_bookmark
     */
    public String deleteByFilter(BookmarkFilter example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_bookmark");
        applyWhere(sql, example, false);
        return sql.toString();
    }
}