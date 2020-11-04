package com.wyan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbHaomaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbHaomaExample() {
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
        public Criteria andXfYearEqualTo(Integer value) {
            addCriterion("xf_year =", value, "xfYear");
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



        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }
        public Criteria andCellNumLike(String value) {
            addCriterion("cell_num like", value, "cellNum");
            return (Criteria) this;
        }
        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
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

        public Criteria andWaangluoIsNull() {
            addCriterion("wangluo is null");
            return (Criteria) this;
        }

        public Criteria andWaangluoIsNotNull() {
            addCriterion("wangluo is not null");
            return (Criteria) this;
        }

        public Criteria andWaangluoEqualTo(String value) {
            addCriterion("wangluo =", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoNotEqualTo(String value) {
            addCriterion("wangluo <>", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoGreaterThan(String value) {
            addCriterion("wangluo >", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoGreaterThanOrEqualTo(String value) {
            addCriterion("wangluo >=", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoLessThan(String value) {
            addCriterion("wangluo <", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoLessThanOrEqualTo(String value) {
            addCriterion("wangluo <=", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoLike(String value) {
            addCriterion("wangluo like", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoNotLike(String value) {
            addCriterion("wangluo not like", value, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoIn(List<String> values) {
            addCriterion("wangluo in", values, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoNotIn(List<String> values) {
            addCriterion("wangluo not in", values, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoBetween(String value1, String value2) {
            addCriterion("wangluo between", value1, value2, "wangluo");
            return (Criteria) this;
        }

        public Criteria andWaangluoNotBetween(String value1, String value2) {
            addCriterion("wangluo not between", value1, value2, "wangluo");
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

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Integer value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Integer value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Integer value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Integer value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Integer value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Integer> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Integer> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Integer value1, Integer value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceIsNull() {
            addCriterion("agent_price is null");
            return (Criteria) this;
        }

        public Criteria andAgentPriceIsNotNull() {
            addCriterion("agent_price is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPriceEqualTo(Integer value) {
            addCriterion("agent_price =", value, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceNotEqualTo(Integer value) {
            addCriterion("agent_price <>", value, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceGreaterThan(Integer value) {
            addCriterion("agent_price >", value, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_price >=", value, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceLessThan(Integer value) {
            addCriterion("agent_price <", value, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceLessThanOrEqualTo(Integer value) {
            addCriterion("agent_price <=", value, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceIn(List<Integer> values) {
            addCriterion("agent_price in", values, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceNotIn(List<Integer> values) {
            addCriterion("agent_price not in", values, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceBetween(Integer value1, Integer value2) {
            addCriterion("agent_price between", value1, value2, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andAgentPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_price not between", value1, value2, "agentPrice");
            return (Criteria) this;
        }

        public Criteria andHuafeiIsNull() {
            addCriterion("huafei is null");
            return (Criteria) this;
        }

        public Criteria andHuafeiIsNotNull() {
            addCriterion("huafei is not null");
            return (Criteria) this;
        }

        public Criteria andHuafeiEqualTo(Integer value) {
            addCriterion("huafei =", value, "huafei");
            return (Criteria) this;
        }

        public Criteria andHuafeiNotEqualTo(Integer value) {
            addCriterion("huafei <>", value, "huafei");
            return (Criteria) this;
        }

        public Criteria andHuafeiGreaterThan(Integer value) {
            addCriterion("huafei >", value, "huafei");
            return (Criteria) this;
        }

        public Criteria andHuafeiGreaterThanOrEqualTo(Integer value) {
            addCriterion("huafei >=", value, "huafei");
            return (Criteria) this;
        }

        public Criteria andHuafeiLessThan(Integer value) {
            addCriterion("huafei <", value, "huafei");
            return (Criteria) this;
        }

        public Criteria andHuafeiLessThanOrEqualTo(Integer value) {
            addCriterion("huafei <=", value, "huafei");
            return (Criteria) this;
        }

        public Criteria andHuafeiIn(List<Integer> values) {
            addCriterion("huafei in", values, "huafei");
            return (Criteria) this;
        }

        public Criteria andHuafeiNotIn(List<Integer> values) {
            addCriterion("huafei not in", values, "huafei");
            return (Criteria) this;
        }

        public Criteria andHuafeiBetween(Integer value1, Integer value2) {
            addCriterion("huafei between", value1, value2, "huafei");
            return (Criteria) this;
        }

        public Criteria andHuafeiNotBetween(Integer value1, Integer value2) {
            addCriterion("huafei not between", value1, value2, "huafei");
            return (Criteria) this;
        }

        public Criteria andDixiaoIsNull() {
            addCriterion("dixiao is null");
            return (Criteria) this;
        }

        public Criteria andDixiaoIsNotNull() {
            addCriterion("dixiao is not null");
            return (Criteria) this;
        }

        public Criteria andDixiaoEqualTo(Integer value) {
            addCriterion("dixiao =", value, "dixiao");
            return (Criteria) this;
        }

        public Criteria andDixiaoNotEqualTo(Integer value) {
            addCriterion("dixiao <>", value, "dixiao");
            return (Criteria) this;
        }

        public Criteria andDixiaoGreaterThan(Integer value) {
            addCriterion("dixiao >", value, "dixiao");
            return (Criteria) this;
        }

        public Criteria andDixiaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dixiao >=", value, "dixiao");
            return (Criteria) this;
        }

        public Criteria andDixiaoLessThan(Integer value) {
            addCriterion("dixiao <", value, "dixiao");
            return (Criteria) this;
        }

        public Criteria andDixiaoLessThanOrEqualTo(Integer value) {
            addCriterion("dixiao <=", value, "dixiao");
            return (Criteria) this;
        }

        public Criteria andDixiaoIn(List<Integer> values) {
            addCriterion("dixiao in", values, "dixiao");
            return (Criteria) this;
        }

        public Criteria andDixiaoNotIn(List<Integer> values) {
            addCriterion("dixiao not in", values, "dixiao");
            return (Criteria) this;
        }

        public Criteria andDixiaoBetween(Integer value1, Integer value2) {
            addCriterion("dixiao between", value1, value2, "dixiao");
            return (Criteria) this;
        }

        public Criteria andDixiaoNotBetween(Integer value1, Integer value2) {
            addCriterion("dixiao not between", value1, value2, "dixiao");
            return (Criteria) this;
        }

        public Criteria andInfomationIsNull() {
            addCriterion("infomation is null");
            return (Criteria) this;
        }

        public Criteria andInfomationIsNotNull() {
            addCriterion("infomation is not null");
            return (Criteria) this;
        }

        public Criteria andInfomationEqualTo(String value) {
            addCriterion("infomation =", value, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationNotEqualTo(String value) {
            addCriterion("infomation <>", value, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationGreaterThan(String value) {
            addCriterion("infomation >", value, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationGreaterThanOrEqualTo(String value) {
            addCriterion("infomation >=", value, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationLessThan(String value) {
            addCriterion("infomation <", value, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationLessThanOrEqualTo(String value) {
            addCriterion("infomation <=", value, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationLike(String value) {
            addCriterion("infomation like", value, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationNotLike(String value) {
            addCriterion("infomation not like", value, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationIn(List<String> values) {
            addCriterion("infomation in", values, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationNotIn(List<String> values) {
            addCriterion("infomation not in", values, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationBetween(String value1, String value2) {
            addCriterion("infomation between", value1, value2, "infomation");
            return (Criteria) this;
        }

        public Criteria andInfomationNotBetween(String value1, String value2) {
            addCriterion("infomation not between", value1, value2, "infomation");
            return (Criteria) this;
        }

        public Criteria andServiceNumIsNull() {
            addCriterion("service_num is null");
            return (Criteria) this;
        }

        public Criteria andServiceNumIsNotNull() {
            addCriterion("service_num is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNumEqualTo(Long value) {
            addCriterion("service_num =", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumNotEqualTo(Long value) {
            addCriterion("service_num <>", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumGreaterThan(Long value) {
            addCriterion("service_num >", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumGreaterThanOrEqualTo(Long value) {
            addCriterion("service_num >=", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumLessThan(Long value) {
            addCriterion("service_num <", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumLessThanOrEqualTo(Long value) {
            addCriterion("service_num <=", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumIn(List<Long> values) {
            addCriterion("service_num in", values, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumNotIn(List<Long> values) {
            addCriterion("service_num not in", values, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumBetween(Long value1, Long value2) {
            addCriterion("service_num between", value1, value2, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumNotBetween(Long value1, Long value2) {
            addCriterion("service_num not between", value1, value2, "serviceNum");
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

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andRecommondedIsNull() {
            addCriterion("recommonded is null");
            return (Criteria) this;
        }

        public Criteria andRecommondedIsNotNull() {
            addCriterion("recommonded is not null");
            return (Criteria) this;
        }

        public Criteria andRecommondedEqualTo(Integer value) {
            addCriterion("recommonded =", value, "recommonded");
            return (Criteria) this;
        }

        public Criteria andRecommondedNotEqualTo(Integer value) {
            addCriterion("recommonded <>", value, "recommonded");
            return (Criteria) this;
        }

        public Criteria andRecommondedGreaterThan(Integer value) {
            addCriterion("recommonded >", value, "recommonded");
            return (Criteria) this;
        }

        public Criteria andRecommondedGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommonded >=", value, "recommonded");
            return (Criteria) this;
        }

        public Criteria andRecommondedLessThan(Integer value) {
            addCriterion("recommonded <", value, "recommonded");
            return (Criteria) this;
        }

        public Criteria andRecommondedLessThanOrEqualTo(Integer value) {
            addCriterion("recommonded <=", value, "recommonded");
            return (Criteria) this;
        }

        public Criteria andRecommondedIn(List<Integer> values) {
            addCriterion("recommonded in", values, "recommonded");
            return (Criteria) this;
        }

        public Criteria andRecommondedNotIn(List<Integer> values) {
            addCriterion("recommonded not in", values, "recommonded");
            return (Criteria) this;
        }

        public Criteria andRecommondedBetween(Integer value1, Integer value2) {
            addCriterion("recommonded between", value1, value2, "recommonded");
            return (Criteria) this;
        }

        public Criteria andRecommondedNotBetween(Integer value1, Integer value2) {
            addCriterion("recommonded not between", value1, value2, "recommonded");
            return (Criteria) this;
        }

        public Criteria andSelltimeIsNull() {
            addCriterion("selltime is null");
            return (Criteria) this;
        }

        public Criteria andSelltimeIsNotNull() {
            addCriterion("selltime is not null");
            return (Criteria) this;
        }

        public Criteria andSelltimeEqualTo(Integer value) {
            addCriterion("selltime =", value, "selltime");
            return (Criteria) this;
        }

        public Criteria andSelltimeNotEqualTo(Integer value) {
            addCriterion("selltime <>", value, "selltime");
            return (Criteria) this;
        }

        public Criteria andSelltimeGreaterThan(Integer value) {
            addCriterion("selltime >", value, "selltime");
            return (Criteria) this;
        }

        public Criteria andSelltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("selltime >=", value, "selltime");
            return (Criteria) this;
        }

        public Criteria andSelltimeLessThan(Integer value) {
            addCriterion("selltime <", value, "selltime");
            return (Criteria) this;
        }

        public Criteria andSelltimeLessThanOrEqualTo(Integer value) {
            addCriterion("selltime <=", value, "selltime");
            return (Criteria) this;
        }

        public Criteria andSelltimeIn(List<Integer> values) {
            addCriterion("selltime in", values, "selltime");
            return (Criteria) this;
        }

        public Criteria andSelltimeNotIn(List<Integer> values) {
            addCriterion("selltime not in", values, "selltime");
            return (Criteria) this;
        }

        public Criteria andSelltimeBetween(Integer value1, Integer value2) {
            addCriterion("selltime between", value1, value2, "selltime");
            return (Criteria) this;
        }

        public Criteria andSelltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("selltime not between", value1, value2, "selltime");
            return (Criteria) this;
        }

        public Criteria andShareIsNull() {
            addCriterion("share is null");
            return (Criteria) this;
        }

        public Criteria andShareIsNotNull() {
            addCriterion("share is not null");
            return (Criteria) this;
        }

        public Criteria andShareEqualTo(Integer value) {
            addCriterion("share =", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotEqualTo(Integer value) {
            addCriterion("share <>", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareGreaterThan(Integer value) {
            addCriterion("share >", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareGreaterThanOrEqualTo(Integer value) {
            addCriterion("share >=", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareLessThan(Integer value) {
            addCriterion("share <", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareLessThanOrEqualTo(Integer value) {
            addCriterion("share <=", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareIn(List<Integer> values) {
            addCriterion("share in", values, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotIn(List<Integer> values) {
            addCriterion("share not in", values, "share");
            return (Criteria) this;
        }

        public Criteria andShareBetween(Integer value1, Integer value2) {
            addCriterion("share between", value1, value2, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotBetween(Integer value1, Integer value2) {
            addCriterion("share not between", value1, value2, "share");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andSellerBrandIsNull() {
            addCriterion("seller_brand is null");
            return (Criteria) this;
        }

        public Criteria andSellerBrandIsNotNull() {
            addCriterion("seller_brand is not null");
            return (Criteria) this;
        }

        public Criteria andSellerBrandEqualTo(String value) {
            addCriterion("seller_brand =", value, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandNotEqualTo(String value) {
            addCriterion("seller_brand <>", value, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandGreaterThan(String value) {
            addCriterion("seller_brand >", value, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandGreaterThanOrEqualTo(String value) {
            addCriterion("seller_brand >=", value, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandLessThan(String value) {
            addCriterion("seller_brand <", value, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandLessThanOrEqualTo(String value) {
            addCriterion("seller_brand <=", value, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandLike(String value) {
            addCriterion("seller_brand like", value, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandNotLike(String value) {
            addCriterion("seller_brand not like", value, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandIn(List<String> values) {
            addCriterion("seller_brand in", values, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandNotIn(List<String> values) {
            addCriterion("seller_brand not in", values, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandBetween(String value1, String value2) {
            addCriterion("seller_brand between", value1, value2, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andSellerBrandNotBetween(String value1, String value2) {
            addCriterion("seller_brand not between", value1, value2, "sellerBrand");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
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