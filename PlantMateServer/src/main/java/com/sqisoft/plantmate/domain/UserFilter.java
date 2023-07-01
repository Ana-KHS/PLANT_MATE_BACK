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
public class UserFilter extends BaseFilter<UserFilter.Criteria> {

	private static final long serialVersionUID = -5338528874100870703L;

	@Override
	public Criteria buildCriteria() {
		return null;
	}

    /**
     * table tb_user
     */
    protected static class Criteria extends CriteriaBased {

		private static final long serialVersionUID = -7094096422877844669L;

		public Criteria addIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria addIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria addIdEqualTo(String value) {
            addCriterion("USER_ID =", value);
            return (Criteria) this;
        }

        public Criteria addIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThan(String value) {
            addCriterion("USER_ID >", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThan(String value) {
            addCriterion("USER_ID <", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value);
            return (Criteria) this;
        }

        public Criteria addIdLike(String value) {
            addCriterion("USER_ID like", value);
            return (Criteria) this;
        }

        public Criteria addIdNotLike(String value) {
            addCriterion("USER_ID not like", value);
            return (Criteria) this;
        }

        public Criteria addIdIn(List<String> values) {
            addCriterion("USER_ID in", values);
            return (Criteria) this;
        }

        public Criteria addIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values);
            return (Criteria) this;
        }

        public Criteria addIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria addNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria addNameEqualTo(String value) {
            addCriterion("USER_NAME =", value);
            return (Criteria) this;
        }

        public Criteria addNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value);
            return (Criteria) this;
        }

        public Criteria addNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value);
            return (Criteria) this;
        }

        public Criteria addNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value);
            return (Criteria) this;
        }

        public Criteria addNameLessThan(String value) {
            addCriterion("USER_NAME <", value);
            return (Criteria) this;
        }

        public Criteria addNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value);
            return (Criteria) this;
        }

        public Criteria addNameLike(String value) {
            addCriterion("USER_NAME like", value);
            return (Criteria) this;
        }

        public Criteria addNameNotLike(String value) {
            addCriterion("USER_NAME not like", value);
            return (Criteria) this;
        }

        public Criteria addNameIn(List<String> values) {
            addCriterion("USER_NAME in", values);
            return (Criteria) this;
        }

        public Criteria addNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values);
            return (Criteria) this;
        }

        public Criteria addNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNicknameIsNull() {
            addCriterion("USER_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria addNicknameIsNotNull() {
            addCriterion("USER_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria addNicknameEqualTo(String value) {
            addCriterion("USER_NICKNAME =", value);
            return (Criteria) this;
        }

        public Criteria addNicknameNotEqualTo(String value) {
            addCriterion("USER_NICKNAME <>", value);
            return (Criteria) this;
        }

        public Criteria addNicknameGreaterThan(String value) {
            addCriterion("USER_NICKNAME >", value);
            return (Criteria) this;
        }

        public Criteria addNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NICKNAME >=", value);
            return (Criteria) this;
        }

        public Criteria addNicknameLessThan(String value) {
            addCriterion("USER_NICKNAME <", value);
            return (Criteria) this;
        }

        public Criteria addNicknameLessThanOrEqualTo(String value) {
            addCriterion("USER_NICKNAME <=", value);
            return (Criteria) this;
        }

        public Criteria addNicknameLike(String value) {
            addCriterion("USER_NICKNAME like", value);
            return (Criteria) this;
        }

        public Criteria addNicknameNotLike(String value) {
            addCriterion("USER_NICKNAME not like", value);
            return (Criteria) this;
        }

        public Criteria addNicknameIn(List<String> values) {
            addCriterion("USER_NICKNAME in", values);
            return (Criteria) this;
        }

        public Criteria addNicknameNotIn(List<String> values) {
            addCriterion("USER_NICKNAME not in", values);
            return (Criteria) this;
        }

        public Criteria addNicknameBetween(String value1, String value2) {
            addCriterion("USER_NICKNAME between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNicknameNotBetween(String value1, String value2) {
            addCriterion("USER_NICKNAME not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria addPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria addPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value);
            return (Criteria) this;
        }

        public Criteria addPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value);
            return (Criteria) this;
        }

        public Criteria addPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value);
            return (Criteria) this;
        }

        public Criteria addPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value);
            return (Criteria) this;
        }

        public Criteria addPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value);
            return (Criteria) this;
        }

        public Criteria addPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value);
            return (Criteria) this;
        }

        public Criteria addPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value);
            return (Criteria) this;
        }

        public Criteria addPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value);
            return (Criteria) this;
        }

        public Criteria addPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values);
            return (Criteria) this;
        }

        public Criteria addPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values);
            return (Criteria) this;
        }

        public Criteria addPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addEmailIsNull() {
            addCriterion("USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria addEmailIsNotNull() {
            addCriterion("USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria addEmailEqualTo(String value) {
            addCriterion("USER_EMAIL =", value);
            return (Criteria) this;
        }

        public Criteria addEmailNotEqualTo(String value) {
            addCriterion("USER_EMAIL <>", value);
            return (Criteria) this;
        }

        public Criteria addEmailGreaterThan(String value) {
            addCriterion("USER_EMAIL >", value);
            return (Criteria) this;
        }

        public Criteria addEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL >=", value);
            return (Criteria) this;
        }

        public Criteria addEmailLessThan(String value) {
            addCriterion("USER_EMAIL <", value);
            return (Criteria) this;
        }

        public Criteria addEmailLessThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL <=", value);
            return (Criteria) this;
        }

        public Criteria addEmailLike(String value) {
            addCriterion("USER_EMAIL like", value);
            return (Criteria) this;
        }

        public Criteria addEmailNotLike(String value) {
            addCriterion("USER_EMAIL not like", value);
            return (Criteria) this;
        }

        public Criteria addEmailIn(List<String> values) {
            addCriterion("USER_EMAIL in", values);
            return (Criteria) this;
        }

        public Criteria addEmailNotIn(List<String> values) {
            addCriterion("USER_EMAIL not in", values);
            return (Criteria) this;
        }

        public Criteria addEmailBetween(String value1, String value2) {
            addCriterion("USER_EMAIL between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addEmailNotBetween(String value1, String value2) {
            addCriterion("USER_EMAIL not between", value1, value2);
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