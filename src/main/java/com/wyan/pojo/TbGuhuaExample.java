package com.wyan.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbGuhuaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGuhuaExample() {
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

        public Criteria andHaomaIsNull() {
            addCriterion("haoma is null");
            return (Criteria) this;
        }

        public Criteria andHaomaIsNotNull() {
            addCriterion("haoma is not null");
            return (Criteria) this;
        }

        public Criteria andHaomaEqualTo(Long value) {
            addCriterion("haoma =", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotEqualTo(Long value) {
            addCriterion("haoma <>", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaGreaterThan(Long value) {
            addCriterion("haoma >", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaGreaterThanOrEqualTo(Long value) {
            addCriterion("haoma >=", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaLessThan(Long value) {
            addCriterion("haoma <", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaLessThanOrEqualTo(Long value) {
            addCriterion("haoma <=", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaIn(List<Long> values) {
            addCriterion("haoma in", values, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotIn(List<Long> values) {
            addCriterion("haoma not in", values, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaBetween(Long value1, Long value2) {
            addCriterion("haoma between", value1, value2, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotBetween(Long value1, Long value2) {
            addCriterion("haoma not between", value1, value2, "haoma");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityid is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityid is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Integer value) {
            addCriterion("cityid =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Integer value) {
            addCriterion("cityid <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Integer value) {
            addCriterion("cityid >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityid >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Integer value) {
            addCriterion("cityid <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Integer value) {
            addCriterion("cityid <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Integer> values) {
            addCriterion("cityid in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Integer> values) {
            addCriterion("cityid not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Integer value1, Integer value2) {
            addCriterion("cityid between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("cityid not between", value1, value2, "cityid");
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

        public Criteria andTaocanIsNull() {
            addCriterion("taocan is null");
            return (Criteria) this;
        }

        public Criteria andTaocanIsNotNull() {
            addCriterion("taocan is not null");
            return (Criteria) this;
        }

        public Criteria andTaocanEqualTo(Integer value) {
            addCriterion("taocan =", value, "taocan");
            return (Criteria) this;
        }

        public Criteria andTaocanNotEqualTo(Integer value) {
            addCriterion("taocan <>", value, "taocan");
            return (Criteria) this;
        }

        public Criteria andTaocanGreaterThan(Integer value) {
            addCriterion("taocan >", value, "taocan");
            return (Criteria) this;
        }

        public Criteria andTaocanGreaterThanOrEqualTo(Integer value) {
            addCriterion("taocan >=", value, "taocan");
            return (Criteria) this;
        }

        public Criteria andTaocanLessThan(Integer value) {
            addCriterion("taocan <", value, "taocan");
            return (Criteria) this;
        }

        public Criteria andTaocanLessThanOrEqualTo(Integer value) {
            addCriterion("taocan <=", value, "taocan");
            return (Criteria) this;
        }

        public Criteria andTaocanIn(List<Integer> values) {
            addCriterion("taocan in", values, "taocan");
            return (Criteria) this;
        }

        public Criteria andTaocanNotIn(List<Integer> values) {
            addCriterion("taocan not in", values, "taocan");
            return (Criteria) this;
        }

        public Criteria andTaocanBetween(Integer value1, Integer value2) {
            addCriterion("taocan between", value1, value2, "taocan");
            return (Criteria) this;
        }

        public Criteria andTaocanNotBetween(Integer value1, Integer value2) {
            addCriterion("taocan not between", value1, value2, "taocan");
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

        public Criteria andTuijianIsNull() {
            addCriterion("tuijian is null");
            return (Criteria) this;
        }

        public Criteria andTuijianIsNotNull() {
            addCriterion("tuijian is not null");
            return (Criteria) this;
        }

        public Criteria andTuijianEqualTo(Integer value) {
            addCriterion("tuijian =", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianNotEqualTo(Integer value) {
            addCriterion("tuijian <>", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianGreaterThan(Integer value) {
            addCriterion("tuijian >", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuijian >=", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianLessThan(Integer value) {
            addCriterion("tuijian <", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianLessThanOrEqualTo(Integer value) {
            addCriterion("tuijian <=", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianIn(List<Integer> values) {
            addCriterion("tuijian in", values, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianNotIn(List<Integer> values) {
            addCriterion("tuijian not in", values, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianBetween(Integer value1, Integer value2) {
            addCriterion("tuijian between", value1, value2, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianNotBetween(Integer value1, Integer value2) {
            addCriterion("tuijian not between", value1, value2, "tuijian");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiIsNull() {
            addCriterion("youxiaoqi is null");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiIsNotNull() {
            addCriterion("youxiaoqi is not null");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiEqualTo(Integer value) {
            addCriterion("youxiaoqi =", value, "youxiaoqi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiNotEqualTo(Integer value) {
            addCriterion("youxiaoqi <>", value, "youxiaoqi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiGreaterThan(Integer value) {
            addCriterion("youxiaoqi >", value, "youxiaoqi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiGreaterThanOrEqualTo(Integer value) {
            addCriterion("youxiaoqi >=", value, "youxiaoqi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiLessThan(Integer value) {
            addCriterion("youxiaoqi <", value, "youxiaoqi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiLessThanOrEqualTo(Integer value) {
            addCriterion("youxiaoqi <=", value, "youxiaoqi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiIn(List<Integer> values) {
            addCriterion("youxiaoqi in", values, "youxiaoqi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiNotIn(List<Integer> values) {
            addCriterion("youxiaoqi not in", values, "youxiaoqi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiBetween(Integer value1, Integer value2) {
            addCriterion("youxiaoqi between", value1, value2, "youxiaoqi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqiNotBetween(Integer value1, Integer value2) {
            addCriterion("youxiaoqi not between", value1, value2, "youxiaoqi");
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
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

        public Criteria andHitsEqualTo(Long value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Long value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Long value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Long value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Long value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Long value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Long> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Long> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Long value1, Long value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Long value1, Long value2) {
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