/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.MemberPlant;
import com.sqisoft.plantmate.domain.MemberPlantFilter;

/**
 * @author jynius
 */
public interface MemberPlantService {

	Paging<MemberPlant> selectPage(MemberPlantFilter filter);

	long selectCount(MemberPlantFilter filter);

	List<MemberPlant> selectList(MemberPlantFilter filter);

	MemberPlant selectOne(Integer id);
	
	int save(MemberPlant row);

	int insert(MemberPlant row);

	int update(MemberPlant row);
	
	int delete(Integer id);
}
