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
public class UploadFileFilter extends BaseFilter<UploadFileFilter.Criteria> {

	private static final long serialVersionUID = 6110293007391313176L;

	@Override
	public Criteria buildCriteria() {
		return null;
	}

    /**
     * table tb_file
     */
    protected static class Criteria extends CriteriaBased {

		private static final long serialVersionUID = 2959431587215074633L;

		public Criteria addIdIsNull() {
            addCriterion("FILEID is null");
            return (Criteria) this;
        }

        public Criteria addIdIsNotNull() {
            addCriterion("FILEID is not null");
            return (Criteria) this;
        }

        public Criteria addIdEqualTo(Integer value) {
            addCriterion("FILEID =", value);
            return (Criteria) this;
        }

        public Criteria addIdNotEqualTo(Integer value) {
            addCriterion("FILEID <>", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThan(Integer value) {
            addCriterion("FILEID >", value);
            return (Criteria) this;
        }

        public Criteria addIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILEID >=", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThan(Integer value) {
            addCriterion("FILEID <", value);
            return (Criteria) this;
        }

        public Criteria addIdLessThanOrEqualTo(Integer value) {
            addCriterion("FILEID <=", value);
            return (Criteria) this;
        }

        public Criteria addIdIn(List<Integer> values) {
            addCriterion("FILEID in", values);
            return (Criteria) this;
        }

        public Criteria addIdNotIn(List<Integer> values) {
            addCriterion("FILEID not in", values);
            return (Criteria) this;
        }

        public Criteria addIdBetween(Integer value1, Integer value2) {
            addCriterion("FILEID between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FILEID not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria addNameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria addNameEqualTo(String value) {
            addCriterion("FILENAME =", value);
            return (Criteria) this;
        }

        public Criteria addNameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value);
            return (Criteria) this;
        }

        public Criteria addNameGreaterThan(String value) {
            addCriterion("FILENAME >", value);
            return (Criteria) this;
        }

        public Criteria addNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value);
            return (Criteria) this;
        }

        public Criteria addNameLessThan(String value) {
            addCriterion("FILENAME <", value);
            return (Criteria) this;
        }

        public Criteria addNameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value);
            return (Criteria) this;
        }

        public Criteria addNameLike(String value) {
            addCriterion("FILENAME like", value);
            return (Criteria) this;
        }

        public Criteria addNameNotLike(String value) {
            addCriterion("FILENAME not like", value);
            return (Criteria) this;
        }

        public Criteria addNameIn(List<String> values) {
            addCriterion("FILENAME in", values);
            return (Criteria) this;
        }

        public Criteria addNameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values);
            return (Criteria) this;
        }

        public Criteria addNameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addNameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addPathIsNull() {
            addCriterion("FILEPATH is null");
            return (Criteria) this;
        }

        public Criteria addPathIsNotNull() {
            addCriterion("FILEPATH is not null");
            return (Criteria) this;
        }

        public Criteria addPathEqualTo(String value) {
            addCriterion("FILEPATH =", value);
            return (Criteria) this;
        }

        public Criteria addPathNotEqualTo(String value) {
            addCriterion("FILEPATH <>", value);
            return (Criteria) this;
        }

        public Criteria addPathGreaterThan(String value) {
            addCriterion("FILEPATH >", value);
            return (Criteria) this;
        }

        public Criteria addPathGreaterThanOrEqualTo(String value) {
            addCriterion("FILEPATH >=", value);
            return (Criteria) this;
        }

        public Criteria addPathLessThan(String value) {
            addCriterion("FILEPATH <", value);
            return (Criteria) this;
        }

        public Criteria addPathLessThanOrEqualTo(String value) {
            addCriterion("FILEPATH <=", value);
            return (Criteria) this;
        }

        public Criteria addPathLike(String value) {
            addCriterion("FILEPATH like", value);
            return (Criteria) this;
        }

        public Criteria addPathNotLike(String value) {
            addCriterion("FILEPATH not like", value);
            return (Criteria) this;
        }

        public Criteria addPathIn(List<String> values) {
            addCriterion("FILEPATH in", values);
            return (Criteria) this;
        }

        public Criteria addPathNotIn(List<String> values) {
            addCriterion("FILEPATH not in", values);
            return (Criteria) this;
        }

        public Criteria addPathBetween(String value1, String value2) {
            addCriterion("FILEPATH between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addPathNotBetween(String value1, String value2) {
            addCriterion("FILEPATH not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addSizeIsNull() {
            addCriterion("FILESIZE is null");
            return (Criteria) this;
        }

        public Criteria addSizeIsNotNull() {
            addCriterion("FILESIZE is not null");
            return (Criteria) this;
        }

        public Criteria addSizeEqualTo(Integer value) {
            addCriterion("FILESIZE =", value);
            return (Criteria) this;
        }

        public Criteria addSizeNotEqualTo(Integer value) {
            addCriterion("FILESIZE <>", value);
            return (Criteria) this;
        }

        public Criteria addSizeGreaterThan(Integer value) {
            addCriterion("FILESIZE >", value);
            return (Criteria) this;
        }

        public Criteria addSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILESIZE >=", value);
            return (Criteria) this;
        }

        public Criteria addSizeLessThan(Integer value) {
            addCriterion("FILESIZE <", value);
            return (Criteria) this;
        }

        public Criteria addSizeLessThanOrEqualTo(Integer value) {
            addCriterion("FILESIZE <=", value);
            return (Criteria) this;
        }

        public Criteria addSizeIn(List<Integer> values) {
            addCriterion("FILESIZE in", values);
            return (Criteria) this;
        }

        public Criteria addSizeNotIn(List<Integer> values) {
            addCriterion("FILESIZE not in", values);
            return (Criteria) this;
        }

        public Criteria addSizeBetween(Integer value1, Integer value2) {
            addCriterion("FILESIZE between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("FILESIZE not between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addUserfilenameIsNull() {
            addCriterion("USERFILENAME is null");
            return (Criteria) this;
        }

        public Criteria addUserfilenameIsNotNull() {
            addCriterion("USERFILENAME is not null");
            return (Criteria) this;
        }

        public Criteria addUserfilenameEqualTo(String value) {
            addCriterion("USERFILENAME =", value);
            return (Criteria) this;
        }

        public Criteria addUserfilenameNotEqualTo(String value) {
            addCriterion("USERFILENAME <>", value);
            return (Criteria) this;
        }

        public Criteria addUserfilenameGreaterThan(String value) {
            addCriterion("USERFILENAME >", value);
            return (Criteria) this;
        }

        public Criteria addUserfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("USERFILENAME >=", value);
            return (Criteria) this;
        }

        public Criteria addUserfilenameLessThan(String value) {
            addCriterion("USERFILENAME <", value);
            return (Criteria) this;
        }

        public Criteria addUserfilenameLessThanOrEqualTo(String value) {
            addCriterion("USERFILENAME <=", value);
            return (Criteria) this;
        }

        public Criteria addUserfilenameLike(String value) {
            addCriterion("USERFILENAME like", value);
            return (Criteria) this;
        }

        public Criteria addUserfilenameNotLike(String value) {
            addCriterion("USERFILENAME not like", value);
            return (Criteria) this;
        }

        public Criteria addUserfilenameIn(List<String> values) {
            addCriterion("USERFILENAME in", values);
            return (Criteria) this;
        }

        public Criteria addUserfilenameNotIn(List<String> values) {
            addCriterion("USERFILENAME not in", values);
            return (Criteria) this;
        }

        public Criteria addUserfilenameBetween(String value1, String value2) {
            addCriterion("USERFILENAME between", value1, value2);
            return (Criteria) this;
        }

        public Criteria addUserfilenameNotBetween(String value1, String value2) {
            addCriterion("USERFILENAME not between", value1, value2);
            return (Criteria) this;
        }
    }
}