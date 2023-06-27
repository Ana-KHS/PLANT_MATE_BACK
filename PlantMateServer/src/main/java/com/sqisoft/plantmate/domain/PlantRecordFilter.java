/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class PlantRecordFilter implements Serializable {
	
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

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    public PlantRecordFilter() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("RECORD_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("RECORD_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("RECORD_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORD_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("RECORD_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("RECORD_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("RECORD_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("RECORD_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNull() {
            addCriterion("PLANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNotNull() {
            addCriterion("PLANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlantIdEqualTo(Integer value) {
            addCriterion("PLANT_ID =", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotEqualTo(Integer value) {
            addCriterion("PLANT_ID <>", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThan(Integer value) {
            addCriterion("PLANT_ID >", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLANT_ID >=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThan(Integer value) {
            addCriterion("PLANT_ID <", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThanOrEqualTo(Integer value) {
            addCriterion("PLANT_ID <=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIn(List<Integer> values) {
            addCriterion("PLANT_ID in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotIn(List<Integer> values) {
            addCriterion("PLANT_ID not in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdBetween(Integer value1, Integer value2) {
            addCriterion("PLANT_ID between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PLANT_ID not between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("DATE is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("DATE =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("DATE <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("DATE >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("DATE <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("DATE <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("DATE in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("DATE not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("DATE between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("DATE not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("LENGTH =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("LENGTH <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("LENGTH >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("LENGTH >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("LENGTH <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("LENGTH <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("LENGTH in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("LENGTH not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("LENGTH between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("LENGTH not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLeafCountIsNull() {
            addCriterion("LEAF_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLeafCountIsNotNull() {
            addCriterion("LEAF_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLeafCountEqualTo(Integer value) {
            addCriterion("LEAF_COUNT =", value, "leafCount");
            return (Criteria) this;
        }

        public Criteria andLeafCountNotEqualTo(Integer value) {
            addCriterion("LEAF_COUNT <>", value, "leafCount");
            return (Criteria) this;
        }

        public Criteria andLeafCountGreaterThan(Integer value) {
            addCriterion("LEAF_COUNT >", value, "leafCount");
            return (Criteria) this;
        }

        public Criteria andLeafCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEAF_COUNT >=", value, "leafCount");
            return (Criteria) this;
        }

        public Criteria andLeafCountLessThan(Integer value) {
            addCriterion("LEAF_COUNT <", value, "leafCount");
            return (Criteria) this;
        }

        public Criteria andLeafCountLessThanOrEqualTo(Integer value) {
            addCriterion("LEAF_COUNT <=", value, "leafCount");
            return (Criteria) this;
        }

        public Criteria andLeafCountIn(List<Integer> values) {
            addCriterion("LEAF_COUNT in", values, "leafCount");
            return (Criteria) this;
        }

        public Criteria andLeafCountNotIn(List<Integer> values) {
            addCriterion("LEAF_COUNT not in", values, "leafCount");
            return (Criteria) this;
        }

        public Criteria andLeafCountBetween(Integer value1, Integer value2) {
            addCriterion("LEAF_COUNT between", value1, value2, "leafCount");
            return (Criteria) this;
        }

        public Criteria andLeafCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LEAF_COUNT not between", value1, value2, "leafCount");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusIsNull() {
            addCriterion("GROWTH_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusIsNotNull() {
            addCriterion("GROWTH_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusEqualTo(String value) {
            addCriterion("GROWTH_STATUS =", value, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusNotEqualTo(String value) {
            addCriterion("GROWTH_STATUS <>", value, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusGreaterThan(String value) {
            addCriterion("GROWTH_STATUS >", value, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusGreaterThanOrEqualTo(String value) {
            addCriterion("GROWTH_STATUS >=", value, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusLessThan(String value) {
            addCriterion("GROWTH_STATUS <", value, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusLessThanOrEqualTo(String value) {
            addCriterion("GROWTH_STATUS <=", value, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusLike(String value) {
            addCriterion("GROWTH_STATUS like", value, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusNotLike(String value) {
            addCriterion("GROWTH_STATUS not like", value, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusIn(List<String> values) {
            addCriterion("GROWTH_STATUS in", values, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusNotIn(List<String> values) {
            addCriterion("GROWTH_STATUS not in", values, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusBetween(String value1, String value2) {
            addCriterion("GROWTH_STATUS between", value1, value2, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andGrowthStatusNotBetween(String value1, String value2) {
            addCriterion("GROWTH_STATUS not between", value1, value2, "growthStatus");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyIsNull() {
            addCriterion("WATER_SUPPLY is null");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyIsNotNull() {
            addCriterion("WATER_SUPPLY is not null");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyEqualTo(Integer value) {
            addCriterion("WATER_SUPPLY =", value, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyNotEqualTo(Integer value) {
            addCriterion("WATER_SUPPLY <>", value, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyGreaterThan(Integer value) {
            addCriterion("WATER_SUPPLY >", value, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("WATER_SUPPLY >=", value, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyLessThan(Integer value) {
            addCriterion("WATER_SUPPLY <", value, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyLessThanOrEqualTo(Integer value) {
            addCriterion("WATER_SUPPLY <=", value, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyIn(List<Integer> values) {
            addCriterion("WATER_SUPPLY in", values, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyNotIn(List<Integer> values) {
            addCriterion("WATER_SUPPLY not in", values, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyBetween(Integer value1, Integer value2) {
            addCriterion("WATER_SUPPLY between", value1, value2, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andWaterSupplyNotBetween(Integer value1, Integer value2) {
            addCriterion("WATER_SUPPLY not between", value1, value2, "waterSupply");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIsNull() {
            addCriterion("SOIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIsNotNull() {
            addCriterion("SOIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSoilTypeEqualTo(String value) {
            addCriterion("SOIL_TYPE =", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotEqualTo(String value) {
            addCriterion("SOIL_TYPE <>", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeGreaterThan(String value) {
            addCriterion("SOIL_TYPE >", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOIL_TYPE >=", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeLessThan(String value) {
            addCriterion("SOIL_TYPE <", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeLessThanOrEqualTo(String value) {
            addCriterion("SOIL_TYPE <=", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeLike(String value) {
            addCriterion("SOIL_TYPE like", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotLike(String value) {
            addCriterion("SOIL_TYPE not like", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIn(List<String> values) {
            addCriterion("SOIL_TYPE in", values, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotIn(List<String> values) {
            addCriterion("SOIL_TYPE not in", values, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeBetween(String value1, String value2) {
            addCriterion("SOIL_TYPE between", value1, value2, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotBetween(String value1, String value2) {
            addCriterion("SOIL_TYPE not between", value1, value2, "soilType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeIsNull() {
            addCriterion("FERTILIZER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeIsNotNull() {
            addCriterion("FERTILIZER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeEqualTo(String value) {
            addCriterion("FERTILIZER_TYPE =", value, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeNotEqualTo(String value) {
            addCriterion("FERTILIZER_TYPE <>", value, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeGreaterThan(String value) {
            addCriterion("FERTILIZER_TYPE >", value, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FERTILIZER_TYPE >=", value, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeLessThan(String value) {
            addCriterion("FERTILIZER_TYPE <", value, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeLessThanOrEqualTo(String value) {
            addCriterion("FERTILIZER_TYPE <=", value, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeLike(String value) {
            addCriterion("FERTILIZER_TYPE like", value, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeNotLike(String value) {
            addCriterion("FERTILIZER_TYPE not like", value, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeIn(List<String> values) {
            addCriterion("FERTILIZER_TYPE in", values, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeNotIn(List<String> values) {
            addCriterion("FERTILIZER_TYPE not in", values, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeBetween(String value1, String value2) {
            addCriterion("FERTILIZER_TYPE between", value1, value2, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andFertilizerTypeNotBetween(String value1, String value2) {
            addCriterion("FERTILIZER_TYPE not between", value1, value2, "fertilizerType");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Integer value) {
            addCriterion("TEMPERATURE =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Integer value) {
            addCriterion("TEMPERATURE <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Integer value) {
            addCriterion("TEMPERATURE >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPERATURE >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Integer value) {
            addCriterion("TEMPERATURE <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPERATURE <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Integer> values) {
            addCriterion("TEMPERATURE in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Integer> values) {
            addCriterion("TEMPERATURE not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Integer value1, Integer value2) {
            addCriterion("TEMPERATURE between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPERATURE not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNull() {
            addCriterion("HUMIDITY is null");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNotNull() {
            addCriterion("HUMIDITY is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityEqualTo(Integer value) {
            addCriterion("HUMIDITY =", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotEqualTo(Integer value) {
            addCriterion("HUMIDITY <>", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThan(Integer value) {
            addCriterion("HUMIDITY >", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUMIDITY >=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThan(Integer value) {
            addCriterion("HUMIDITY <", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThanOrEqualTo(Integer value) {
            addCriterion("HUMIDITY <=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityIn(List<Integer> values) {
            addCriterion("HUMIDITY in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotIn(List<Integer> values) {
            addCriterion("HUMIDITY not in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityBetween(Integer value1, Integer value2) {
            addCriterion("HUMIDITY between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotBetween(Integer value1, Integer value2) {
            addCriterion("HUMIDITY not between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andGrowthContentIsNull() {
            addCriterion("GROWTH_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andGrowthContentIsNotNull() {
            addCriterion("GROWTH_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthContentEqualTo(String value) {
            addCriterion("GROWTH_CONTENT =", value, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentNotEqualTo(String value) {
            addCriterion("GROWTH_CONTENT <>", value, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentGreaterThan(String value) {
            addCriterion("GROWTH_CONTENT >", value, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentGreaterThanOrEqualTo(String value) {
            addCriterion("GROWTH_CONTENT >=", value, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentLessThan(String value) {
            addCriterion("GROWTH_CONTENT <", value, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentLessThanOrEqualTo(String value) {
            addCriterion("GROWTH_CONTENT <=", value, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentLike(String value) {
            addCriterion("GROWTH_CONTENT like", value, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentNotLike(String value) {
            addCriterion("GROWTH_CONTENT not like", value, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentIn(List<String> values) {
            addCriterion("GROWTH_CONTENT in", values, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentNotIn(List<String> values) {
            addCriterion("GROWTH_CONTENT not in", values, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentBetween(String value1, String value2) {
            addCriterion("GROWTH_CONTENT between", value1, value2, "growthContent");
            return (Criteria) this;
        }

        public Criteria andGrowthContentNotBetween(String value1, String value2) {
            addCriterion("GROWTH_CONTENT not between", value1, value2, "growthContent");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_plant_record
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_plant_record
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}