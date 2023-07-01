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
public class BookmarkFilter extends BaseFilter<BookmarkFilter.Criteria> {

	private static final long serialVersionUID = -8911627324327288432L;

	@Override
	public Criteria buildCriteria() {
		return null;
	}

    /**
     * table tb_bookmark
     */
    protected static class Criteria extends CriteriaBased {

		private static final long serialVersionUID = -7024437278836400749L;

		public Criteria addIdIsNull() {
            addCriterion("BOOKMARKID is null");
            return (Criteria) this;
        }

        public Criteria addIdIsNotNull() {
            addCriterion("BOOKMARKID is not null");
            return (Criteria) this;
        }

        public Criteria addIdEqualTo(Integer value) {
            addCriterion("BOOKMARKID =", value);
            return (Criteria) this;
        }

        public Criteria addIdNotEqualTo(Integer value) {
            addCriterion("BOOKMARKID <>", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThan(Integer value) {
            addCriterion("BOOKMARKID >", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOOKMARKID >=", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThan(Integer value) {
            addCriterion("BOOKMARKID <", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThanOrEqualTo(Integer value) {
            addCriterion("BOOKMARKID <=", value);
            return (Criteria) this;
        }

        public Criteria addIdIn(List<Integer> values) {
            addCriterion("BOOKMARKID in", values);
            return (Criteria) this;
        }

        public Criteria addIdNotIn(List<Integer> values) {
            addCriterion("BOOKMARKID not in", values);
            return (Criteria) this;
        }

        public Criteria addIdBetween(Integer value1, Integer value2) {
            addCriterion("BOOKMARKID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BOOKMARKID not between", value1, value2);
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

        public Criteria addCommunityidIsNull() {
            addCriterion("COMMUNITYID is null");
            return (Criteria) this;
        }

        public Criteria addCommunityidIsNotNull() {
            addCriterion("COMMUNITYID is not null");
            return (Criteria) this;
        }

        public Criteria addCommunityidEqualTo(Integer value) {
            addCriterion("COMMUNITYID =", value);
            return (Criteria) this;
        }

        public Criteria addCommunityidNotEqualTo(Integer value) {
            addCriterion("COMMUNITYID <>", value);
            return (Criteria) this;
        }

        public Criteria addCommunityidGreaterThan(Integer value) {
            addCriterion("COMMUNITYID >", value);
            return (Criteria) this;
        }

        public Criteria addCommunityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMUNITYID >=", value);
            return (Criteria) this;
        }

        public Criteria addCommunityidLessThan(Integer value) {
            addCriterion("COMMUNITYID <", value);
            return (Criteria) this;
        }

        public Criteria addCommunityidLessThanOrEqualTo(Integer value) {
            addCriterion("COMMUNITYID <=", value);
            return (Criteria) this;
        }

        public Criteria addCommunityidIn(List<Integer> values) {
            addCriterion("COMMUNITYID in", values);
            return (Criteria) this;
        }

        public Criteria addCommunityidNotIn(List<Integer> values) {
            addCriterion("COMMUNITYID not in", values);
            return (Criteria) this;
        }

        public Criteria addCommunityidBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNITYID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addCommunityidNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNITYID not between", value1, value2);
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