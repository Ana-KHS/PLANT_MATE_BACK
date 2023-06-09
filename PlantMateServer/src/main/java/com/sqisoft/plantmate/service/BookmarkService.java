/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.Bookmark;
import com.sqisoft.plantmate.domain.BookmarkFilter;

/**
 * @author jynius
 */
public interface BookmarkService {

	Paging<Bookmark> selectPage(BookmarkFilter filter);

	long selectCount(BookmarkFilter filter);

	List<Bookmark> selectList(BookmarkFilter filter);

	Bookmark selectOne(Integer id);
	
	int save(Bookmark row);

	int insert(Bookmark row);

	int update(Bookmark row);
	
	int delete(Integer id);
}
