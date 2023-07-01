package com.sqisoft.plantmate.domain;

import java.io.Serializable;

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

	/**
     * column tb_file.FILEID
     */
    private Integer id;

    /**
     * column tb_file.FILENAME
     */
    private String name;

    /**
     * column tb_file.FILEPATH
     */
    private String path;

    /**
     * column tb_file.FILESIZE
     */
    private Integer size;

    /**
     * column tb_file.USERFILENAME
     */
    private String userfilename;
}