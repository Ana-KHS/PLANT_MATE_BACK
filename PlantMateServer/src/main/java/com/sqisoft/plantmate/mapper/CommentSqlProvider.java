/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.sqisoft.plantmate.domain.Comment;
import com.sqisoft.plantmate.domain.CommentFilter;

/**
 * @author jynius
 */
public class CommentSqlProvider extends BaseSqlProvider {

    /**
     * table tb_comment
     */
    public String countByFilter(CommentFilter example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_comment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * table tb_comment
     */
    public String selectByFilter(CommentFilter example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("COMMENTID");
        } else {
            sql.SELECT("COMMENTID");
        }
        sql.SELECT("COMMUNITYID");
        sql.SELECT("USER_ID");
        sql.SELECT("COMMENT");
        sql.SELECT("CREATE_DATE");
        sql.SELECT("MODIFY_DATE");
        sql.SELECT("FILEID");
        sql.FROM("tb_comment");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * table tb_comment
     */
    public String insertSelective(Comment row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_comment");
        
        sql.VALUES("COMMENTID", "#{id,jdbcType=INTEGER}");
        
        if (row.getCommunityId() != null) {
            sql.VALUES("COMMUNITYID", "#{communityId,jdbcType=INTEGER}");
        }
        
        if (row.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (row.getComment() != null) {
            sql.VALUES("COMMENT", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDate() != null) {
            sql.VALUES("CREATE_DATE", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.VALUES("MODIFY_DATE", "#{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getFileId() != null) {
            sql.VALUES("FILEID", "#{fileId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * table tb_comment
     */
    public String updateByFilterSelective(Map<String, Object> parameter) {
        Comment row = (Comment) parameter.get("row");
        CommentFilter example = (CommentFilter) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_comment");
        
        if (row.getId() != null) {
            sql.SET("COMMENTID = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getCommunityId() != null) {
            sql.SET("COMMUNITYID = #{row.communityId,jdbcType=INTEGER}");
        }
        
        if (row.getUserId() != null) {
            sql.SET("USER_ID = #{row.userId,jdbcType=VARCHAR}");
        }
        
        if (row.getComment() != null) {
            sql.SET("COMMENT = #{row.comment,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDate() != null) {
            sql.SET("CREATE_DATE = #{row.createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.SET("MODIFY_DATE = #{row.modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getFileId() != null) {
            sql.SET("FILEID = #{row.fileId,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_comment
     */
    public String updateByFilter(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_comment");
        
        sql.SET("COMMENTID = #{row.id,jdbcType=INTEGER}");
        sql.SET("COMMUNITYID = #{row.communityId,jdbcType=INTEGER}");
        sql.SET("USER_ID = #{row.userId,jdbcType=VARCHAR}");
        sql.SET("COMMENT = #{row.comment,jdbcType=VARCHAR}");
        sql.SET("CREATE_DATE = #{row.createDate,jdbcType=TIMESTAMP}");
        sql.SET("MODIFY_DATE = #{row.modifyDate,jdbcType=TIMESTAMP}");
        sql.SET("FILEID = #{row.fileId,jdbcType=INTEGER}");
        
        CommentFilter example = (CommentFilter) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_comment
     */
    public String updateByPrimaryKeySelective(Comment row) {
        SQL sql = new SQL();
        sql.UPDATE("tb_comment");
        
        if (row.getCommunityId() != null) {
            sql.SET("COMMUNITYID = #{communityId,jdbcType=INTEGER}");
        }
        
        if (row.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=VARCHAR}");
        }
        
        if (row.getComment() != null) {
            sql.SET("COMMENT = #{comment,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDate() != null) {
            sql.SET("CREATE_DATE = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.SET("MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getFileId() != null) {
            sql.SET("FILEID = #{fileId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("COMMENTID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * table tb_comment
     */
    public String deleteByFilter(CommentFilter example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_comment");
        applyWhere(sql, example, false);
        return sql.toString();
    }
}