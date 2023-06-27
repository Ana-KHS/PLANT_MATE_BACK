/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.User;
import com.sqisoft.plantmate.domain.UserFilter;

/**
 * @author jynius
 */
public interface UserService {

	Paging<User> selectPage(UserFilter filter);

	long selectCount(UserFilter filter);

	List<User> selectList(UserFilter filter);

	User selectOne(String id);
	
//	int save(User row);

	int insert(User row);

	int update(User row);
	
	int delete(String id);
}
