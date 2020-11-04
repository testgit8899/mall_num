package com.wyan.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCategoryExample() {
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

        public Criteria andCatidIsNull() {
            addCriterion("catid is null");
            return (Criteria) this;
        }

        public Criteria andCatidIsNotNull() {
            addCriterion("catid is not null");
            return (Criteria) this;
        }

        public Criteria andCatidEqualTo(Integer value) {
            addCriterion("catid =", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotEqualTo(Integer value) {
            addCriterion("catid <>", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidGreaterThan(Integer value) {
            addCriterion("catid >", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("catid >=", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidLessThan(Integer value) {
            addCriterion("catid <", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidLessThanOrEqualTo(Integer value) {
            addCriterion("catid <=", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidIn(List<Integer> values) {
            addCriterion("catid in", values, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotIn(List<Integer> values) {
            addCriterion("catid not in", values, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidBetween(Integer value1, Integer value2) {
            addCriterion("catid between", value1, value2, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotBetween(Integer value1, Integer value2) {
            addCriterion("catid not between", value1, value2, "catid");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("module is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("module is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("module =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("module <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("module >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("module >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("module <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("module <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("module like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("module not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("module in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("module not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("module between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("module not between", value1, value2, "module");
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

        public Criteria andModelidIsNull() {
            addCriterion("modelid is null");
            return (Criteria) this;
        }

        public Criteria andModelidIsNotNull() {
            addCriterion("modelid is not null");
            return (Criteria) this;
        }

        public Criteria andModelidEqualTo(Integer value) {
            addCriterion("modelid =", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotEqualTo(Integer value) {
            addCriterion("modelid <>", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThan(Integer value) {
            addCriterion("modelid >", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("modelid >=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThan(Integer value) {
            addCriterion("modelid <", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThanOrEqualTo(Integer value) {
            addCriterion("modelid <=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidIn(List<Integer> values) {
            addCriterion("modelid in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotIn(List<Integer> values) {
            addCriterion("modelid not in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidBetween(Integer value1, Integer value2) {
            addCriterion("modelid between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotBetween(Integer value1, Integer value2) {
            addCriterion("modelid not between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidIsNull() {
            addCriterion("arrparentid is null");
            return (Criteria) this;
        }

        public Criteria andArrparentidIsNotNull() {
            addCriterion("arrparentid is not null");
            return (Criteria) this;
        }

        public Criteria andArrparentidEqualTo(String value) {
            addCriterion("arrparentid =", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidNotEqualTo(String value) {
            addCriterion("arrparentid <>", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidGreaterThan(String value) {
            addCriterion("arrparentid >", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidGreaterThanOrEqualTo(String value) {
            addCriterion("arrparentid >=", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidLessThan(String value) {
            addCriterion("arrparentid <", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidLessThanOrEqualTo(String value) {
            addCriterion("arrparentid <=", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidLike(String value) {
            addCriterion("arrparentid like", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidNotLike(String value) {
            addCriterion("arrparentid not like", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidIn(List<String> values) {
            addCriterion("arrparentid in", values, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidNotIn(List<String> values) {
            addCriterion("arrparentid not in", values, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidBetween(String value1, String value2) {
            addCriterion("arrparentid between", value1, value2, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidNotBetween(String value1, String value2) {
            addCriterion("arrparentid not between", value1, value2, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andChildIsNull() {
            addCriterion("child is null");
            return (Criteria) this;
        }

        public Criteria andChildIsNotNull() {
            addCriterion("child is not null");
            return (Criteria) this;
        }

        public Criteria andChildEqualTo(Integer value) {
            addCriterion("child =", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotEqualTo(Integer value) {
            addCriterion("child <>", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThan(Integer value) {
            addCriterion("child >", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThanOrEqualTo(Integer value) {
            addCriterion("child >=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThan(Integer value) {
            addCriterion("child <", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThanOrEqualTo(Integer value) {
            addCriterion("child <=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildIn(List<Integer> values) {
            addCriterion("child in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotIn(List<Integer> values) {
            addCriterion("child not in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildBetween(Integer value1, Integer value2) {
            addCriterion("child between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotBetween(Integer value1, Integer value2) {
            addCriterion("child not between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andCatnameIsNull() {
            addCriterion("catname is null");
            return (Criteria) this;
        }

        public Criteria andCatnameIsNotNull() {
            addCriterion("catname is not null");
            return (Criteria) this;
        }

        public Criteria andCatnameEqualTo(String value) {
            addCriterion("catname =", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameNotEqualTo(String value) {
            addCriterion("catname <>", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameGreaterThan(String value) {
            addCriterion("catname >", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameGreaterThanOrEqualTo(String value) {
            addCriterion("catname >=", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameLessThan(String value) {
            addCriterion("catname <", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameLessThanOrEqualTo(String value) {
            addCriterion("catname <=", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameLike(String value) {
            addCriterion("catname like", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameNotLike(String value) {
            addCriterion("catname not like", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameIn(List<String> values) {
            addCriterion("catname in", values, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameNotIn(List<String> values) {
            addCriterion("catname not in", values, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameBetween(String value1, String value2) {
            addCriterion("catname between", value1, value2, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameNotBetween(String value1, String value2) {
            addCriterion("catname not between", value1, value2, "catname");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andParentdirIsNull() {
            addCriterion("parentdir is null");
            return (Criteria) this;
        }

        public Criteria andParentdirIsNotNull() {
            addCriterion("parentdir is not null");
            return (Criteria) this;
        }

        public Criteria andParentdirEqualTo(String value) {
            addCriterion("parentdir =", value, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirNotEqualTo(String value) {
            addCriterion("parentdir <>", value, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirGreaterThan(String value) {
            addCriterion("parentdir >", value, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirGreaterThanOrEqualTo(String value) {
            addCriterion("parentdir >=", value, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirLessThan(String value) {
            addCriterion("parentdir <", value, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirLessThanOrEqualTo(String value) {
            addCriterion("parentdir <=", value, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirLike(String value) {
            addCriterion("parentdir like", value, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirNotLike(String value) {
            addCriterion("parentdir not like", value, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirIn(List<String> values) {
            addCriterion("parentdir in", values, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirNotIn(List<String> values) {
            addCriterion("parentdir not in", values, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirBetween(String value1, String value2) {
            addCriterion("parentdir between", value1, value2, "parentdir");
            return (Criteria) this;
        }

        public Criteria andParentdirNotBetween(String value1, String value2) {
            addCriterion("parentdir not between", value1, value2, "parentdir");
            return (Criteria) this;
        }

        public Criteria andCatdirIsNull() {
            addCriterion("catdir is null");
            return (Criteria) this;
        }

        public Criteria andCatdirIsNotNull() {
            addCriterion("catdir is not null");
            return (Criteria) this;
        }

        public Criteria andCatdirEqualTo(String value) {
            addCriterion("catdir =", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirNotEqualTo(String value) {
            addCriterion("catdir <>", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirGreaterThan(String value) {
            addCriterion("catdir >", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirGreaterThanOrEqualTo(String value) {
            addCriterion("catdir >=", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirLessThan(String value) {
            addCriterion("catdir <", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirLessThanOrEqualTo(String value) {
            addCriterion("catdir <=", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirLike(String value) {
            addCriterion("catdir like", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirNotLike(String value) {
            addCriterion("catdir not like", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirIn(List<String> values) {
            addCriterion("catdir in", values, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirNotIn(List<String> values) {
            addCriterion("catdir not in", values, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirBetween(String value1, String value2) {
            addCriterion("catdir between", value1, value2, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirNotBetween(String value1, String value2) {
            addCriterion("catdir not between", value1, value2, "catdir");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andItemsIsNull() {
            addCriterion("items is null");
            return (Criteria) this;
        }

        public Criteria andItemsIsNotNull() {
            addCriterion("items is not null");
            return (Criteria) this;
        }

        public Criteria andItemsEqualTo(Integer value) {
            addCriterion("items =", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotEqualTo(Integer value) {
            addCriterion("items <>", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThan(Integer value) {
            addCriterion("items >", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThanOrEqualTo(Integer value) {
            addCriterion("items >=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThan(Integer value) {
            addCriterion("items <", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThanOrEqualTo(Integer value) {
            addCriterion("items <=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsIn(List<Integer> values) {
            addCriterion("items in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotIn(List<Integer> values) {
            addCriterion("items not in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsBetween(Integer value1, Integer value2) {
            addCriterion("items between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotBetween(Integer value1, Integer value2) {
            addCriterion("items not between", value1, value2, "items");
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

        public Criteria andIsmenuIsNull() {
            addCriterion("ismenu is null");
            return (Criteria) this;
        }

        public Criteria andIsmenuIsNotNull() {
            addCriterion("ismenu is not null");
            return (Criteria) this;
        }

        public Criteria andIsmenuEqualTo(Integer value) {
            addCriterion("ismenu =", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuNotEqualTo(Integer value) {
            addCriterion("ismenu <>", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuGreaterThan(Integer value) {
            addCriterion("ismenu >", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismenu >=", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuLessThan(Integer value) {
            addCriterion("ismenu <", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuLessThanOrEqualTo(Integer value) {
            addCriterion("ismenu <=", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuIn(List<Integer> values) {
            addCriterion("ismenu in", values, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuNotIn(List<Integer> values) {
            addCriterion("ismenu not in", values, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuBetween(Integer value1, Integer value2) {
            addCriterion("ismenu between", value1, value2, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuNotBetween(Integer value1, Integer value2) {
            addCriterion("ismenu not between", value1, value2, "ismenu");
            return (Criteria) this;
        }

        public Criteria andSethtmlIsNull() {
            addCriterion("sethtml is null");
            return (Criteria) this;
        }

        public Criteria andSethtmlIsNotNull() {
            addCriterion("sethtml is not null");
            return (Criteria) this;
        }

        public Criteria andSethtmlEqualTo(Integer value) {
            addCriterion("sethtml =", value, "sethtml");
            return (Criteria) this;
        }

        public Criteria andSethtmlNotEqualTo(Integer value) {
            addCriterion("sethtml <>", value, "sethtml");
            return (Criteria) this;
        }

        public Criteria andSethtmlGreaterThan(Integer value) {
            addCriterion("sethtml >", value, "sethtml");
            return (Criteria) this;
        }

        public Criteria andSethtmlGreaterThanOrEqualTo(Integer value) {
            addCriterion("sethtml >=", value, "sethtml");
            return (Criteria) this;
        }

        public Criteria andSethtmlLessThan(Integer value) {
            addCriterion("sethtml <", value, "sethtml");
            return (Criteria) this;
        }

        public Criteria andSethtmlLessThanOrEqualTo(Integer value) {
            addCriterion("sethtml <=", value, "sethtml");
            return (Criteria) this;
        }

        public Criteria andSethtmlIn(List<Integer> values) {
            addCriterion("sethtml in", values, "sethtml");
            return (Criteria) this;
        }

        public Criteria andSethtmlNotIn(List<Integer> values) {
            addCriterion("sethtml not in", values, "sethtml");
            return (Criteria) this;
        }

        public Criteria andSethtmlBetween(Integer value1, Integer value2) {
            addCriterion("sethtml between", value1, value2, "sethtml");
            return (Criteria) this;
        }

        public Criteria andSethtmlNotBetween(Integer value1, Integer value2) {
            addCriterion("sethtml not between", value1, value2, "sethtml");
            return (Criteria) this;
        }

        public Criteria andLetterIsNull() {
            addCriterion("letter is null");
            return (Criteria) this;
        }

        public Criteria andLetterIsNotNull() {
            addCriterion("letter is not null");
            return (Criteria) this;
        }

        public Criteria andLetterEqualTo(String value) {
            addCriterion("letter =", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterNotEqualTo(String value) {
            addCriterion("letter <>", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterGreaterThan(String value) {
            addCriterion("letter >", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterGreaterThanOrEqualTo(String value) {
            addCriterion("letter >=", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterLessThan(String value) {
            addCriterion("letter <", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterLessThanOrEqualTo(String value) {
            addCriterion("letter <=", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterLike(String value) {
            addCriterion("letter like", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterNotLike(String value) {
            addCriterion("letter not like", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterIn(List<String> values) {
            addCriterion("letter in", values, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterNotIn(List<String> values) {
            addCriterion("letter not in", values, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterBetween(String value1, String value2) {
            addCriterion("letter between", value1, value2, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterNotBetween(String value1, String value2) {
            addCriterion("letter not between", value1, value2, "letter");
            return (Criteria) this;
        }

        public Criteria andUsableTypeIsNull() {
            addCriterion("usable_type is null");
            return (Criteria) this;
        }

        public Criteria andUsableTypeIsNotNull() {
            addCriterion("usable_type is not null");
            return (Criteria) this;
        }

        public Criteria andUsableTypeEqualTo(String value) {
            addCriterion("usable_type =", value, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeNotEqualTo(String value) {
            addCriterion("usable_type <>", value, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeGreaterThan(String value) {
            addCriterion("usable_type >", value, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("usable_type >=", value, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeLessThan(String value) {
            addCriterion("usable_type <", value, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeLessThanOrEqualTo(String value) {
            addCriterion("usable_type <=", value, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeLike(String value) {
            addCriterion("usable_type like", value, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeNotLike(String value) {
            addCriterion("usable_type not like", value, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeIn(List<String> values) {
            addCriterion("usable_type in", values, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeNotIn(List<String> values) {
            addCriterion("usable_type not in", values, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeBetween(String value1, String value2) {
            addCriterion("usable_type between", value1, value2, "usableType");
            return (Criteria) this;
        }

        public Criteria andUsableTypeNotBetween(String value1, String value2) {
            addCriterion("usable_type not between", value1, value2, "usableType");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidIsNull() {
            addCriterion("commenttypeid is null");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidIsNotNull() {
            addCriterion("commenttypeid is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidEqualTo(Integer value) {
            addCriterion("commenttypeid =", value, "commenttypeid");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidNotEqualTo(Integer value) {
            addCriterion("commenttypeid <>", value, "commenttypeid");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidGreaterThan(Integer value) {
            addCriterion("commenttypeid >", value, "commenttypeid");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commenttypeid >=", value, "commenttypeid");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidLessThan(Integer value) {
            addCriterion("commenttypeid <", value, "commenttypeid");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("commenttypeid <=", value, "commenttypeid");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidIn(List<Integer> values) {
            addCriterion("commenttypeid in", values, "commenttypeid");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidNotIn(List<Integer> values) {
            addCriterion("commenttypeid not in", values, "commenttypeid");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidBetween(Integer value1, Integer value2) {
            addCriterion("commenttypeid between", value1, value2, "commenttypeid");
            return (Criteria) this;
        }

        public Criteria andCommenttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("commenttypeid not between", value1, value2, "commenttypeid");
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