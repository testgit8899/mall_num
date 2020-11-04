package com.wyan.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbHaoduanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbHaoduanExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYunyingshangIsNull() {
            addCriterion("yunyingshang is null");
            return (Criteria) this;
        }

        public Criteria andYunyingshangIsNotNull() {
            addCriterion("yunyingshang is not null");
            return (Criteria) this;
        }

        public Criteria andYunyingshangEqualTo(Integer value) {
            addCriterion("yunyingshang =", value, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andYunyingshangNotEqualTo(Integer value) {
            addCriterion("yunyingshang <>", value, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andYunyingshangGreaterThan(Integer value) {
            addCriterion("yunyingshang >", value, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andYunyingshangGreaterThanOrEqualTo(Integer value) {
            addCriterion("yunyingshang >=", value, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andYunyingshangLessThan(Integer value) {
            addCriterion("yunyingshang <", value, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andYunyingshangLessThanOrEqualTo(Integer value) {
            addCriterion("yunyingshang <=", value, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andYunyingshangIn(List<Integer> values) {
            addCriterion("yunyingshang in", values, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andYunyingshangNotIn(List<Integer> values) {
            addCriterion("yunyingshang not in", values, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andYunyingshangBetween(Integer value1, Integer value2) {
            addCriterion("yunyingshang between", value1, value2, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andYunyingshangNotBetween(Integer value1, Integer value2) {
            addCriterion("yunyingshang not between", value1, value2, "yunyingshang");
            return (Criteria) this;
        }

        public Criteria andHaoduanIsNull() {
            addCriterion("haoduan is null");
            return (Criteria) this;
        }

        public Criteria andHaoduanIsNotNull() {
            addCriterion("haoduan is not null");
            return (Criteria) this;
        }

        public Criteria andHaoduanEqualTo(Integer value) {
            addCriterion("haoduan =", value, "haoduan");
            return (Criteria) this;
        }

        public Criteria andHaoduanNotEqualTo(Integer value) {
            addCriterion("haoduan <>", value, "haoduan");
            return (Criteria) this;
        }

        public Criteria andHaoduanGreaterThan(Integer value) {
            addCriterion("haoduan >", value, "haoduan");
            return (Criteria) this;
        }

        public Criteria andHaoduanGreaterThanOrEqualTo(Integer value) {
            addCriterion("haoduan >=", value, "haoduan");
            return (Criteria) this;
        }

        public Criteria andHaoduanLessThan(Integer value) {
            addCriterion("haoduan <", value, "haoduan");
            return (Criteria) this;
        }

        public Criteria andHaoduanLessThanOrEqualTo(Integer value) {
            addCriterion("haoduan <=", value, "haoduan");
            return (Criteria) this;
        }

        public Criteria andHaoduanIn(List<Integer> values) {
            addCriterion("haoduan in", values, "haoduan");
            return (Criteria) this;
        }

        public Criteria andHaoduanNotIn(List<Integer> values) {
            addCriterion("haoduan not in", values, "haoduan");
            return (Criteria) this;
        }

        public Criteria andHaoduanBetween(Integer value1, Integer value2) {
            addCriterion("haoduan between", value1, value2, "haoduan");
            return (Criteria) this;
        }

        public Criteria andHaoduanNotBetween(Integer value1, Integer value2) {
            addCriterion("haoduan not between", value1, value2, "haoduan");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andListorderIsNull() {
            addCriterion("listorder is null");
            return (Criteria) this;
        }

        public Criteria andListorderIsNotNull() {
            addCriterion("listorder is not null");
            return (Criteria) this;
        }

        public Criteria andListorderEqualTo(Integer value) {
            addCriterion("listorder =", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotEqualTo(Integer value) {
            addCriterion("listorder <>", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderGreaterThan(Integer value) {
            addCriterion("listorder >", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("listorder >=", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderLessThan(Integer value) {
            addCriterion("listorder <", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderLessThanOrEqualTo(Integer value) {
            addCriterion("listorder <=", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderIn(List<Integer> values) {
            addCriterion("listorder in", values, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotIn(List<Integer> values) {
            addCriterion("listorder not in", values, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderBetween(Integer value1, Integer value2) {
            addCriterion("listorder between", value1, value2, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotBetween(Integer value1, Integer value2) {
            addCriterion("listorder not between", value1, value2, "listorder");
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