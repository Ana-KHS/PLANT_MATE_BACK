/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.mapper.UploadFileMapper;
import com.sqisoft.plantmate.domain.UploadFile;
import com.sqisoft.plantmate.domain.UploadFileFilter;

/**
 * @author jynius
 */
@Service
public class UploadFileServiceImpl implements UploadFileService {
	
	private UploadFileMapper mapper;

	@Override
	public Paging<UploadFile> selectPage(UploadFileFilter filter) {
		
		Paging<UploadFile> paging = new Paging<>();
		paging.setList(selectList(filter));
		paging.setTotal(selectCount(filter));
		
		return paging;
	}

	@Override
	public long selectCount(UploadFileFilter filter) {
		return mapper.countByExample(filter);
	}
	
	@Override
	public List<UploadFile> selectList(UploadFileFilter filter) {
		return mapper.selectByExample(filter);
	}

	@Override
	public UploadFile selectOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int save(UploadFile row) {
		return row.getId()==null? insert(row): update(row);
	}
	
	@Override
	public int insert(UploadFile row) {
		return mapper.insert(row);
	}

	@Override
	public int update(UploadFile row) {
		return mapper.updateByPrimaryKeySelective(row);
	}

	@Override
	public int delete(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
