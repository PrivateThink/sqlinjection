package com.zengfeng.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("Fid is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Fid is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Fid =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Fid <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Fid >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fid >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Fid <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Fid <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Fid in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Fid not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Fid between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Fid not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Fname is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Fname is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Fname =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Fname <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Fname >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Fname >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Fname <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Fname <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Fname like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Fname not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Fname in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Fname not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Fname between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Fname not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("Fpass_word is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("Fpass_word is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("Fpass_word =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("Fpass_word <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("Fpass_word >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("Fpass_word >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("Fpass_word <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("Fpass_word <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("Fpass_word like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("Fpass_word not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("Fpass_word in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("Fpass_word not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("Fpass_word between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("Fpass_word not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Fsex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Fsex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("Fsex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("Fsex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("Fsex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("Fsex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("Fsex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("Fsex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("Fsex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("Fsex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("Fsex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("Fsex not between", value1, value2, "sex");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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