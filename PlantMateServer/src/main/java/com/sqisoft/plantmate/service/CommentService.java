/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.Comment;
import com.sqisoft.plantmate.domain.CommentFilter;

/**
 * @author jynius
 */
public interface CommentService {

	Paging<Comment> selectPage(CommentFilter filter);

	long selectCount(CommentFilter filter);

	List<Comment> selectList(CommentFilter filter);

	Comment selectOne(Integer id);
	
	int save(Comment row);

	int insert(Comment row);

	int update(Comment row);
	
	int delete(Integer id);
}
