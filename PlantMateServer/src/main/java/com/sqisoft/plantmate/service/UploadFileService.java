/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.UploadFile;
import com.sqisoft.plantmate.domain.UploadFileFilter;

/**
 * @author jynius
 */
public interface UploadFileService {

	Paging<UploadFile> selectPage(UploadFileFilter filter);

	long selectCount(UploadFileFilter filter);

	List<UploadFile> selectList(UploadFileFilter filter);

	UploadFile selectOne(Integer id);
	
	int save(UploadFile row);

	int insert(UploadFile row);

	int update(UploadFile row);
	
	int delete(Integer id);
}
