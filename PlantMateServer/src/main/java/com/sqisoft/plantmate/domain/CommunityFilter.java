/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.util.Date;
import java.util.List;

import com.sqisoft.plantmate.domain.Community.Category;
import com.sqisoft.plantmate.domain.filter.CriteriaBased;
import com.sqisoft.plantmate.domain.filter.BaseFilter;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jynius
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CommunityFilter extends BaseFilter<CommunityFilter.Criteria> {

	private static final long serialVersionUID = 6129274894354386996L;

	public static enum ViewType {
		
		DETAIL("게시글 상세"),
		LIST("리스트"),
		PHOTO("사진형");
		
		private String title;
		private ViewType(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}
	
	public static enum Range {
		
		ALL("제목+본문"),
		CONTENT("본문만"),
		TITLE("제목만");
		
		private String title;
		private Range(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}
	
	public static enum SortType {
		
		RECENT("최신 순"),
		OLDER("오래된 순"),
		COMMENT_COUNT("댓글 순");
		
		private String title;
		private SortType(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return this.title;
		}
	}

	private ViewType viewType;	// 조회 형식
	
	private Category category;	// 카테고리
	private Range range;		// 검색어 검색 영역
	private String searchWord;	// 검색어
	
	private SortType sortType;	// 정렬 유형

	@Override
	public Criteria buildCriteria() {
		
		Criteria criteria = new Criteria();
		criteria.setConjunction("and");
		if(category!=null) {
			criteria.addCategoryIdEqualTo(category.getId());
		}
		
		if(searchWord!=null && !searchWord.isBlank()) {
			Criteria criteria0 = new Criteria();
			criteria0.setConjunction("or");
			criteria0.addContentLike(searchWord);
			criteria0.addTitleLike(searchWord);
			criteria.add(criteria0);
		}
		
		return criteria;
	}

    /**
     * table tb_community
     */
    protected static class Criteria extends CriteriaBased {

		private static final long serialVersionUID = -1721612993187044439L;

		public Criteria addIdIsNull() {
            addCriterion("COMMUNITYID is null");
            return (Criteria) this;
        }

        public Criteria addIdIsNotNull() {
            addCriterion("COMMUNITYID is not null");
            return (Criteria) this;
        }

        public Criteria addIdEqualTo(Integer value) {
            addCriterion("COMMUNITYID =", value);
            return (Criteria) this;
        }

        public Criteria addIdNotEqualTo(Integer value) {
            addCriterion("COMMUNITYID <>", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThan(Integer value) {
            addCriterion("COMMUNITYID >", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMUNITYID >=", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThan(Integer value) {
            addCriterion("COMMUNITYID <", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMMUNITYID <=", value);
            return (Criteria) this;
        }

        public Criteria addIdIn(List<Integer> values) {
            addCriterion("COMMUNITYID in", values);
            return (Criteria) this;
        }

        public Criteria addIdNotIn(List<Integer> values) {
            addCriterion("COMMUNITYID not in", values);
            return (Criteria) this;
        }

        public Criteria addIdBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNITYID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNITYID not between", value1, value2);
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
            addCriterion("upper(TITLE) like", "%" + value.toUpperCase() + "%");
            return (Criteria) this;
        }

        public Criteria addTitleNotLike(String value) {
            addCriterion("upper(TITLE) not like", "%" + value.toUpperCase() + "%");
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

        public Criteria addContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria addContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria addContentEqualTo(String value) {
            addCriterion("CONTENT =", value);
            return (Criteria) this;
        }

        public Criteria addContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value);
            return (Criteria) this;
        }

        public Criteria addContentGreaterThan(String value) {
            addCriterion("CONTENT >", value);
            return (Criteria) this;
        }

        public Criteria addContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value);
            return (Criteria) this;
        }

        public Criteria addContentLessThan(String value) {
            addCriterion("CONTENT <", value);
            return (Criteria) this;
        }

        public Criteria addContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value);
            return (Criteria) this;
        }

        public Criteria addContentLike(String value) {
            addCriterion("upper(CONTENT) like", "%" + value.toUpperCase() + "%");
            return (Criteria) this;
        }

        public Criteria addContentNotLike(String value) {
            addCriterion("upper(CONTENT) not like", "%" + value.toUpperCase() + "%");
            return (Criteria) this;
        }

        public Criteria addContentIn(List<String> values) {
            addCriterion("CONTENT in", values);
            return (Criteria) this;
        }

        public Criteria addContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values);
            return (Criteria) this;
        }

        public Criteria addContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2);
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

        public Criteria addCategoryIdIsNull() {
            addCriterion("CATEGORYID is null");
            return (Criteria) this;
        }

        public Criteria addCategoryIdIsNotNull() {
            addCriterion("CATEGORYID is not null");
            return (Criteria) this;
        }

        public Criteria addCategoryIdEqualTo(String value) {
            addCriterion("CATEGORYID =", value);
            return (Criteria) this;
        }

        public Criteria addCategoryIdNotEqualTo(String value) {
            addCriterion("CATEGORYID <>", value);
            return (Criteria) this;
        }

        public Criteria addCategoryIdGreaterThan(String value) {
            addCriterion("CATEGORYID >", value);
            return (Criteria) this;
        }

        public Criteria addCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORYID >=", value);
            return (Criteria) this;
        }

        public Criteria addCategoryIdLessThan(String value) {
            addCriterion("CATEGORYID <", value);
            return (Criteria) this;
        }

        public Criteria addCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("CATEGORYID <=", value);
            return (Criteria) this;
        }

        public Criteria addCategoryIdLike(String value) {
            addCriterion("CATEGORYID like", value);
            return (Criteria) this;
        }

        public Criteria addCategoryIdNotLike(String value) {
            addCriterion("CATEGORYID not like", value);
            return (Criteria) this;
        }

        public Criteria addCategoryIdIn(List<String> values) {
            addCriterion("CATEGORYID in", values);
            return (Criteria) this;
        }

        public Criteria addCategoryIdNotIn(List<String> values) {
            addCriterion("CATEGORYID not in", values);
            return (Criteria) this;
        }

        public Criteria addCategoryIdBetween(String value1, String value2) {
            addCriterion("CATEGORYID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addCategoryIdNotBetween(String value1, String value2) {
            addCriterion("CATEGORYID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addFileidIsNull() {
            addCriterion("FILEID is null");
            return (Criteria) this;
        }

        public Criteria addFileidIsNotNull() {
            addCriterion("FILEID is not null");
            return (Criteria) this;
        }

        public Criteria addFileidEqualTo(Integer value) {
            addCriterion("FILEID =", value);
            return (Criteria) this;
        }

        public Criteria addFileidNotEqualTo(Integer value) {
            addCriterion("FILEID <>", value);
            return (Criteria) this;
        }

        public Criteria addFileidGreaterThan(Integer value) {
            addCriterion("FILEID >", value);
            return (Criteria) this;
        }

        public Criteria addFileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILEID >=", value);
            return (Criteria) this;
        }

        public Criteria addFileidLessThan(Integer value) {
            addCriterion("FILEID <", value);
            return (Criteria) this;
        }

        public Criteria addFileidLessThanOrEqualTo(Integer value) {
            addCriterion("FILEID <=", value);
            return (Criteria) this;
        }

        public Criteria addFileidIn(List<Integer> values) {
            addCriterion("FILEID in", values);
            return (Criteria) this;
        }

        public Criteria addFileidNotIn(List<Integer> values) {
            addCriterion("FILEID not in", values);
            return (Criteria) this;
        }

        public Criteria addFileidBetween(Integer value1, Integer value2) {
            addCriterion("FILEID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addFileidNotBetween(Integer value1, Integer value2) {
            addCriterion("FILEID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addPlantidIsNull() {
            addCriterion("PLANTID is null");
            return (Criteria) this;
        }

        public Criteria addPlantidIsNotNull() {
            addCriterion("PLANTID is not null");
            return (Criteria) this;
        }

        public Criteria addPlantidEqualTo(Integer value) {
            addCriterion("PLANTID =", value);
            return (Criteria) this;
        }

        public Criteria addPlantidNotEqualTo(Integer value) {
            addCriterion("PLANTID <>", value);
            return (Criteria) this;
        }

        public Criteria addPlantidGreaterThan(Integer value) {
            addCriterion("PLANTID >", value);
            return (Criteria) this;
        }

        public Criteria addPlantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLANTID >=", value);
            return (Criteria) this;
        }

        public Criteria addPlantidLessThan(Integer value) {
            addCriterion("PLANTID <", value);
            return (Criteria) this;
        }

        public Criteria addPlantidLessThanOrEqualTo(Integer value) {
            addCriterion("PLANTID <=", value);
            return (Criteria) this;
        }

        public Criteria addPlantidIn(List<Integer> values) {
            addCriterion("PLANTID in", values);
            return (Criteria) this;
        }

        public Criteria addPlantidNotIn(List<Integer> values) {
            addCriterion("PLANTID not in", values);
            return (Criteria) this;
        }

        public Criteria addPlantidBetween(Integer value1, Integer value2) {
            addCriterion("PLANTID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addPlantidNotBetween(Integer value1, Integer value2) {
            addCriterion("PLANTID not between", value1, value2);
            return (Criteria) this;
        }
    }
}