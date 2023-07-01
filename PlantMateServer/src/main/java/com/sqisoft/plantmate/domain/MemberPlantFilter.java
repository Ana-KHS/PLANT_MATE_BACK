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
public class MemberPlantFilter extends BaseFilter<MemberPlantFilter.Criteria> {
	
	private static final long serialVersionUID = 1943155194863038890L;

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
	
	private String userid;
	private SortType sortType;	// 정렬 유형

	@Override
	public Criteria buildCriteria() {
		return null;
	}
	
    /**
     * table tb_member_plant
     */
    protected static class Criteria extends CriteriaBased {

		private static final long serialVersionUID = -8575250644388135126L;

		public Criteria addIdIsNull() {
            addCriterion("PLANTID is null");
            return (Criteria) this;
        }

        public Criteria addIdIsNotNull() {
            addCriterion("PLANTID is not null");
            return (Criteria) this;
        }

        public Criteria addIdEqualTo(Integer value) {
            addCriterion("PLANTID =", value);
            return (Criteria) this;
        }

        public Criteria addIdNotEqualTo(Integer value) {
            addCriterion("PLANTID <>", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThan(Integer value) {
            addCriterion("PLANTID >", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLANTID >=", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThan(Integer value) {
            addCriterion("PLANTID <", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThanOrEqualTo(Integer value) {
            addCriterion("PLANTID <=", value);
            return (Criteria) this;
        }

        public Criteria addIdIn(List<Integer> values) {
            addCriterion("PLANTID in", values);
            return (Criteria) this;
        }

        public Criteria addIdNotIn(List<Integer> values) {
            addCriterion("PLANTID not in", values);
            return (Criteria) this;
        }

        public Criteria addIdBetween(Integer value1, Integer value2) {
            addCriterion("PLANTID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PLANTID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria addUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria addUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value);
            return (Criteria) this;
        }

        public Criteria addUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value);
            return (Criteria) this;
        }

        public Criteria addUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value);
            return (Criteria) this;
        }

        public Criteria addUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value);
            return (Criteria) this;
        }

        public Criteria addUserIdLessThan(String value) {
            addCriterion("USER_ID <", value);
            return (Criteria) this;
        }

        public Criteria addUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value);
            return (Criteria) this;
        }

        public Criteria addUserIdLike(String value) {
            addCriterion("USER_ID like", value);
            return (Criteria) this;
        }

        public Criteria addUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value);
            return (Criteria) this;
        }

        public Criteria addUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values);
            return (Criteria) this;
        }

        public Criteria addUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values);
            return (Criteria) this;
        }

        public Criteria addUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria addNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria addNameEqualTo(String value) {
            addCriterion("NAME =", value);
            return (Criteria) this;
        }

        public Criteria addNameNotEqualTo(String value) {
            addCriterion("NAME <>", value);
            return (Criteria) this;
        }

        public Criteria addNameGreaterThan(String value) {
            addCriterion("NAME >", value);
            return (Criteria) this;
        }

        public Criteria addNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value);
            return (Criteria) this;
        }

        public Criteria addNameLessThan(String value) {
            addCriterion("NAME <", value);
            return (Criteria) this;
        }

        public Criteria addNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value);
            return (Criteria) this;
        }

        public Criteria addNameLike(String value) {
            addCriterion("NAME like", value);
            return (Criteria) this;
        }

        public Criteria addNameNotLike(String value) {
            addCriterion("NAME not like", value);
            return (Criteria) this;
        }

        public Criteria addNameIn(List<String> values) {
            addCriterion("NAME in", values);
            return (Criteria) this;
        }

        public Criteria addNameNotIn(List<String> values) {
            addCriterion("NAME not in", values);
            return (Criteria) this;
        }

        public Criteria addNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria addNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria addNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value);
            return (Criteria) this;
        }

        public Criteria addNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value);
            return (Criteria) this;
        }

        public Criteria addNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value);
            return (Criteria) this;
        }

        public Criteria addNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value);
            return (Criteria) this;
        }

        public Criteria addNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value);
            return (Criteria) this;
        }

        public Criteria addNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value);
            return (Criteria) this;
        }

        public Criteria addNicknameLike(String value) {
            addCriterion("NICKNAME like", value);
            return (Criteria) this;
        }

        public Criteria addNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value);
            return (Criteria) this;
        }

        public Criteria addNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values);
            return (Criteria) this;
        }

        public Criteria addNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values);
            return (Criteria) this;
        }

        public Criteria addNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria addMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria addMemoEqualTo(String value) {
            addCriterion("MEMO =", value);
            return (Criteria) this;
        }

        public Criteria addMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value);
            return (Criteria) this;
        }

        public Criteria addMemoGreaterThan(String value) {
            addCriterion("MEMO >", value);
            return (Criteria) this;
        }

        public Criteria addMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value);
            return (Criteria) this;
        }

        public Criteria addMemoLessThan(String value) {
            addCriterion("MEMO <", value);
            return (Criteria) this;
        }

        public Criteria addMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value);
            return (Criteria) this;
        }

        public Criteria addMemoLike(String value) {
            addCriterion("MEMO like", value);
            return (Criteria) this;
        }

        public Criteria addMemoNotLike(String value) {
            addCriterion("MEMO not like", value);
            return (Criteria) this;
        }

        public Criteria addMemoIn(List<String> values) {
            addCriterion("MEMO in", values);
            return (Criteria) this;
        }

        public Criteria addMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values);
            return (Criteria) this;
        }

        public Criteria addMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addThumbnailIsNull() {
            addCriterion("THUMBNAIL is null");
            return (Criteria) this;
        }

        public Criteria addThumbnailIsNotNull() {
            addCriterion("THUMBNAIL is not null");
            return (Criteria) this;
        }

        public Criteria addThumbnailEqualTo(String value) {
            addCriterion("THUMBNAIL =", value);
            return (Criteria) this;
        }

        public Criteria addThumbnailNotEqualTo(String value) {
            addCriterion("THUMBNAIL <>", value);
            return (Criteria) this;
        }

        public Criteria addThumbnailGreaterThan(String value) {
            addCriterion("THUMBNAIL >", value);
            return (Criteria) this;
        }

        public Criteria addThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("THUMBNAIL >=", value);
            return (Criteria) this;
        }

        public Criteria addThumbnailLessThan(String value) {
            addCriterion("THUMBNAIL <", value);
            return (Criteria) this;
        }

        public Criteria addThumbnailLessThanOrEqualTo(String value) {
            addCriterion("THUMBNAIL <=", value);
            return (Criteria) this;
        }

        public Criteria addThumbnailLike(String value) {
            addCriterion("THUMBNAIL like", value);
            return (Criteria) this;
        }

        public Criteria addThumbnailNotLike(String value) {
            addCriterion("THUMBNAIL not like", value);
            return (Criteria) this;
        }

        public Criteria addThumbnailIn(List<String> values) {
            addCriterion("THUMBNAIL in", values);
            return (Criteria) this;
        }

        public Criteria addThumbnailNotIn(List<String> values) {
            addCriterion("THUMBNAIL not in", values);
            return (Criteria) this;
        }

        public Criteria addThumbnailBetween(String value1, String value2) {
            addCriterion("THUMBNAIL between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addThumbnailNotBetween(String value1, String value2) {
            addCriterion("THUMBNAIL not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria addStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria addStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value);
            return (Criteria) this;
        }

        public Criteria addStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value);
            return (Criteria) this;
        }

        public Criteria addStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value);
            return (Criteria) this;
        }

        public Criteria addStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value);
            return (Criteria) this;
        }

        public Criteria addStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value);
            return (Criteria) this;
        }

        public Criteria addStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value);
            return (Criteria) this;
        }

        public Criteria addStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values);
            return (Criteria) this;
        }

        public Criteria addStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values);
            return (Criteria) this;
        }

        public Criteria addStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmIsNull() {
            addCriterion("WATER_ALARM is null");
            return (Criteria) this;
        }

        public Criteria addWaterAlarmIsNotNull() {
            addCriterion("WATER_ALARM is not null");
            return (Criteria) this;
        }

        public Criteria addWaterAlarmEqualTo(String value) {
            addCriterion("WATER_ALARM =", value);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmNotEqualTo(String value) {
            addCriterion("WATER_ALARM <>", value);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmGreaterThan(String value) {
            addCriterion("WATER_ALARM >", value);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmGreaterThanOrEqualTo(String value) {
            addCriterion("WATER_ALARM >=", value);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmLessThan(String value) {
            addCriterion("WATER_ALARM <", value);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmLessThanOrEqualTo(String value) {
            addCriterion("WATER_ALARM <=", value);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmLike(String value) {
            addCriterion("WATER_ALARM like", value);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmNotLike(String value) {
            addCriterion("WATER_ALARM not like", value);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmIn(List<String> values) {
            addCriterion("WATER_ALARM in", values);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmNotIn(List<String> values) {
            addCriterion("WATER_ALARM not in", values);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmBetween(String value1, String value2) {
            addCriterion("WATER_ALARM between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addWaterAlarmNotBetween(String value1, String value2) {
            addCriterion("WATER_ALARM not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addWaterCycleIsNull() {
            addCriterion("WATER_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria addWaterCycleIsNotNull() {
            addCriterion("WATER_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria addWaterCycleEqualTo(Integer value) {
            addCriterion("WATER_CYCLE =", value);
            return (Criteria) this;
        }

        public Criteria addWaterCycleNotEqualTo(Integer value) {
            addCriterion("WATER_CYCLE <>", value);
            return (Criteria) this;
        }

        public Criteria addWaterCycleGreaterThan(Integer value) {
            addCriterion("WATER_CYCLE >", value);
            return (Criteria) this;
        }

        public Criteria addWaterCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("WATER_CYCLE >=", value);
            return (Criteria) this;
        }

        public Criteria addWaterCycleLessThan(Integer value) {
            addCriterion("WATER_CYCLE <", value);
            return (Criteria) this;
        }

        public Criteria addWaterCycleLessThanOrEqualTo(Integer value) {
            addCriterion("WATER_CYCLE <=", value);
            return (Criteria) this;
        }

        public Criteria addWaterCycleIn(List<Integer> values) {
            addCriterion("WATER_CYCLE in", values);
            return (Criteria) this;
        }

        public Criteria addWaterCycleNotIn(List<Integer> values) {
            addCriterion("WATER_CYCLE not in", values);
            return (Criteria) this;
        }

        public Criteria addWaterCycleBetween(Integer value1, Integer value2) {
            addCriterion("WATER_CYCLE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addWaterCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("WATER_CYCLE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateIsNull() {
            addCriterion("LAST_WATER_DATE is null");
            return (Criteria) this;
        }

        public Criteria addLastWaterDateIsNotNull() {
            addCriterion("LAST_WATER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria addLastWaterDateEqualTo(Date value) {
            addCriterion("LAST_WATER_DATE =", value);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateNotEqualTo(Date value) {
            addCriterion("LAST_WATER_DATE <>", value);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateGreaterThan(Date value) {
            addCriterion("LAST_WATER_DATE >", value);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_WATER_DATE >=", value);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateLessThan(Date value) {
            addCriterion("LAST_WATER_DATE <", value);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_WATER_DATE <=", value);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateIn(List<Date> values) {
            addCriterion("LAST_WATER_DATE in", values);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateNotIn(List<Date> values) {
            addCriterion("LAST_WATER_DATE not in", values);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateBetween(Date value1, Date value2) {
            addCriterion("LAST_WATER_DATE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addLastWaterDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_WATER_DATE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria addCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria addCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value);
            return (Criteria) this;
        }

        public Criteria addCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value);
            return (Criteria) this;
        }

        public Criteria addCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value);
            return (Criteria) this;
        }

        public Criteria addCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value);
            return (Criteria) this;
        }

        public Criteria addCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value);
            return (Criteria) this;
        }

        public Criteria addCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value);
            return (Criteria) this;
        }

        public Criteria addCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values);
            return (Criteria) this;
        }

        public Criteria addCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values);
            return (Criteria) this;
        }

        public Criteria addCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addModifyDateIsNull() {
            addCriterion("MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria addModifyDateIsNotNull() {
            addCriterion("MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria addModifyDateEqualTo(Date value) {
            addCriterion("MODIFY_DATE =", value);
            return (Criteria) this;
        }

        public Criteria addModifyDateNotEqualTo(Date value) {
            addCriterion("MODIFY_DATE <>", value);
            return (Criteria) this;
        }

        public Criteria addModifyDateGreaterThan(Date value) {
            addCriterion("MODIFY_DATE >", value);
            return (Criteria) this;
        }

        public Criteria addModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE >=", value);
            return (Criteria) this;
        }

        public Criteria addModifyDateLessThan(Date value) {
            addCriterion("MODIFY_DATE <", value);
            return (Criteria) this;
        }

        public Criteria addModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE <=", value);
            return (Criteria) this;
        }

        public Criteria addModifyDateIn(List<Date> values) {
            addCriterion("MODIFY_DATE in", values);
            return (Criteria) this;
        }

        public Criteria addModifyDateNotIn(List<Date> values) {
            addCriterion("MODIFY_DATE not in", values);
            return (Criteria) this;
        }

        public Criteria addModifyDateBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE not between", value1, value2);
            return (Criteria) this;
        }
    }
}