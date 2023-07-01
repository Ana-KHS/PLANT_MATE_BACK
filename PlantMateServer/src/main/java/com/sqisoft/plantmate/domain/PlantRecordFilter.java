/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.util.Date;
import java.util.List;

import com.sqisoft.plantmate.domain.filter.CriteriaBased;
import com.sqisoft.plantmate.domain.filter.BaseFilter;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jynius
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class PlantRecordFilter extends BaseFilter<PlantRecordFilter.Criteria> {
	
	private static final long serialVersionUID = -9066853599014589629L;
	
	public static enum SortType {
		
		RECENT("최신 순"),
		OLDER("오래된 순");
		
		private String title;
		private SortType(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}
	
	private String plantName;
	private String title;
	
	private SortType sortType;

	@Override
	public Criteria buildCriteria() {
		return null;
	}
	
    /**
     * table tb_plant_record
     */
    protected static class Criteria extends CriteriaBased {

		private static final long serialVersionUID = 4294213855914650123L;

		public Criteria addIdIsNull() {
            addCriterion("RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria addIdIsNotNull() {
            addCriterion("RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria addIdEqualTo(Integer value) {
            addCriterion("RECORD_ID =", value);
            return (Criteria) this;
        }

        public Criteria addIdNotEqualTo(Integer value) {
            addCriterion("RECORD_ID <>", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThan(Integer value) {
            addCriterion("RECORD_ID >", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORD_ID >=", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThan(Integer value) {
            addCriterion("RECORD_ID <", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThanOrEqualTo(Integer value) {
            addCriterion("RECORD_ID <=", value);
            return (Criteria) this;
        }

        public Criteria addIdIn(List<Integer> values) {
            addCriterion("RECORD_ID in", values);
            return (Criteria) this;
        }

        public Criteria addIdNotIn(List<Integer> values) {
            addCriterion("RECORD_ID not in", values);
            return (Criteria) this;
        }

        public Criteria addIdBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_ID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_ID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addPlantIdIsNull() {
            addCriterion("PLANT_ID is null");
            return (Criteria) this;
        }

        public Criteria addPlantIdIsNotNull() {
            addCriterion("PLANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria addPlantIdEqualTo(Integer value) {
            addCriterion("PLANT_ID =", value);
            return (Criteria) this;
        }

        public Criteria addPlantIdNotEqualTo(Integer value) {
            addCriterion("PLANT_ID <>", value);
            return (Criteria) this;
        }

        public Criteria addPlantIdGreaterThan(Integer value) {
            addCriterion("PLANT_ID >", value);
            return (Criteria) this;
        }

        public Criteria addPlantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLANT_ID >=", value);
            return (Criteria) this;
        }

        public Criteria addPlantIdLessThan(Integer value) {
            addCriterion("PLANT_ID <", value);
            return (Criteria) this;
        }

        public Criteria addPlantIdLessThanOrEqualTo(Integer value) {
            addCriterion("PLANT_ID <=", value);
            return (Criteria) this;
        }

        public Criteria addPlantIdIn(List<Integer> values) {
            addCriterion("PLANT_ID in", values);
            return (Criteria) this;
        }

        public Criteria addPlantIdNotIn(List<Integer> values) {
            addCriterion("PLANT_ID not in", values);
            return (Criteria) this;
        }

        public Criteria addPlantIdBetween(Integer value1, Integer value2) {
            addCriterion("PLANT_ID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addPlantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PLANT_ID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria addTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria addTitleEqualTo(String value) {
            addCriterion("TITLE =", value);
            return (Criteria) this;
        }

        public Criteria addTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value);
            return (Criteria) this;
        }

        public Criteria addTitleGreaterThan(String value) {
            addCriterion("TITLE >", value);
            return (Criteria) this;
        }

        public Criteria addTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value);
            return (Criteria) this;
        }

        public Criteria addTitleLessThan(String value) {
            addCriterion("TITLE <", value);
            return (Criteria) this;
        }

        public Criteria addTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value);
            return (Criteria) this;
        }

        public Criteria addTitleLike(String value) {
            addCriterion("TITLE like", value);
            return (Criteria) this;
        }

        public Criteria addTitleNotLike(String value) {
            addCriterion("TITLE not like", value);
            return (Criteria) this;
        }

        public Criteria addTitleIn(List<String> values) {
            addCriterion("TITLE in", values);
            return (Criteria) this;
        }

        public Criteria addTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values);
            return (Criteria) this;
        }

        public Criteria addTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addDateIsNull() {
            addCriterion("DATE is null");
            return (Criteria) this;
        }

        public Criteria addDateIsNotNull() {
            addCriterion("DATE is not null");
            return (Criteria) this;
        }

        public Criteria addDateEqualTo(Date value) {
            addCriterion("DATE =", value);
            return (Criteria) this;
        }

        public Criteria addDateNotEqualTo(Date value) {
            addCriterion("DATE <>", value);
            return (Criteria) this;
        }

        public Criteria addDateGreaterThan(Date value) {
            addCriterion("DATE >", value);
            return (Criteria) this;
        }

        public Criteria addDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE >=", value);
            return (Criteria) this;
        }

        public Criteria addDateLessThan(Date value) {
            addCriterion("DATE <", value);
            return (Criteria) this;
        }

        public Criteria addDateLessThanOrEqualTo(Date value) {
            addCriterion("DATE <=", value);
            return (Criteria) this;
        }

        public Criteria addDateIn(List<Date> values) {
            addCriterion("DATE in", values);
            return (Criteria) this;
        }

        public Criteria addDateNotIn(List<Date> values) {
            addCriterion("DATE not in", values);
            return (Criteria) this;
        }

        public Criteria addDateBetween(Date value1, Date value2) {
            addCriterion("DATE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addDateNotBetween(Date value1, Date value2) {
            addCriterion("DATE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addLengthIsNull() {
            addCriterion("LENGTH is null");
            return (Criteria) this;
        }

        public Criteria addLengthIsNotNull() {
            addCriterion("LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria addLengthEqualTo(Integer value) {
            addCriterion("LENGTH =", value);
            return (Criteria) this;
        }

        public Criteria addLengthNotEqualTo(Integer value) {
            addCriterion("LENGTH <>", value);
            return (Criteria) this;
        }

        public Criteria addLengthGreaterThan(Integer value) {
            addCriterion("LENGTH >", value);
            return (Criteria) this;
        }

        public Criteria addLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("LENGTH >=", value);
            return (Criteria) this;
        }

        public Criteria addLengthLessThan(Integer value) {
            addCriterion("LENGTH <", value);
            return (Criteria) this;
        }

        public Criteria addLengthLessThanOrEqualTo(Integer value) {
            addCriterion("LENGTH <=", value);
            return (Criteria) this;
        }

        public Criteria addLengthIn(List<Integer> values) {
            addCriterion("LENGTH in", values);
            return (Criteria) this;
        }

        public Criteria addLengthNotIn(List<Integer> values) {
            addCriterion("LENGTH not in", values);
            return (Criteria) this;
        }

        public Criteria addLengthBetween(Integer value1, Integer value2) {
            addCriterion("LENGTH between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("LENGTH not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addLeafCountIsNull() {
            addCriterion("LEAF_COUNT is null");
            return (Criteria) this;
        }

        public Criteria addLeafCountIsNotNull() {
            addCriterion("LEAF_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria addLeafCountEqualTo(Integer value) {
            addCriterion("LEAF_COUNT =", value);
            return (Criteria) this;
        }

        public Criteria addLeafCountNotEqualTo(Integer value) {
            addCriterion("LEAF_COUNT <>", value);
            return (Criteria) this;
        }

        public Criteria addLeafCountGreaterThan(Integer value) {
            addCriterion("LEAF_COUNT >", value);
            return (Criteria) this;
        }

        public Criteria addLeafCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEAF_COUNT >=", value);
            return (Criteria) this;
        }

        public Criteria addLeafCountLessThan(Integer value) {
            addCriterion("LEAF_COUNT <", value);
            return (Criteria) this;
        }

        public Criteria addLeafCountLessThanOrEqualTo(Integer value) {
            addCriterion("LEAF_COUNT <=", value);
            return (Criteria) this;
        }

        public Criteria addLeafCountIn(List<Integer> values) {
            addCriterion("LEAF_COUNT in", values);
            return (Criteria) this;
        }

        public Criteria addLeafCountNotIn(List<Integer> values) {
            addCriterion("LEAF_COUNT not in", values);
            return (Criteria) this;
        }

        public Criteria addLeafCountBetween(Integer value1, Integer value2) {
            addCriterion("LEAF_COUNT between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addLeafCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LEAF_COUNT not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusIsNull() {
            addCriterion("GROWTH_STATUS is null");
            return (Criteria) this;
        }

        public Criteria addGrowthStatusIsNotNull() {
            addCriterion("GROWTH_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria addGrowthStatusEqualTo(String value) {
            addCriterion("GROWTH_STATUS =", value);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusNotEqualTo(String value) {
            addCriterion("GROWTH_STATUS <>", value);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusGreaterThan(String value) {
            addCriterion("GROWTH_STATUS >", value);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusGreaterThanOrEqualTo(String value) {
            addCriterion("GROWTH_STATUS >=", value);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusLessThan(String value) {
            addCriterion("GROWTH_STATUS <", value);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusLessThanOrEqualTo(String value) {
            addCriterion("GROWTH_STATUS <=", value);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusLike(String value) {
            addCriterion("GROWTH_STATUS like", value);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusNotLike(String value) {
            addCriterion("GROWTH_STATUS not like", value);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusIn(List<String> values) {
            addCriterion("GROWTH_STATUS in", values);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusNotIn(List<String> values) {
            addCriterion("GROWTH_STATUS not in", values);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusBetween(String value1, String value2) {
            addCriterion("GROWTH_STATUS between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addGrowthStatusNotBetween(String value1, String value2) {
            addCriterion("GROWTH_STATUS not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyIsNull() {
            addCriterion("WATER_SUPPLY is null");
            return (Criteria) this;
        }

        public Criteria addWaterSupplyIsNotNull() {
            addCriterion("WATER_SUPPLY is not null");
            return (Criteria) this;
        }

        public Criteria addWaterSupplyEqualTo(Integer value) {
            addCriterion("WATER_SUPPLY =", value);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyNotEqualTo(Integer value) {
            addCriterion("WATER_SUPPLY <>", value);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyGreaterThan(Integer value) {
            addCriterion("WATER_SUPPLY >", value);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("WATER_SUPPLY >=", value);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyLessThan(Integer value) {
            addCriterion("WATER_SUPPLY <", value);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyLessThanOrEqualTo(Integer value) {
            addCriterion("WATER_SUPPLY <=", value);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyIn(List<Integer> values) {
            addCriterion("WATER_SUPPLY in", values);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyNotIn(List<Integer> values) {
            addCriterion("WATER_SUPPLY not in", values);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyBetween(Integer value1, Integer value2) {
            addCriterion("WATER_SUPPLY between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addWaterSupplyNotBetween(Integer value1, Integer value2) {
            addCriterion("WATER_SUPPLY not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addSoilTypeIsNull() {
            addCriterion("SOIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria addSoilTypeIsNotNull() {
            addCriterion("SOIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria addSoilTypeEqualTo(String value) {
            addCriterion("SOIL_TYPE =", value);
            return (Criteria) this;
        }

        public Criteria addSoilTypeNotEqualTo(String value) {
            addCriterion("SOIL_TYPE <>", value);
            return (Criteria) this;
        }

        public Criteria addSoilTypeGreaterThan(String value) {
            addCriterion("SOIL_TYPE >", value);
            return (Criteria) this;
        }

        public Criteria addSoilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOIL_TYPE >=", value);
            return (Criteria) this;
        }

        public Criteria addSoilTypeLessThan(String value) {
            addCriterion("SOIL_TYPE <", value);
            return (Criteria) this;
        }

        public Criteria addSoilTypeLessThanOrEqualTo(String value) {
            addCriterion("SOIL_TYPE <=", value);
            return (Criteria) this;
        }

        public Criteria addSoilTypeLike(String value) {
            addCriterion("SOIL_TYPE like", value);
            return (Criteria) this;
        }

        public Criteria addSoilTypeNotLike(String value) {
            addCriterion("SOIL_TYPE not like", value);
            return (Criteria) this;
        }

        public Criteria addSoilTypeIn(List<String> values) {
            addCriterion("SOIL_TYPE in", values);
            return (Criteria) this;
        }

        public Criteria addSoilTypeNotIn(List<String> values) {
            addCriterion("SOIL_TYPE not in", values);
            return (Criteria) this;
        }

        public Criteria addSoilTypeBetween(String value1, String value2) {
            addCriterion("SOIL_TYPE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addSoilTypeNotBetween(String value1, String value2) {
            addCriterion("SOIL_TYPE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeIsNull() {
            addCriterion("FERTILIZER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeIsNotNull() {
            addCriterion("FERTILIZER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeEqualTo(String value) {
            addCriterion("FERTILIZER_TYPE =", value);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeNotEqualTo(String value) {
            addCriterion("FERTILIZER_TYPE <>", value);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeGreaterThan(String value) {
            addCriterion("FERTILIZER_TYPE >", value);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FERTILIZER_TYPE >=", value);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeLessThan(String value) {
            addCriterion("FERTILIZER_TYPE <", value);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeLessThanOrEqualTo(String value) {
            addCriterion("FERTILIZER_TYPE <=", value);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeLike(String value) {
            addCriterion("FERTILIZER_TYPE like", value);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeNotLike(String value) {
            addCriterion("FERTILIZER_TYPE not like", value);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeIn(List<String> values) {
            addCriterion("FERTILIZER_TYPE in", values);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeNotIn(List<String> values) {
            addCriterion("FERTILIZER_TYPE not in", values);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeBetween(String value1, String value2) {
            addCriterion("FERTILIZER_TYPE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addFertilizerTypeNotBetween(String value1, String value2) {
            addCriterion("FERTILIZER_TYPE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addTemperatureIsNull() {
            addCriterion("TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria addTemperatureIsNotNull() {
            addCriterion("TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria addTemperatureEqualTo(Integer value) {
            addCriterion("TEMPERATURE =", value);
            return (Criteria) this;
        }

        public Criteria addTemperatureNotEqualTo(Integer value) {
            addCriterion("TEMPERATURE <>", value);
            return (Criteria) this;
        }

        public Criteria addTemperatureGreaterThan(Integer value) {
            addCriterion("TEMPERATURE >", value);
            return (Criteria) this;
        }

        public Criteria addTemperatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPERATURE >=", value);
            return (Criteria) this;
        }

        public Criteria addTemperatureLessThan(Integer value) {
            addCriterion("TEMPERATURE <", value);
            return (Criteria) this;
        }

        public Criteria addTemperatureLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPERATURE <=", value);
            return (Criteria) this;
        }

        public Criteria addTemperatureIn(List<Integer> values) {
            addCriterion("TEMPERATURE in", values);
            return (Criteria) this;
        }

        public Criteria addTemperatureNotIn(List<Integer> values) {
            addCriterion("TEMPERATURE not in", values);
            return (Criteria) this;
        }

        public Criteria addTemperatureBetween(Integer value1, Integer value2) {
            addCriterion("TEMPERATURE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addTemperatureNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPERATURE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addHumidityIsNull() {
            addCriterion("HUMIDITY is null");
            return (Criteria) this;
        }

        public Criteria addHumidityIsNotNull() {
            addCriterion("HUMIDITY is not null");
            return (Criteria) this;
        }

        public Criteria addHumidityEqualTo(Integer value) {
            addCriterion("HUMIDITY =", value);
            return (Criteria) this;
        }

        public Criteria addHumidityNotEqualTo(Integer value) {
            addCriterion("HUMIDITY <>", value);
            return (Criteria) this;
        }

        public Criteria addHumidityGreaterThan(Integer value) {
            addCriterion("HUMIDITY >", value);
            return (Criteria) this;
        }

        public Criteria addHumidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUMIDITY >=", value);
            return (Criteria) this;
        }

        public Criteria addHumidityLessThan(Integer value) {
            addCriterion("HUMIDITY <", value);
            return (Criteria) this;
        }

        public Criteria addHumidityLessThanOrEqualTo(Integer value) {
            addCriterion("HUMIDITY <=", value);
            return (Criteria) this;
        }

        public Criteria addHumidityIn(List<Integer> values) {
            addCriterion("HUMIDITY in", values);
            return (Criteria) this;
        }

        public Criteria addHumidityNotIn(List<Integer> values) {
            addCriterion("HUMIDITY not in", values);
            return (Criteria) this;
        }

        public Criteria addHumidityBetween(Integer value1, Integer value2) {
            addCriterion("HUMIDITY between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addHumidityNotBetween(Integer value1, Integer value2) {
            addCriterion("HUMIDITY not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addGrowthContentIsNull() {
            addCriterion("GROWTH_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria addGrowthContentIsNotNull() {
            addCriterion("GROWTH_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria addGrowthContentEqualTo(String value) {
            addCriterion("GROWTH_CONTENT =", value);
            return (Criteria) this;
        }

        public Criteria addGrowthContentNotEqualTo(String value) {
            addCriterion("GROWTH_CONTENT <>", value);
            return (Criteria) this;
        }

        public Criteria addGrowthContentGreaterThan(String value) {
            addCriterion("GROWTH_CONTENT >", value);
            return (Criteria) this;
        }

        public Criteria addGrowthContentGreaterThanOrEqualTo(String value) {
            addCriterion("GROWTH_CONTENT >=", value);
            return (Criteria) this;
        }

        public Criteria addGrowthContentLessThan(String value) {
            addCriterion("GROWTH_CONTENT <", value);
            return (Criteria) this;
        }

        public Criteria addGrowthContentLessThanOrEqualTo(String value) {
            addCriterion("GROWTH_CONTENT <=", value);
            return (Criteria) this;
        }

        public Criteria addGrowthContentLike(String value) {
            addCriterion("GROWTH_CONTENT like", value);
            return (Criteria) this;
        }

        public Criteria addGrowthContentNotLike(String value) {
            addCriterion("GROWTH_CONTENT not like", value);
            return (Criteria) this;
        }

        public Criteria addGrowthContentIn(List<String> values) {
            addCriterion("GROWTH_CONTENT in", values);
            return (Criteria) this;
        }

        public Criteria addGrowthContentNotIn(List<String> values) {
            addCriterion("GROWTH_CONTENT not in", values);
            return (Criteria) this;
        }

        public Criteria addGrowthContentBetween(String value1, String value2) {
            addCriterion("GROWTH_CONTENT between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addGrowthContentNotBetween(String value1, String value2) {
            addCriterion("GROWTH_CONTENT not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria addRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria addRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value);
            return (Criteria) this;
        }

        public Criteria addRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value);
            return (Criteria) this;
        }

        public Criteria addRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value);
            return (Criteria) this;
        }

        public Criteria addRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value);
            return (Criteria) this;
        }

        public Criteria addRemarksLessThan(String value) {
            addCriterion("REMARKS <", value);
            return (Criteria) this;
        }

        public Criteria addRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value);
            return (Criteria) this;
        }

        public Criteria addRemarksLike(String value) {
            addCriterion("REMARKS like", value);
            return (Criteria) this;
        }

        public Criteria addRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value);
            return (Criteria) this;
        }

        public Criteria addRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values);
            return (Criteria) this;
        }

        public Criteria addRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values);
            return (Criteria) this;
        }

        public Criteria addRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2);
            return (Criteria) this;
        }
    }
}