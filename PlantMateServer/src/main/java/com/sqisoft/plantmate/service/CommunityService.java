/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.Community;
import com.sqisoft.plantmate.domain.CommunityFilter;

/**
 * @author jynius
 */
public interface CommunityService {

	Paging<Community> selectPage(CommunityFilter filter);

	long selectCount(CommunityFilter filter);

	List<Community> selectList(CommunityFilter filter);

	Community selectOne(Integer id);
	
	int save(Community row);

	int insert(Community row);

	int update(Community row);
	
	int delete(Integer id);
}
