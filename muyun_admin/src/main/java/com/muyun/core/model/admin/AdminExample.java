package com.muyun.core.model.admin;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    public AdminExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_admin
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
     * This method corresponds to the database table muyun_admin
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
     * This method corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table muyun_admin
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
     * This class corresponds to the database table muyun_admin
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIsNull() {
            addCriterion("admin_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIsNotNull() {
            addCriterion("admin_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPwdEqualTo(String value) {
            addCriterion("admin_pwd =", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotEqualTo(String value) {
            addCriterion("admin_pwd <>", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdGreaterThan(String value) {
            addCriterion("admin_pwd >", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_pwd >=", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLessThan(String value) {
            addCriterion("admin_pwd <", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLessThanOrEqualTo(String value) {
            addCriterion("admin_pwd <=", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLike(String value) {
            addCriterion("admin_pwd like", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotLike(String value) {
            addCriterion("admin_pwd not like", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIn(List<String> values) {
            addCriterion("admin_pwd in", values, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotIn(List<String> values) {
            addCriterion("admin_pwd not in", values, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdBetween(String value1, String value2) {
            addCriterion("admin_pwd between", value1, value2, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotBetween(String value1, String value2) {
            addCriterion("admin_pwd not between", value1, value2, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminTelIsNull() {
            addCriterion("admin_tel is null");
            return (Criteria) this;
        }

        public Criteria andAdminTelIsNotNull() {
            addCriterion("admin_tel is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTelEqualTo(String value) {
            addCriterion("admin_tel =", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotEqualTo(String value) {
            addCriterion("admin_tel <>", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelGreaterThan(String value) {
            addCriterion("admin_tel >", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelGreaterThanOrEqualTo(String value) {
            addCriterion("admin_tel >=", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLessThan(String value) {
            addCriterion("admin_tel <", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLessThanOrEqualTo(String value) {
            addCriterion("admin_tel <=", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLike(String value) {
            addCriterion("admin_tel like", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotLike(String value) {
            addCriterion("admin_tel not like", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelIn(List<String> values) {
            addCriterion("admin_tel in", values, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotIn(List<String> values) {
            addCriterion("admin_tel not in", values, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelBetween(String value1, String value2) {
            addCriterion("admin_tel between", value1, value2, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotBetween(String value1, String value2) {
            addCriterion("admin_tel not between", value1, value2, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminAddrIsNull() {
            addCriterion("admin_addr is null");
            return (Criteria) this;
        }

        public Criteria andAdminAddrIsNotNull() {
            addCriterion("admin_addr is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAddrEqualTo(String value) {
            addCriterion("admin_addr =", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotEqualTo(String value) {
            addCriterion("admin_addr <>", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrGreaterThan(String value) {
            addCriterion("admin_addr >", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrGreaterThanOrEqualTo(String value) {
            addCriterion("admin_addr >=", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrLessThan(String value) {
            addCriterion("admin_addr <", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrLessThanOrEqualTo(String value) {
            addCriterion("admin_addr <=", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrLike(String value) {
            addCriterion("admin_addr like", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotLike(String value) {
            addCriterion("admin_addr not like", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrIn(List<String> values) {
            addCriterion("admin_addr in", values, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotIn(List<String> values) {
            addCriterion("admin_addr not in", values, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrBetween(String value1, String value2) {
            addCriterion("admin_addr between", value1, value2, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotBetween(String value1, String value2) {
            addCriterion("admin_addr not between", value1, value2, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminOtherIsNull() {
            addCriterion("admin_other is null");
            return (Criteria) this;
        }

        public Criteria andAdminOtherIsNotNull() {
            addCriterion("admin_other is not null");
            return (Criteria) this;
        }

        public Criteria andAdminOtherEqualTo(String value) {
            addCriterion("admin_other =", value, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherNotEqualTo(String value) {
            addCriterion("admin_other <>", value, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherGreaterThan(String value) {
            addCriterion("admin_other >", value, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherGreaterThanOrEqualTo(String value) {
            addCriterion("admin_other >=", value, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherLessThan(String value) {
            addCriterion("admin_other <", value, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherLessThanOrEqualTo(String value) {
            addCriterion("admin_other <=", value, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherLike(String value) {
            addCriterion("admin_other like", value, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherNotLike(String value) {
            addCriterion("admin_other not like", value, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherIn(List<String> values) {
            addCriterion("admin_other in", values, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherNotIn(List<String> values) {
            addCriterion("admin_other not in", values, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherBetween(String value1, String value2) {
            addCriterion("admin_other between", value1, value2, "adminOther");
            return (Criteria) this;
        }

        public Criteria andAdminOtherNotBetween(String value1, String value2) {
            addCriterion("admin_other not between", value1, value2, "adminOther");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table muyun_admin
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
     * This class corresponds to the database table muyun_admin
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