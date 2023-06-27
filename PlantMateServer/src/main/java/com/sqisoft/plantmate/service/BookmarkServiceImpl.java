/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.mapper.BookmarkMapper;
import com.sqisoft.plantmate.domain.Bookmark;
import com.sqisoft.plantmate.domain.BookmarkFilter;
import com.sqisoft.plantmate.domain.BookmarkKey;

/**
 * @author jynius
 */
@Service
public class BookmarkServiceImpl implements BookmarkService {
	
	private BookmarkMapper mapper;

	@Override
	public Paging<Bookmark> selectPage(BookmarkFilter filter) {
		
		Paging<Bookmark> paging = new Paging<>();
		paging.setList(selectList(filter));
		paging.setTotal(selectCount(filter));
		
		return paging;
	}

	@Override
	public long selectCount(BookmarkFilter filter) {
		return mapper.countByExample(filter);
	}
	
	@Override
	public List<Bookmark> selectList(BookmarkFilter filter) {
		return mapper.selectByExample(filter);
	}

	@Override
	public Bookmark selectOne(BookmarkKey id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int save(Bookmark row) {
		return row.getId()==null? insert(row): update(row);
	}
	
	@Override
	public int insert(Bookmark row) {
		return mapper.insert(row);
	}

	@Override
	public int update(Bookmark row) {
		return mapper.updateByPrimaryKeySelective(row);
	}

	@Override
	public int delete(BookmarkKey id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
