/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.PlantRecord;
import com.sqisoft.plantmate.domain.PlantRecordFilter;
import com.sqisoft.plantmate.mapper.PlantRecordMapper;

import jakarta.annotation.Resource;

/**
 * @author jynius
 */
@Service
public class PlantRecordServiceImpl implements PlantRecordService {
	
	@Resource
	private PlantRecordMapper mapper;

	@Override
	public Paging<PlantRecord> selectPage(PlantRecordFilter filter) {
		
		Paging<PlantRecord> paging = new Paging<>();
		paging.setList(selectList(filter));
		paging.setTotal(selectCount(filter));
		
		return paging;
	}

	@Override
	public long selectCount(PlantRecordFilter filter) {
		return mapper.countByExample(filter);
	}
	
	@Override
	public List<PlantRecord> selectList(PlantRecordFilter filter) {
		return mapper.selectByExample(filter);
	}

	@Override
	public PlantRecord selectOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int save(PlantRecord row) {
		return row.getId()==null? insert(row): update(row);
	}
	
	@Override
	public int insert(PlantRecord row) {
		return mapper.insert(row);
	}

	@Override
	public int update(PlantRecord row) {
		return mapper.updateByPrimaryKeySelective(row);
	}

	@Override
	public int delete(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
