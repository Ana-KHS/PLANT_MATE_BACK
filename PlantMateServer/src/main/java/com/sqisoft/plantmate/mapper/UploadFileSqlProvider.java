/*
 * 
 */
package com.sqisoft.plantmate.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.sqisoft.plantmate.domain.UploadFile;
import com.sqisoft.plantmate.domain.UploadFileFilter;

/**
 * @author jynius
 */
public class UploadFileSqlProvider extends BaseSqlProvider {

    /**
     * table tb_file
     */
    public String countByFilter(UploadFileFilter example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_file");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * table tb_file
     */
    public String selectByFilter(UploadFileFilter example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("FILEID");
        } else {
            sql.SELECT("FILEID");
        }
        sql.SELECT("FILENAME");
        sql.SELECT("FILEPATH");
        sql.SELECT("FILESIZE");
        sql.SELECT("USERFILENAME");
        sql.FROM("tb_file");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * table tb_file
     */
    public String insertSelective(UploadFile row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_file");
        
        sql.VALUES("FILEID", "#{id,jdbcType=INTEGER}");
        
        if (row.getName() != null) {
            sql.VALUES("FILENAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (row.getPath() != null) {
            sql.VALUES("FILEPATH", "#{path,jdbcType=VARCHAR}");
        }
        
        if (row.getSize() != null) {
            sql.VALUES("FILESIZE", "#{size,jdbcType=INTEGER}");
        }
        
        if (row.getUserfilename() != null) {
            sql.VALUES("USERFILENAME", "#{userfilename,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * table tb_file
     */
    public String updateByFilterSelective(Map<String, Object> parameter) {
        UploadFile row = (UploadFile) parameter.get("row");
        UploadFileFilter example = (UploadFileFilter) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_file");
        
        if (row.getId() != null) {
            sql.SET("FILEID = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getName() != null) {
            sql.SET("FILENAME = #{row.name,jdbcType=VARCHAR}");
        }
        
        if (row.getPath() != null) {
            sql.SET("FILEPATH = #{row.path,jdbcType=VARCHAR}");
        }
        
        if (row.getSize() != null) {
            sql.SET("FILESIZE = #{row.size,jdbcType=INTEGER}");
        }
        
        if (row.getUserfilename() != null) {
            sql.SET("USERFILENAME = #{row.userfilename,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_file
     */
    public String updateByFilter(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_file");
        
        sql.SET("FILEID = #{row.id,jdbcType=INTEGER}");
        sql.SET("FILENAME = #{row.name,jdbcType=VARCHAR}");
        sql.SET("FILEPATH = #{row.path,jdbcType=VARCHAR}");
        sql.SET("FILESIZE = #{row.size,jdbcType=INTEGER}");
        sql.SET("USERFILENAME = #{row.userfilename,jdbcType=VARCHAR}");
        
        UploadFileFilter example = (UploadFileFilter) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * table tb_file
     */
    public String updateByPrimaryKeySelective(UploadFile row) {
        SQL sql = new SQL();
        sql.UPDATE("tb_file");
        
        if (row.getName() != null) {
            sql.SET("FILENAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (row.getPath() != null) {
            sql.SET("FILEPATH = #{path,jdbcType=VARCHAR}");
        }
        
        if (row.getSize() != null) {
            sql.SET("FILESIZE = #{size,jdbcType=INTEGER}");
        }
        
        if (row.getUserfilename() != null) {
            sql.SET("USERFILENAME = #{userfilename,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("FILEID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * table tb_file
     */
    public String deleteByFilter(UploadFileFilter example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_file");
        applyWhere(sql, example, false);
        return sql.toString();
    }
}