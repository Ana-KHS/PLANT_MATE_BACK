/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.util.Date;
import java.util.List;

import com.sqisoft.plantmate.domain.filter.CriteriaBased;
import com.sqisoft.plantmate.domain.CommunityFilter.Criteria;
import com.sqisoft.plantmate.domain.filter.BaseFilter;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jynius
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CommentFilter extends BaseFilter<CommentFilter.Criteria> {

	private static final long serialVersionUID = 6709097668302614071L;

	private Integer communityId;
	
	@Override
	public Criteria buildCriteria() {
		
		Criteria criteria = new Criteria();
		criteria.setConjunction("and");
		if(communityId != null){
			criteria.addCommunityIdEqualTo(communityId);
		}
		return criteria;
	}

	
    /**
     * table tb_comment
     */
    protected static class Criteria extends CriteriaBased {

		private static final long serialVersionUID = 2493321793827699067L;

		public Criteria addIdIsNull() {
            addCriterion("COMMENTID is null");
            return (Criteria) this;
        }

        public Criteria addIdIsNotNull() {
            addCriterion("COMMENTID is not null");
            return (Criteria) this;
        }

        public Criteria addIdEqualTo(Integer value) {
            addCriterion("COMMENTID =", value);
            return (Criteria) this;
        }

        public Criteria addIdNotEqualTo(Integer value) {
            addCriterion("COMMENTID <>", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThan(Integer value) {
            addCriterion("COMMENTID >", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENTID >=", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThan(Integer value) {
            addCriterion("COMMENTID <", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENTID <=", value);
            return (Criteria) this;
        }

        public Criteria addIdIn(List<Integer> values) {
            addCriterion("COMMENTID in", values);
            return (Criteria) this;
        }

        public Criteria addIdNotIn(List<Integer> values) {
            addCriterion("COMMENTID not in", values);
            return (Criteria) this;
        }

        public Criteria addIdBetween(Integer value1, Integer value2) {
            addCriterion("COMMENTID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENTID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addCommunityIdIsNull() {
            addCriterion("COMMUNITYID is null");
            return (Criteria) this;
        }

        public Criteria addCommunityIdIsNotNull() {
            addCriterion("COMMUNITYID is not null");
            return (Criteria) this;
        }

        public Criteria addCommunityIdEqualTo(Integer value) {
            addCriterion("COMMUNITYID =", value);
            return (Criteria) this;
        }

        public Criteria addCommunityIdNotEqualTo(Integer value) {
            addCriterion("COMMUNITYID <>", value);
            return (Criteria) this;
        }

        public Criteria addCommunityIdGreaterThan(Integer value) {
            addCriterion("COMMUNITYID >", value);
            return (Criteria) this;
        }

        public Criteria addCommunityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMUNITYID >=", value);
            return (Criteria) this;
        }

        public Criteria addCommunityIdLessThan(Integer value) {
            addCriterion("COMMUNITYID <", value);
            return (Criteria) this;
        }

        public Criteria addCommunityIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMMUNITYID <=", value);
            return (Criteria) this;
        }

        public Criteria addCommunityIdIn(List<Integer> values) {
            addCriterion("COMMUNITYID in", values);
            return (Criteria) this;
        }

        public Criteria addCommunityIdNotIn(List<Integer> values) {
            addCriterion("COMMUNITYID not in", values);
            return (Criteria) this;
        }

        public Criteria addCommunityIdBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNITYID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addCommunityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNITYID not between", value1, value2);
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

        public Criteria addCommentIsNull() {
            addCriterion("COMMENT is null");
            return (Criteria) this;
        }

        public Criteria addCommentIsNotNull() {
            addCriterion("COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria addCommentEqualTo(String value) {
            addCriterion("COMMENT =", value);
            return (Criteria) this;
        }

        public Criteria addCommentNotEqualTo(String value) {
            addCriterion("COMMENT <>", value);
            return (Criteria) this;
        }

        public Criteria addCommentGreaterThan(String value) {
            addCriterion("COMMENT >", value);
            return (Criteria) this;
        }

        public Criteria addCommentGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT >=", value);
            return (Criteria) this;
        }

        public Criteria addCommentLessThan(String value) {
            addCriterion("COMMENT <", value);
            return (Criteria) this;
        }

        public Criteria addCommentLessThanOrEqualTo(String value) {
            addCriterion("COMMENT <=", value);
            return (Criteria) this;
        }

        public Criteria addCommentLike(String value) {
            addCriterion("COMMENT like", value);
            return (Criteria) this;
        }

        public Criteria addCommentNotLike(String value) {
            addCriterion("COMMENT not like", value);
            return (Criteria) this;
        }

        public Criteria addCommentIn(List<String> values) {
            addCriterion("COMMENT in", values);
            return (Criteria) this;
        }

        public Criteria addCommentNotIn(List<String> values) {
            addCriterion("COMMENT not in", values);
            return (Criteria) this;
        }

        public Criteria addCommentBetween(String value1, String value2) {
            addCriterion("COMMENT between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addCommentNotBetween(String value1, String value2) {
            addCriterion("COMMENT not between", value1, value2);
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

        public Criteria addFileIdIsNull() {
            addCriterion("FILEID is null");
            return (Criteria) this;
        }

        public Criteria addFileIdIsNotNull() {
            addCriterion("FILEID is not null");
            return (Criteria) this;
        }

        public Criteria addFileIdEqualTo(Integer value) {
            addCriterion("FILEID =", value);
            return (Criteria) this;
        }

        public Criteria addFileIdNotEqualTo(Integer value) {
            addCriterion("FILEID <>", value);
            return (Criteria) this;
        }

        public Criteria addFileIdGreaterThan(Integer value) {
            addCriterion("FILEID >", value);
            return (Criteria) this;
        }

        public Criteria addFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILEID >=", value);
            return (Criteria) this;
        }

        public Criteria addFileIdLessThan(Integer value) {
            addCriterion("FILEID <", value);
            return (Criteria) this;
        }

        public Criteria addFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("FILEID <=", value);
            return (Criteria) this;
        }

        public Criteria addFileIdIn(List<Integer> values) {
            addCriterion("FILEID in", values);
            return (Criteria) this;
        }

        public Criteria addFileIdNotIn(List<Integer> values) {
            addCriterion("FILEID not in", values);
            return (Criteria) this;
        }

        public Criteria addFileIdBetween(Integer value1, Integer value2) {
            addCriterion("FILEID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FILEID not between", value1, value2);
            return (Criteria) this;
        }
    }
}