/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.mapper.UserMapper;

import jakarta.annotation.Resource;

import com.sqisoft.plantmate.domain.User;
import com.sqisoft.plantmate.domain.UserFilter;

/**
 * @author jynius
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper mapper;

	@Override
	public Paging<User> selectPage(UserFilter filter) {
		
		Paging<User> paging = new Paging<>();
		paging.setList(selectList(filter));
		paging.setTotal(selectCount(filter));
		
		return paging;
	}

	@Override
	public long selectCount(UserFilter filter) {
		return mapper.countByFilter(filter);
	}
	
	@Override
	public List<User> selectList(UserFilter filter) {
		return mapper.selectByFilter(filter);
	}

	@Override
	public User selectOne(String id) {
		return mapper.selectByPrimaryKey(id);
	}
	
//	@Override
//	public int save(User row) {
//		return row.getUserid()==null? insert(row): update(row);
//	}
	
	@Override
	public int insert(User row) {
		return mapper.insert(row);
	}

	@Override
	public int update(User row) {
		return mapper.updateByPrimaryKeySelective(row);
	}

	@Override
	public int delete(String id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
