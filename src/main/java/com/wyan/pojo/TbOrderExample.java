package com.wyan.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
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

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(Long value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(Long value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(Long value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(Long value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(Long value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(Long value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<Long> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<Long> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(Long value1, Long value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(Long value1, Long value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andHaomaidIsNull() {
            addCriterion("haomaId is null");
            return (Criteria) this;
        }

        public Criteria andHaomaidIsNotNull() {
            addCriterion("haomaId is not null");
            return (Criteria) this;
        }

        public Criteria andHaomaidEqualTo(Long value) {
            addCriterion("haomaId =", value, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaidNotEqualTo(Long value) {
            addCriterion("haomaId <>", value, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaidGreaterThan(Long value) {
            addCriterion("haomaId >", value, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaidGreaterThanOrEqualTo(Long value) {
            addCriterion("haomaId >=", value, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaidLessThan(Long value) {
            addCriterion("haomaId <", value, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaidLessThanOrEqualTo(Long value) {
            addCriterion("haomaId <=", value, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaidIn(List<Long> values) {
            addCriterion("haomaId in", values, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaidNotIn(List<Long> values) {
            addCriterion("haomaId not in", values, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaidBetween(Long value1, Long value2) {
            addCriterion("haomaId between", value1, value2, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaidNotBetween(Long value1, Long value2) {
            addCriterion("haomaId not between", value1, value2, "haomaid");
            return (Criteria) this;
        }

        public Criteria andHaomaIsNull() {
            addCriterion("haoma is null");
            return (Criteria) this;
        }

        public Criteria andHaomaIsNotNull() {
            addCriterion("haoma is not null");
            return (Criteria) this;
        }

        public Criteria andHaomaEqualTo(String value) {
            addCriterion("haoma =", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotEqualTo(String value) {
            addCriterion("haoma <>", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaGreaterThan(String value) {
            addCriterion("haoma >", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaGreaterThanOrEqualTo(String value) {
            addCriterion("haoma >=", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaLessThan(String value) {
            addCriterion("haoma <", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaLessThanOrEqualTo(String value) {
            addCriterion("haoma <=", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaLike(String value) {
            addCriterion("haoma like", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotLike(String value) {
            addCriterion("haoma not like", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaIn(List<String> values) {
            addCriterion("haoma in", values, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotIn(List<String> values) {
            addCriterion("haoma not in", values, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaBetween(String value1, String value2) {
            addCriterion("haoma between", value1, value2, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotBetween(String value1, String value2) {
            addCriterion("haoma not between", value1, value2, "haoma");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Integer value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Integer value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Integer value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Integer value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Integer> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Integer> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSellerIsNull() {
            addCriterion("seller is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("seller is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(String value) {
            addCriterion("seller =", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(String value) {
            addCriterion("seller <>", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(String value) {
            addCriterion("seller >", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(String value) {
            addCriterion("seller >=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(String value) {
            addCriterion("seller <", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(String value) {
            addCriterion("seller <=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLike(String value) {
            addCriterion("seller like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotLike(String value) {
            addCriterion("seller not like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<String> values) {
            addCriterion("seller in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<String> values) {
            addCriterion("seller not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(String value1, String value2) {
            addCriterion("seller between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(String value1, String value2) {
            addCriterion("seller not between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(String value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(String value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(String value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(String value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(String value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(String value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLike(String value) {
            addCriterion("agent like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotLike(String value) {
            addCriterion("agent not like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<String> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<String> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(String value1, String value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(String value1, String value2) {
            addCriterion("agent not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Boolean value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Boolean value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Boolean value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Boolean value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Boolean value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Boolean value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Boolean> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Boolean> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Boolean value1, Boolean value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Boolean value1, Boolean value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCartstatusIsNull() {
            addCriterion("cartStatus is null");
            return (Criteria) this;
        }

        public Criteria andCartstatusIsNotNull() {
            addCriterion("cartStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCartstatusEqualTo(Integer value) {
            addCriterion("cartStatus =", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusNotEqualTo(Integer value) {
            addCriterion("cartStatus <>", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusGreaterThan(Integer value) {
            addCriterion("cartStatus >", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartStatus >=", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusLessThan(Integer value) {
            addCriterion("cartStatus <", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusLessThanOrEqualTo(Integer value) {
            addCriterion("cartStatus <=", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusIn(List<Integer> values) {
            addCriterion("cartStatus in", values, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusNotIn(List<Integer> values) {
            addCriterion("cartStatus not in", values, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusBetween(Integer value1, Integer value2) {
            addCriterion("cartStatus between", value1, value2, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cartStatus not between", value1, value2, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNull() {
            addCriterion("saleprice is null");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNotNull() {
            addCriterion("saleprice is not null");
            return (Criteria) this;
        }

        public Criteria andSalepriceEqualTo(Integer value) {
            addCriterion("saleprice =", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotEqualTo(Integer value) {
            addCriterion("saleprice <>", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThan(Integer value) {
            addCriterion("saleprice >", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleprice >=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThan(Integer value) {
            addCriterion("saleprice <", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThanOrEqualTo(Integer value) {
            addCriterion("saleprice <=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIn(List<Integer> values) {
            addCriterion("saleprice in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotIn(List<Integer> values) {
            addCriterion("saleprice not in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceBetween(Integer value1, Integer value2) {
            addCriterion("saleprice between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("saleprice not between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSellerbrandIsNull() {
            addCriterion("sellerBrand is null");
            return (Criteria) this;
        }

        public Criteria andSellerbrandIsNotNull() {
            addCriterion("sellerBrand is not null");
            return (Criteria) this;
        }

        public Criteria andSellerbrandEqualTo(String value) {
            addCriterion("sellerBrand =", value, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandNotEqualTo(String value) {
            addCriterion("sellerBrand <>", value, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandGreaterThan(String value) {
            addCriterion("sellerBrand >", value, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandGreaterThanOrEqualTo(String value) {
            addCriterion("sellerBrand >=", value, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandLessThan(String value) {
            addCriterion("sellerBrand <", value, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandLessThanOrEqualTo(String value) {
            addCriterion("sellerBrand <=", value, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandLike(String value) {
            addCriterion("sellerBrand like", value, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandNotLike(String value) {
            addCriterion("sellerBrand not like", value, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandIn(List<String> values) {
            addCriterion("sellerBrand in", values, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandNotIn(List<String> values) {
            addCriterion("sellerBrand not in", values, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandBetween(String value1, String value2) {
            addCriterion("sellerBrand between", value1, value2, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andSellerbrandNotBetween(String value1, String value2) {
            addCriterion("sellerBrand not between", value1, value2, "sellerbrand");
            return (Criteria) this;
        }

        public Criteria andWangluoIsNull() {
            addCriterion("wangluo is null");
            return (Criteria) this;
        }

        public Criteria andWangluoIsNotNull() {
            addCriterion("wangluo is not null");
            return (Criteria) this;
        }

        public Criteria andWangluoEqualTo(String value) {
            addCriterion("wangluo =", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoNotEqualTo(String value) {
            addCriterion("wangluo <>", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoGreaterThan(String value) {
            addCriterion("wangluo >", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoGreaterThanOrEqualTo(String value) {
            addCriterion("wangluo >=", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoLessThan(String value) {
            addCriterion("wangluo <", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoLessThanOrEqualTo(String value) {
            addCriterion("wangluo <=", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoLike(String value) {
            addCriterion("wangluo like", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoNotLike(String value) {
            addCriterion("wangluo not like", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoIn(List<String> values) {
            addCriterion("wangluo in", values, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoNotIn(List<String> values) {
            addCriterion("wangluo not in", values, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoBetween(String value1, String value2) {
            addCriterion("wangluo between", value1, value2, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWangluoNotBetween(String value1, String value2) {
            addCriterion("wangluo not between", value1, value2, "wangluo");
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