package com.wyan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCashLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCashLogExample() {
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

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_name =", value, "agentName");
            return (Criteria) this;
        }
        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("roleType =", value, "roleType");
            return (Criteria) this;
        }
        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentShopIsNull() {
            addCriterion("agent_shop is null");
            return (Criteria) this;
        }

        public Criteria andAgentShopIsNotNull() {
            addCriterion("agent_shop is not null");
            return (Criteria) this;
        }

        public Criteria andAgentShopEqualTo(String value) {
            addCriterion("agent_shop =", value, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopNotEqualTo(String value) {
            addCriterion("agent_shop <>", value, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopGreaterThan(String value) {
            addCriterion("agent_shop >", value, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopGreaterThanOrEqualTo(String value) {
            addCriterion("agent_shop >=", value, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopLessThan(String value) {
            addCriterion("agent_shop <", value, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopLessThanOrEqualTo(String value) {
            addCriterion("agent_shop <=", value, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopLike(String value) {
            addCriterion("agent_shop like", value, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopNotLike(String value) {
            addCriterion("agent_shop not like", value, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopIn(List<String> values) {
            addCriterion("agent_shop in", values, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopNotIn(List<String> values) {
            addCriterion("agent_shop not in", values, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopBetween(String value1, String value2) {
            addCriterion("agent_shop between", value1, value2, "agentShop");
            return (Criteria) this;
        }

        public Criteria andAgentShopNotBetween(String value1, String value2) {
            addCriterion("agent_shop not between", value1, value2, "agentShop");
            return (Criteria) this;
        }

        public Criteria andCashMoneyIsNull() {
            addCriterion("cash_money is null");
            return (Criteria) this;
        }

        public Criteria andCashMoneyIsNotNull() {
            addCriterion("cash_money is not null");
            return (Criteria) this;
        }

        public Criteria andCashMoneyEqualTo(Integer value) {
            addCriterion("cash_money =", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyNotEqualTo(Integer value) {
            addCriterion("cash_money <>", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyGreaterThan(Integer value) {
            addCriterion("cash_money >", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash_money >=", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyLessThan(Integer value) {
            addCriterion("cash_money <", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("cash_money <=", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyIn(List<Integer> values) {
            addCriterion("cash_money in", values, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyNotIn(List<Integer> values) {
            addCriterion("cash_money not in", values, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyBetween(Integer value1, Integer value2) {
            addCriterion("cash_money between", value1, value2, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("cash_money not between", value1, value2, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeIsNull() {
            addCriterion("agree_time is null");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeIsNotNull() {
            addCriterion("agree_time is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeEqualTo(Date value) {
            addCriterion("agree_time =", value, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeNotEqualTo(Date value) {
            addCriterion("agree_time <>", value, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeGreaterThan(Date value) {
            addCriterion("agree_time >", value, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("agree_time >=", value, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeLessThan(Date value) {
            addCriterion("agree_time <", value, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeLessThanOrEqualTo(Date value) {
            addCriterion("agree_time <=", value, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeIn(List<Date> values) {
            addCriterion("agree_time in", values, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeNotIn(List<Date> values) {
            addCriterion("agree_time not in", values, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeBetween(Date value1, Date value2) {
            addCriterion("agree_time between", value1, value2, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andAgreeTimeNotBetween(Date value1, Date value2) {
            addCriterion("agree_time not between", value1, value2, "agreeTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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