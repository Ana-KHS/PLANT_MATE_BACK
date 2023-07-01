/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.mapper.CommentMapper;

import jakarta.annotation.Resource;

import com.sqisoft.plantmate.domain.Comment;
import com.sqisoft.plantmate.domain.CommentFilter;

/**
 * @author jynius
 */
@Service
public class CommentServiceImpl implements CommentService {
	
	@Resource
	private CommentMapper mapper;

	@Override
	public Paging<Comment> selectPage(CommentFilter filter) {
		
		Paging<Comment> paging = new Paging<>();
		paging.setList(selectList(filter));
		paging.setTotal(selectCount(filter));
		
		return paging;
	}

	@Override
	public long selectCount(CommentFilter filter) {
		return mapper.countByFilter(filter);
	}
	
	@Override
	public List<Comment> selectList(CommentFilter filter) {
		return mapper.selectByFilter(filter);
	}

	@Override
	public Comment selectOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int save(Comment row) {
		return row.getId()==null? insert(row): update(row);
	}
	
	@Override
	public int insert(Comment row) {
		return mapper.insert(row);
	}

	@Override
	public int update(Comment row) {
		return mapper.updateByPrimaryKeySelective(row);
	}

	@Override
	public int delete(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
