/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.sqisoft.plantmate.domain.Community;
import com.sqisoft.plantmate.domain.CommunityFilter;

/**
 * @author jynius
 */
public class CommunitySqlProvider extends BaseSqlProvider {

    /**
     * table tb_community
     */
    public String countByFilter(CommunityFilter example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_community");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * table tb_community
     */
    public String selectByFilter(CommunityFilter example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("COMMUNITYID");
        } else {
            sql.SELECT("COMMUNITYID");
        }
        sql.SELECT("TITLE");
        sql.SELECT("CONTENT");
        sql.SELECT("CREATE_DATE");
        sql.SELECT("MODIFY_DATE");
        sql.SELECT("CATEGORYID");
        sql.SELECT("FILEID");
        sql.SELECT("PLANTID");
        sql.FROM("tb_community");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * table tb_community
     */
    public String insertSelective(Community row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_community");
        
        sql.VALUES("COMMUNITYID", "#{id,jdbcType=INTEGER}");
        
        if (row.getTitle() != null) {
            sql.VALUES("TITLE", "#{title,jdbcType=VARCHAR}");
        }
        
        if (row.getContent() != null) {
            sql.VALUES("CONTENT", "#{content,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDate() != null) {
            sql.VALUES("CREATE_DATE", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.VALUES("MODIFY_DATE", "#{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCategoryId() != null) {
            sql.VALUES("CATEGORYID", "#{categoryId,jdbcType=CHAR}");
        }
        
        if (row.getFileId() != null) {
            sql.VALUES("FILEID", "#{fileId,jdbcType=INTEGER}");
        }
        
        if (row.getPlantId() != null) {
            sql.VALUES("PLANTID", "#{plantId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * table tb_community
     */
    public String updateByFilterSelective(Map<String, Object> parameter) {
        Community row = (Community) parameter.get("row");
        CommunityFilter example = (CommunityFilter) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_community");
        
        if (row.getId() != null) {
            sql.SET("COMMUNITYID = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getTitle() != null) {
            sql.SET("TITLE = #{row.title,jdbcType=VARCHAR}");
        }
        
        if (row.getContent() != null) {
            sql.SET("CONTENT = #{row.content,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDate() != null) {
            sql.SET("CREATE_DATE = #{row.createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.SET("MODIFY_DATE = #{row.modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCategoryId() != null) {
            sql.SET("CATEGORYID = #{row.categoryId,jdbcType=CHAR}");
        }
        
        if (row.getFileId() != null) {
            sql.SET("FILEID = #{row.fileId,jdbcType=INTEGER}");
        }
        
        if (row.getPlantId() != null) {
            sql.SET("PLANTID = #{row.plantId,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_community
     */
    public String updateByFilter(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_community");
        
        sql.SET("COMMUNITYID = #{row.id,jdbcType=INTEGER}");
        sql.SET("TITLE = #{row.title,jdbcType=VARCHAR}");
        sql.SET("CONTENT = #{row.content,jdbcType=VARCHAR}");
        sql.SET("CREATE_DATE = #{row.createDate,jdbcType=TIMESTAMP}");
        sql.SET("MODIFY_DATE = #{row.modifyDate,jdbcType=TIMESTAMP}");
        sql.SET("CATEGORYID = #{row.categoryId,jdbcType=CHAR}");
        sql.SET("FILEID = #{row.fileId,jdbcType=INTEGER}");
        sql.SET("PLANTID = #{row.plantId,jdbcType=INTEGER}");
        
        CommunityFilter example = (CommunityFilter) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_community
     */
    public String updateByPrimaryKeySelective(Community row) {
        SQL sql = new SQL();
        sql.UPDATE("tb_community");
        
        if (row.getTitle() != null) {
            sql.SET("TITLE = #{title,jdbcType=VARCHAR}");
        }
        
        if (row.getContent() != null) {
            sql.SET("CONTENT = #{content,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDate() != null) {
            sql.SET("CREATE_DATE = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getModifyDate() != null) {
            sql.SET("MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCategoryId() != null) {
            sql.SET("CATEGORYID = #{categoryId,jdbcType=CHAR}");
        }
        
        if (row.getFileId() != null) {
            sql.SET("FILEID = #{fileId,jdbcType=INTEGER}");
        }
        
        if (row.getPlantId() != null) {
            sql.SET("PLANTID = #{plantId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("COMMUNITYID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * table tb_community
     */
    public String deleteByFilter(CommunityFilter example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_community");
        applyWhere(sql, example, false);
        return sql.toString();
    }
}