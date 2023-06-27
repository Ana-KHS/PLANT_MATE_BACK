/*
 * 
 */
package com.sqisoft.plantmate.service;

import java.util.List;

import com.sqisoft.plantmate.common.Paging;
import com.sqisoft.plantmate.domain.PlantRecord;
import com.sqisoft.plantmate.domain.PlantRecordFilter;
import com.sqisoft.plantmate.domain.PlantRecordKey;

/**
 * @author jynius
 */
public interface PlantRecordService {

	Paging<PlantRecord> selectPage(PlantRecordFilter filter);

	long selectCount(PlantRecordFilter filter);

	List<PlantRecord> selectList(PlantRecordFilter filter);

	PlantRecord selectOne(PlantRecordKey id);
	
	int save(PlantRecord row);

	int insert(PlantRecord row);

	int update(PlantRecord row);
	
	int delete(PlantRecordKey id);
}
