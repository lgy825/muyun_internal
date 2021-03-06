package com.muyun.core.model.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_order
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
     * This method corresponds to the database table muyun_order
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
     * This method corresponds to the database table muyun_order
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_order
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
     * This class corresponds to the database table muyun_order
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(String value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(String value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(String value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(String value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(String value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(String value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLike(String value) {
            addCriterion("o_id like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotLike(String value) {
            addCriterion("o_id not like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<String> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<String> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(String value1, String value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(String value1, String value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
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

        public Criteria andODateIsNull() {
            addCriterion("o_date is null");
            return (Criteria) this;
        }

        public Criteria andODateIsNotNull() {
            addCriterion("o_date is not null");
            return (Criteria) this;
        }

        public Criteria andODateEqualTo(Date value) {
            addCriterion("o_date =", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotEqualTo(Date value) {
            addCriterion("o_date <>", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThan(Date value) {
            addCriterion("o_date >", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThanOrEqualTo(Date value) {
            addCriterion("o_date >=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThan(Date value) {
            addCriterion("o_date <", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThanOrEqualTo(Date value) {
            addCriterion("o_date <=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateIn(List<Date> values) {
            addCriterion("o_date in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotIn(List<Date> values) {
            addCriterion("o_date not in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateBetween(Date value1, Date value2) {
            addCriterion("o_date between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotBetween(Date value1, Date value2) {
            addCriterion("o_date not between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateIsNull() {
            addCriterion("o_start_date is null");
            return (Criteria) this;
        }

        public Criteria andOStartDateIsNotNull() {
            addCriterion("o_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andOStartDateEqualTo(Date value) {
            addCriterion("o_start_date =", value, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateNotEqualTo(Date value) {
            addCriterion("o_start_date <>", value, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateGreaterThan(Date value) {
            addCriterion("o_start_date >", value, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("o_start_date >=", value, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateLessThan(Date value) {
            addCriterion("o_start_date <", value, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateLessThanOrEqualTo(Date value) {
            addCriterion("o_start_date <=", value, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateIn(List<Date> values) {
            addCriterion("o_start_date in", values, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateNotIn(List<Date> values) {
            addCriterion("o_start_date not in", values, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateBetween(Date value1, Date value2) {
            addCriterion("o_start_date between", value1, value2, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOStartDateNotBetween(Date value1, Date value2) {
            addCriterion("o_start_date not between", value1, value2, "oStartDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateIsNull() {
            addCriterion("o_end_date is null");
            return (Criteria) this;
        }

        public Criteria andOEndDateIsNotNull() {
            addCriterion("o_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andOEndDateEqualTo(Date value) {
            addCriterion("o_end_date =", value, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateNotEqualTo(Date value) {
            addCriterion("o_end_date <>", value, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateGreaterThan(Date value) {
            addCriterion("o_end_date >", value, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("o_end_date >=", value, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateLessThan(Date value) {
            addCriterion("o_end_date <", value, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateLessThanOrEqualTo(Date value) {
            addCriterion("o_end_date <=", value, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateIn(List<Date> values) {
            addCriterion("o_end_date in", values, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateNotIn(List<Date> values) {
            addCriterion("o_end_date not in", values, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateBetween(Date value1, Date value2) {
            addCriterion("o_end_date between", value1, value2, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOEndDateNotBetween(Date value1, Date value2) {
            addCriterion("o_end_date not between", value1, value2, "oEndDate");
            return (Criteria) this;
        }

        public Criteria andOActAmountIsNull() {
            addCriterion("o_act_amount is null");
            return (Criteria) this;
        }

        public Criteria andOActAmountIsNotNull() {
            addCriterion("o_act_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOActAmountEqualTo(Double value) {
            addCriterion("o_act_amount =", value, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andOActAmountNotEqualTo(Double value) {
            addCriterion("o_act_amount <>", value, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andOActAmountGreaterThan(Double value) {
            addCriterion("o_act_amount >", value, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andOActAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("o_act_amount >=", value, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andOActAmountLessThan(Double value) {
            addCriterion("o_act_amount <", value, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andOActAmountLessThanOrEqualTo(Double value) {
            addCriterion("o_act_amount <=", value, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andOActAmountIn(List<Double> values) {
            addCriterion("o_act_amount in", values, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andOActAmountNotIn(List<Double> values) {
            addCriterion("o_act_amount not in", values, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andOActAmountBetween(Double value1, Double value2) {
            addCriterion("o_act_amount between", value1, value2, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andOActAmountNotBetween(Double value1, Double value2) {
            addCriterion("o_act_amount not between", value1, value2, "oActAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountIsNull() {
            addCriterion("o_rec_amount is null");
            return (Criteria) this;
        }

        public Criteria andORecAmountIsNotNull() {
            addCriterion("o_rec_amount is not null");
            return (Criteria) this;
        }

        public Criteria andORecAmountEqualTo(Double value) {
            addCriterion("o_rec_amount =", value, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountNotEqualTo(Double value) {
            addCriterion("o_rec_amount <>", value, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountGreaterThan(Double value) {
            addCriterion("o_rec_amount >", value, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("o_rec_amount >=", value, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountLessThan(Double value) {
            addCriterion("o_rec_amount <", value, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountLessThanOrEqualTo(Double value) {
            addCriterion("o_rec_amount <=", value, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountIn(List<Double> values) {
            addCriterion("o_rec_amount in", values, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountNotIn(List<Double> values) {
            addCriterion("o_rec_amount not in", values, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountBetween(Double value1, Double value2) {
            addCriterion("o_rec_amount between", value1, value2, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andORecAmountNotBetween(Double value1, Double value2) {
            addCriterion("o_rec_amount not between", value1, value2, "oRecAmount");
            return (Criteria) this;
        }

        public Criteria andOSourceIsNull() {
            addCriterion("o_source is null");
            return (Criteria) this;
        }

        public Criteria andOSourceIsNotNull() {
            addCriterion("o_source is not null");
            return (Criteria) this;
        }

        public Criteria andOSourceEqualTo(String value) {
            addCriterion("o_source =", value, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceNotEqualTo(String value) {
            addCriterion("o_source <>", value, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceGreaterThan(String value) {
            addCriterion("o_source >", value, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceGreaterThanOrEqualTo(String value) {
            addCriterion("o_source >=", value, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceLessThan(String value) {
            addCriterion("o_source <", value, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceLessThanOrEqualTo(String value) {
            addCriterion("o_source <=", value, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceLike(String value) {
            addCriterion("o_source like", value, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceNotLike(String value) {
            addCriterion("o_source not like", value, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceIn(List<String> values) {
            addCriterion("o_source in", values, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceNotIn(List<String> values) {
            addCriterion("o_source not in", values, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceBetween(String value1, String value2) {
            addCriterion("o_source between", value1, value2, "oSource");
            return (Criteria) this;
        }

        public Criteria andOSourceNotBetween(String value1, String value2) {
            addCriterion("o_source not between", value1, value2, "oSource");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNull() {
            addCriterion("o_status is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("o_status is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(Integer value) {
            addCriterion("o_status =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(Integer value) {
            addCriterion("o_status <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(Integer value) {
            addCriterion("o_status >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_status >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(Integer value) {
            addCriterion("o_status <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(Integer value) {
            addCriterion("o_status <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<Integer> values) {
            addCriterion("o_status in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<Integer> values) {
            addCriterion("o_status not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(Integer value1, Integer value2) {
            addCriterion("o_status between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("o_status not between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOWayIsNull() {
            addCriterion("o_way is null");
            return (Criteria) this;
        }

        public Criteria andOWayIsNotNull() {
            addCriterion("o_way is not null");
            return (Criteria) this;
        }

        public Criteria andOWayEqualTo(Integer value) {
            addCriterion("o_way =", value, "oWay");
            return (Criteria) this;
        }

        public Criteria andOWayNotEqualTo(Integer value) {
            addCriterion("o_way <>", value, "oWay");
            return (Criteria) this;
        }

        public Criteria andOWayGreaterThan(Integer value) {
            addCriterion("o_way >", value, "oWay");
            return (Criteria) this;
        }

        public Criteria andOWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_way >=", value, "oWay");
            return (Criteria) this;
        }

        public Criteria andOWayLessThan(Integer value) {
            addCriterion("o_way <", value, "oWay");
            return (Criteria) this;
        }

        public Criteria andOWayLessThanOrEqualTo(Integer value) {
            addCriterion("o_way <=", value, "oWay");
            return (Criteria) this;
        }

        public Criteria andOWayIn(List<Integer> values) {
            addCriterion("o_way in", values, "oWay");
            return (Criteria) this;
        }

        public Criteria andOWayNotIn(List<Integer> values) {
            addCriterion("o_way not in", values, "oWay");
            return (Criteria) this;
        }

        public Criteria andOWayBetween(Integer value1, Integer value2) {
            addCriterion("o_way between", value1, value2, "oWay");
            return (Criteria) this;
        }

        public Criteria andOWayNotBetween(Integer value1, Integer value2) {
            addCriterion("o_way not between", value1, value2, "oWay");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table muyun_order
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
     * This class corresponds to the database table muyun_order
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