/*
 * 
 */
package com.sqisoft.plantmate.domain;

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
public class PlantGrowthFileFilter extends BaseFilter<PlantGrowthFileFilter.Criteria> {

	private static final long serialVersionUID = 3821801131779710937L;

	@Override
	public Criteria buildCriteria() {
		return null;
	}

    /**
     * table tb_plant_growth_file
     */
    protected static class Criteria extends CriteriaBased {

		private static final long serialVersionUID = 4291920892019661195L;

		public Criteria addGrowthfileidIsNull() {
            addCriterion("GROWTHFILEID is null");
            return (Criteria) this;
        }

        public Criteria addGrowthfileidIsNotNull() {
            addCriterion("GROWTHFILEID is not null");
            return (Criteria) this;
        }

        public Criteria addGrowthfileidEqualTo(Integer value) {
            addCriterion("GROWTHFILEID =", value);
            return (Criteria) this;
        }

        public Criteria addGrowthfileidNotEqualTo(Integer value) {
            addCriterion("GROWTHFILEID <>", value);
            return (Criteria) this;
        }

        public Criteria addGrowthfileidGreaterThan(Integer value) {
            addCriterion("GROWTHFILEID >", value);
            return (Criteria) this;
        }

        public Criteria addGrowthfileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GROWTHFILEID >=", value);
            return (Criteria) this;
        }

        public Criteria addGrowthfileidLessThan(Integer value) {
            addCriterion("GROWTHFILEID <", value);
            return (Criteria) this;
        }

        public Criteria addGrowthfileidLessThanOrEqualTo(Integer value) {
            addCriterion("GROWTHFILEID <=", value);
            return (Criteria) this;
        }

        public Criteria addGrowthfileidIn(List<Integer> values) {
            addCriterion("GROWTHFILEID in", values);
            return (Criteria) this;
        }

        public Criteria addGrowthfileidNotIn(List<Integer> values) {
            addCriterion("GROWTHFILEID not in", values);
            return (Criteria) this;
        }

        public Criteria addGrowthfileidBetween(Integer value1, Integer value2) {
            addCriterion("GROWTHFILEID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addGrowthfileidNotBetween(Integer value1, Integer value2) {
            addCriterion("GROWTHFILEID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addGrowthidIsNull() {
            addCriterion("GROWTHID is null");
            return (Criteria) this;
        }

        public Criteria addGrowthidIsNotNull() {
            addCriterion("GROWTHID is not null");
            return (Criteria) this;
        }

        public Criteria addGrowthidEqualTo(Integer value) {
            addCriterion("GROWTHID =", value);
            return (Criteria) this;
        }

        public Criteria addGrowthidNotEqualTo(Integer value) {
            addCriterion("GROWTHID <>", value);
            return (Criteria) this;
        }

        public Criteria addGrowthidGreaterThan(Integer value) {
            addCriterion("GROWTHID >", value);
            return (Criteria) this;
        }

        public Criteria addGrowthidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GROWTHID >=", value);
            return (Criteria) this;
        }

        public Criteria addGrowthidLessThan(Integer value) {
            addCriterion("GROWTHID <", value);
            return (Criteria) this;
        }

        public Criteria addGrowthidLessThanOrEqualTo(Integer value) {
            addCriterion("GROWTHID <=", value);
            return (Criteria) this;
        }

        public Criteria addGrowthidIn(List<Integer> values) {
            addCriterion("GROWTHID in", values);
            return (Criteria) this;
        }

        public Criteria addGrowthidNotIn(List<Integer> values) {
            addCriterion("GROWTHID not in", values);
            return (Criteria) this;
        }

        public Criteria addGrowthidBetween(Integer value1, Integer value2) {
            addCriterion("GROWTHID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addGrowthidNotBetween(Integer value1, Integer value2) {
            addCriterion("GROWTHID not between", value1, value2);
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
    }
}