package com.muyun.core.model.hourse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HourseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    public HourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
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
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(String value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(String value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(String value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(String value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(String value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(String value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLike(String value) {
            addCriterion("h_id like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotLike(String value) {
            addCriterion("h_id not like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<String> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<String> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(String value1, String value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(String value1, String value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("u_id like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("u_id not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaIsNull() {
            addCriterion("h_number_area is null");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaIsNotNull() {
            addCriterion("h_number_area is not null");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaEqualTo(String value) {
            addCriterion("h_number_area =", value, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaNotEqualTo(String value) {
            addCriterion("h_number_area <>", value, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaGreaterThan(String value) {
            addCriterion("h_number_area >", value, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaGreaterThanOrEqualTo(String value) {
            addCriterion("h_number_area >=", value, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaLessThan(String value) {
            addCriterion("h_number_area <", value, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaLessThanOrEqualTo(String value) {
            addCriterion("h_number_area <=", value, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaLike(String value) {
            addCriterion("h_number_area like", value, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaNotLike(String value) {
            addCriterion("h_number_area not like", value, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaIn(List<String> values) {
            addCriterion("h_number_area in", values, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaNotIn(List<String> values) {
            addCriterion("h_number_area not in", values, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaBetween(String value1, String value2) {
            addCriterion("h_number_area between", value1, value2, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberAreaNotBetween(String value1, String value2) {
            addCriterion("h_number_area not between", value1, value2, "hNumberArea");
            return (Criteria) this;
        }

        public Criteria andHNumberIsNull() {
            addCriterion("h_number is null");
            return (Criteria) this;
        }

        public Criteria andHNumberIsNotNull() {
            addCriterion("h_number is not null");
            return (Criteria) this;
        }

        public Criteria andHNumberEqualTo(String value) {
            addCriterion("h_number =", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotEqualTo(String value) {
            addCriterion("h_number <>", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberGreaterThan(String value) {
            addCriterion("h_number >", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberGreaterThanOrEqualTo(String value) {
            addCriterion("h_number >=", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberLessThan(String value) {
            addCriterion("h_number <", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberLessThanOrEqualTo(String value) {
            addCriterion("h_number <=", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberLike(String value) {
            addCriterion("h_number like", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotLike(String value) {
            addCriterion("h_number not like", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberIn(List<String> values) {
            addCriterion("h_number in", values, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotIn(List<String> values) {
            addCriterion("h_number not in", values, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberBetween(String value1, String value2) {
            addCriterion("h_number between", value1, value2, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotBetween(String value1, String value2) {
            addCriterion("h_number not between", value1, value2, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHDescIsNull() {
            addCriterion("h_desc is null");
            return (Criteria) this;
        }

        public Criteria andHDescIsNotNull() {
            addCriterion("h_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHDescEqualTo(String value) {
            addCriterion("h_desc =", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotEqualTo(String value) {
            addCriterion("h_desc <>", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescGreaterThan(String value) {
            addCriterion("h_desc >", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescGreaterThanOrEqualTo(String value) {
            addCriterion("h_desc >=", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescLessThan(String value) {
            addCriterion("h_desc <", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescLessThanOrEqualTo(String value) {
            addCriterion("h_desc <=", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescLike(String value) {
            addCriterion("h_desc like", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotLike(String value) {
            addCriterion("h_desc not like", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescIn(List<String> values) {
            addCriterion("h_desc in", values, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotIn(List<String> values) {
            addCriterion("h_desc not in", values, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescBetween(String value1, String value2) {
            addCriterion("h_desc between", value1, value2, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotBetween(String value1, String value2) {
            addCriterion("h_desc not between", value1, value2, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHAddrIsNull() {
            addCriterion("h_addr is null");
            return (Criteria) this;
        }

        public Criteria andHAddrIsNotNull() {
            addCriterion("h_addr is not null");
            return (Criteria) this;
        }

        public Criteria andHAddrEqualTo(String value) {
            addCriterion("h_addr =", value, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrNotEqualTo(String value) {
            addCriterion("h_addr <>", value, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrGreaterThan(String value) {
            addCriterion("h_addr >", value, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrGreaterThanOrEqualTo(String value) {
            addCriterion("h_addr >=", value, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrLessThan(String value) {
            addCriterion("h_addr <", value, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrLessThanOrEqualTo(String value) {
            addCriterion("h_addr <=", value, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrLike(String value) {
            addCriterion("h_addr like", value, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrNotLike(String value) {
            addCriterion("h_addr not like", value, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrIn(List<String> values) {
            addCriterion("h_addr in", values, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrNotIn(List<String> values) {
            addCriterion("h_addr not in", values, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrBetween(String value1, String value2) {
            addCriterion("h_addr between", value1, value2, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHAddrNotBetween(String value1, String value2) {
            addCriterion("h_addr not between", value1, value2, "hAddr");
            return (Criteria) this;
        }

        public Criteria andHDateIsNull() {
            addCriterion("h_date is null");
            return (Criteria) this;
        }

        public Criteria andHDateIsNotNull() {
            addCriterion("h_date is not null");
            return (Criteria) this;
        }

        public Criteria andHDateEqualTo(Date value) {
            addCriterion("h_date =", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateNotEqualTo(Date value) {
            addCriterion("h_date <>", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateGreaterThan(Date value) {
            addCriterion("h_date >", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateGreaterThanOrEqualTo(Date value) {
            addCriterion("h_date >=", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateLessThan(Date value) {
            addCriterion("h_date <", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateLessThanOrEqualTo(Date value) {
            addCriterion("h_date <=", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateIn(List<Date> values) {
            addCriterion("h_date in", values, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateNotIn(List<Date> values) {
            addCriterion("h_date not in", values, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateBetween(Date value1, Date value2) {
            addCriterion("h_date between", value1, value2, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateNotBetween(Date value1, Date value2) {
            addCriterion("h_date not between", value1, value2, "hDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table muyun_hourse
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table muyun_hourse
     *
     * @mbggenerated
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