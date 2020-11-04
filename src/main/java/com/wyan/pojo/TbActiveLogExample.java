package com.wyan.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbActiveLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbActiveLogExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("add_time like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("add_time not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddDayIsNull() {
            addCriterion("add_day is null");
            return (Criteria) this;
        }

        public Criteria andAddDayIsNotNull() {
            addCriterion("add_day is not null");
            return (Criteria) this;
        }

        public Criteria andAddDayEqualTo(String value) {
            addCriterion("add_day =", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayNotEqualTo(String value) {
            addCriterion("add_day <>", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayGreaterThan(String value) {
            addCriterion("add_day >", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayGreaterThanOrEqualTo(String value) {
            addCriterion("add_day >=", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayLessThan(String value) {
            addCriterion("add_day <", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayLessThanOrEqualTo(String value) {
            addCriterion("add_day <=", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayLike(String value) {
            addCriterion("add_day like", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayNotLike(String value) {
            addCriterion("add_day not like", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayIn(List<String> values) {
            addCriterion("add_day in", values, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayNotIn(List<String> values) {
            addCriterion("add_day not in", values, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayBetween(String value1, String value2) {
            addCriterion("add_day between", value1, value2, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayNotBetween(String value1, String value2) {
            addCriterion("add_day not between", value1, value2, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddMonthIsNull() {
            addCriterion("add_month is null");
            return (Criteria) this;
        }

        public Criteria andAddMonthIsNotNull() {
            addCriterion("add_month is not null");
            return (Criteria) this;
        }

        public Criteria andAddMonthEqualTo(String value) {
            addCriterion("add_month =", value, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthNotEqualTo(String value) {
            addCriterion("add_month <>", value, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthGreaterThan(String value) {
            addCriterion("add_month >", value, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthGreaterThanOrEqualTo(String value) {
            addCriterion("add_month >=", value, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthLessThan(String value) {
            addCriterion("add_month <", value, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthLessThanOrEqualTo(String value) {
            addCriterion("add_month <=", value, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthLike(String value) {
            addCriterion("add_month like", value, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthNotLike(String value) {
            addCriterion("add_month not like", value, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthIn(List<String> values) {
            addCriterion("add_month in", values, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthNotIn(List<String> values) {
            addCriterion("add_month not in", values, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthBetween(String value1, String value2) {
            addCriterion("add_month between", value1, value2, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddMonthNotBetween(String value1, String value2) {
            addCriterion("add_month not between", value1, value2, "addMonth");
            return (Criteria) this;
        }

        public Criteria andAddYearIsNull() {
            addCriterion("add_year is null");
            return (Criteria) this;
        }

        public Criteria andAddYearIsNotNull() {
            addCriterion("add_year is not null");
            return (Criteria) this;
        }

        public Criteria andAddYearEqualTo(String value) {
            addCriterion("add_year =", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearNotEqualTo(String value) {
            addCriterion("add_year <>", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearGreaterThan(String value) {
            addCriterion("add_year >", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearGreaterThanOrEqualTo(String value) {
            addCriterion("add_year >=", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearLessThan(String value) {
            addCriterion("add_year <", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearLessThanOrEqualTo(String value) {
            addCriterion("add_year <=", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearLike(String value) {
            addCriterion("add_year like", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearNotLike(String value) {
            addCriterion("add_year not like", value, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearIn(List<String> values) {
            addCriterion("add_year in", values, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearNotIn(List<String> values) {
            addCriterion("add_year not in", values, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearBetween(String value1, String value2) {
            addCriterion("add_year between", value1, value2, "addYear");
            return (Criteria) this;
        }

        public Criteria andAddYearNotBetween(String value1, String value2) {
            addCriterion("add_year not between", value1, value2, "addYear");
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