package com.wyan.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbTaocanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTaocanExample() {
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

        public Criteria andExcelIdIsNull() {
            addCriterion("excel_id is null");
            return (Criteria) this;
        }

        public Criteria andExcelIdIsNotNull() {
            addCriterion("excel_id is not null");
            return (Criteria) this;
        }

        public Criteria andExcelIdEqualTo(Integer value) {
            addCriterion("excel_id =", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdNotEqualTo(Integer value) {
            addCriterion("excel_id <>", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdGreaterThan(Integer value) {
            addCriterion("excel_id >", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("excel_id >=", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdLessThan(Integer value) {
            addCriterion("excel_id <", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdLessThanOrEqualTo(Integer value) {
            addCriterion("excel_id <=", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdIn(List<Integer> values) {
            addCriterion("excel_id in", values, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdNotIn(List<Integer> values) {
            addCriterion("excel_id not in", values, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdBetween(Integer value1, Integer value2) {
            addCriterion("excel_id between", value1, value2, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("excel_id not between", value1, value2, "excelId");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNull() {
            addCriterion("inputtime is null");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNotNull() {
            addCriterion("inputtime is not null");
            return (Criteria) this;
        }

        public Criteria andInputtimeEqualTo(Integer value) {
            addCriterion("inputtime =", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotEqualTo(Integer value) {
            addCriterion("inputtime <>", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThan(Integer value) {
            addCriterion("inputtime >", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("inputtime >=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThan(Integer value) {
            addCriterion("inputtime <", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThanOrEqualTo(Integer value) {
            addCriterion("inputtime <=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeIn(List<Integer> values) {
            addCriterion("inputtime in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotIn(List<Integer> values) {
            addCriterion("inputtime not in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeBetween(Integer value1, Integer value2) {
            addCriterion("inputtime between", value1, value2, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("inputtime not between", value1, value2, "inputtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
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