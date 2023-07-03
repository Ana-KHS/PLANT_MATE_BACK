package com.sqisoft.plantmate.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * 
 */
import lombok.Data;
import lombok.ToString;

/**
 * table tb_file
 * 
 * @author jynius
 */
@Data
@ToString
public class UploadFile implements Serializable {

	private static final long serialVersionUID = -4163151143435735391L;

	@JsonIgnore
	private FilePathPolicy policy;
	
	/**
     * column tb_file.FILEID
     */
    private Integer id;

    private String param;
    
    /**
     * column tb_file.FILENAME
     */
    private String name;

    /**
     * column tb_file.FILEPATH
     */
    private String path;

    private String type;
    
    /**
     * column tb_file.FILESIZE
     */
    private Long size;

    /**
     * column tb_file.USERFILENAME
     */
    private String userfilename;
    
    public String getPath() {
    	
    	if(path==null) {
    		
    		if(policy==null) {
    			policy = new FilePathPolicy.DateDependentPolicy();
    		}
    		
    		path = policy.create(name);
    	}
    	
    	return path;
    }
}