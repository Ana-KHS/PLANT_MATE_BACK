/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.mapper.CommunityMapper;
import com.sqisoft.plantmate.domain.Community;
import com.sqisoft.plantmate.domain.CommunityFilter;

/**
 * @author jynius
 */
@Service
public class CommunityServiceImpl implements CommunityService {
	
	private CommunityMapper mapper;

	@Override
	public Paging<Community> selectPage(CommunityFilter filter) {
		
		Paging<Community> paging = new Paging<>();
		paging.setList(selectList(filter));
		paging.setTotal(selectCount(filter));
		
		return paging;
	}

	@Override
	public long selectCount(CommunityFilter filter) {
		return mapper.countByExample(filter);
	}
	
	@Override
	public List<Community> selectList(CommunityFilter filter) {
		return mapper.selectByExample(filter);
	}

	@Override
	public Community selectOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int save(Community row) {
		return row.getId()==null? insert(row): update(row);
	}
	
	@Override
	public int insert(Community row) {
		return mapper.insert(row);
	}

	@Override
	public int update(Community row) {
		return mapper.updateByPrimaryKeySelective(row);
	}

	@Override
	public int delete(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
