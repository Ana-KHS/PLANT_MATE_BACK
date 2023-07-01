/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.mapper.MemberPlantMapper;

import jakarta.annotation.Resource;

import com.sqisoft.plantmate.domain.MemberPlant;
import com.sqisoft.plantmate.domain.MemberPlantFilter;

/**
 * @author jynius
 */
@Service
public class MemberPlantServiceImpl implements MemberPlantService {
	
	@Resource
	private MemberPlantMapper mapper;

	@Override
	public Paging<MemberPlant> selectPage(MemberPlantFilter filter) {
		
		Paging<MemberPlant> paging = new Paging<>();
		paging.setList(selectList(filter));
		paging.setTotal(selectCount(filter));
		
		return paging;
	}

	@Override
	public long selectCount(MemberPlantFilter filter) {
		return mapper.countByFilter(filter);
	}
	
	@Override
	public List<MemberPlant> selectList(MemberPlantFilter filter) {
		return mapper.selectByFilter(filter);
	}

	@Override
	public MemberPlant selectOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int save(MemberPlant row) {
		return row.getId()==null? insert(row): update(row);
	}
	
	@Override
	public int insert(MemberPlant row) {
		return mapper.insert(row);
	}

	@Override
	public int update(MemberPlant row) {
		return mapper.updateByPrimaryKeySelective(row);
	}

	@Override
	public int delete(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
