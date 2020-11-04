package com.wyan.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbAttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAttachmentExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andMIsNull() {
            addCriterion("m is null");
            return (Criteria) this;
        }

        public Criteria andMIsNotNull() {
            addCriterion("m is not null");
            return (Criteria) this;
        }

        public Criteria andMEqualTo(String value) {
            addCriterion("m =", value, "m");
            return (Criteria) this;
        }

        public Criteria andMNotEqualTo(String value) {
            addCriterion("m <>", value, "m");
            return (Criteria) this;
        }

        public Criteria andMGreaterThan(String value) {
            addCriterion("m >", value, "m");
            return (Criteria) this;
        }

        public Criteria andMGreaterThanOrEqualTo(String value) {
            addCriterion("m >=", value, "m");
            return (Criteria) this;
        }

        public Criteria andMLessThan(String value) {
            addCriterion("m <", value, "m");
            return (Criteria) this;
        }

        public Criteria andMLessThanOrEqualTo(String value) {
            addCriterion("m <=", value, "m");
            return (Criteria) this;
        }

        public Criteria andMLike(String value) {
            addCriterion("m like", value, "m");
            return (Criteria) this;
        }

        public Criteria andMNotLike(String value) {
            addCriterion("m not like", value, "m");
            return (Criteria) this;
        }

        public Criteria andMIn(List<String> values) {
            addCriterion("m in", values, "m");
            return (Criteria) this;
        }

        public Criteria andMNotIn(List<String> values) {
            addCriterion("m not in", values, "m");
            return (Criteria) this;
        }

        public Criteria andMBetween(String value1, String value2) {
            addCriterion("m between", value1, value2, "m");
            return (Criteria) this;
        }

        public Criteria andMNotBetween(String value1, String value2) {
            addCriterion("m not between", value1, value2, "m");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("c is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("c is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(String value) {
            addCriterion("c =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(String value) {
            addCriterion("c <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(String value) {
            addCriterion("c >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(String value) {
            addCriterion("c >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(String value) {
            addCriterion("c <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(String value) {
            addCriterion("c <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLike(String value) {
            addCriterion("c like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotLike(String value) {
            addCriterion("c not like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<String> values) {
            addCriterion("c in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<String> values) {
            addCriterion("c not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(String value1, String value2) {
            addCriterion("c between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(String value1, String value2) {
            addCriterion("c not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andAIsNull() {
            addCriterion("a is null");
            return (Criteria) this;
        }

        public Criteria andAIsNotNull() {
            addCriterion("a is not null");
            return (Criteria) this;
        }

        public Criteria andAEqualTo(String value) {
            addCriterion("a =", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotEqualTo(String value) {
            addCriterion("a <>", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThan(String value) {
            addCriterion("a >", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThanOrEqualTo(String value) {
            addCriterion("a >=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThan(String value) {
            addCriterion("a <", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThanOrEqualTo(String value) {
            addCriterion("a <=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALike(String value) {
            addCriterion("a like", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotLike(String value) {
            addCriterion("a not like", value, "a");
            return (Criteria) this;
        }

        public Criteria andAIn(List<String> values) {
            addCriterion("a in", values, "a");
            return (Criteria) this;
        }

        public Criteria andANotIn(List<String> values) {
            addCriterion("a not in", values, "a");
            return (Criteria) this;
        }

        public Criteria andABetween(String value1, String value2) {
            addCriterion("a between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andANotBetween(String value1, String value2) {
            addCriterion("a not between", value1, value2, "a");
            return (Criteria) this;
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

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filepath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filepath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filepath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filepath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filepath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filepath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filepath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filepath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filepath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filepath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filepath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filepath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filepath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filepath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("filesize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("filesize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Integer value) {
            addCriterion("filesize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Integer value) {
            addCriterion("filesize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Integer value) {
            addCriterion("filesize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("filesize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Integer value) {
            addCriterion("filesize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Integer value) {
            addCriterion("filesize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Integer> values) {
            addCriterion("filesize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Integer> values) {
            addCriterion("filesize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Integer value1, Integer value2) {
            addCriterion("filesize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Integer value1, Integer value2) {
            addCriterion("filesize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFileextIsNull() {
            addCriterion("fileext is null");
            return (Criteria) this;
        }

        public Criteria andFileextIsNotNull() {
            addCriterion("fileext is not null");
            return (Criteria) this;
        }

        public Criteria andFileextEqualTo(String value) {
            addCriterion("fileext =", value, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextNotEqualTo(String value) {
            addCriterion("fileext <>", value, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextGreaterThan(String value) {
            addCriterion("fileext >", value, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextGreaterThanOrEqualTo(String value) {
            addCriterion("fileext >=", value, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextLessThan(String value) {
            addCriterion("fileext <", value, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextLessThanOrEqualTo(String value) {
            addCriterion("fileext <=", value, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextLike(String value) {
            addCriterion("fileext like", value, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextNotLike(String value) {
            addCriterion("fileext not like", value, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextIn(List<String> values) {
            addCriterion("fileext in", values, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextNotIn(List<String> values) {
            addCriterion("fileext not in", values, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextBetween(String value1, String value2) {
            addCriterion("fileext between", value1, value2, "fileext");
            return (Criteria) this;
        }

        public Criteria andFileextNotBetween(String value1, String value2) {
            addCriterion("fileext not between", value1, value2, "fileext");
            return (Criteria) this;
        }

        public Criteria andIsimageIsNull() {
            addCriterion("isimage is null");
            return (Criteria) this;
        }

        public Criteria andIsimageIsNotNull() {
            addCriterion("isimage is not null");
            return (Criteria) this;
        }

        public Criteria andIsimageEqualTo(Integer value) {
            addCriterion("isimage =", value, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsimageNotEqualTo(Integer value) {
            addCriterion("isimage <>", value, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsimageGreaterThan(Integer value) {
            addCriterion("isimage >", value, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsimageGreaterThanOrEqualTo(Integer value) {
            addCriterion("isimage >=", value, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsimageLessThan(Integer value) {
            addCriterion("isimage <", value, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsimageLessThanOrEqualTo(Integer value) {
            addCriterion("isimage <=", value, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsimageIn(List<Integer> values) {
            addCriterion("isimage in", values, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsimageNotIn(List<Integer> values) {
            addCriterion("isimage not in", values, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsimageBetween(Integer value1, Integer value2) {
            addCriterion("isimage between", value1, value2, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsimageNotBetween(Integer value1, Integer value2) {
            addCriterion("isimage not between", value1, value2, "isimage");
            return (Criteria) this;
        }

        public Criteria andIsthumbIsNull() {
            addCriterion("isthumb is null");
            return (Criteria) this;
        }

        public Criteria andIsthumbIsNotNull() {
            addCriterion("isthumb is not null");
            return (Criteria) this;
        }

        public Criteria andIsthumbEqualTo(Integer value) {
            addCriterion("isthumb =", value, "isthumb");
            return (Criteria) this;
        }

        public Criteria andIsthumbNotEqualTo(Integer value) {
            addCriterion("isthumb <>", value, "isthumb");
            return (Criteria) this;
        }

        public Criteria andIsthumbGreaterThan(Integer value) {
            addCriterion("isthumb >", value, "isthumb");
            return (Criteria) this;
        }

        public Criteria andIsthumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("isthumb >=", value, "isthumb");
            return (Criteria) this;
        }

        public Criteria andIsthumbLessThan(Integer value) {
            addCriterion("isthumb <", value, "isthumb");
            return (Criteria) this;
        }

        public Criteria andIsthumbLessThanOrEqualTo(Integer value) {
            addCriterion("isthumb <=", value, "isthumb");
            return (Criteria) this;
        }

        public Criteria andIsthumbIn(List<Integer> values) {
            addCriterion("isthumb in", values, "isthumb");
            return (Criteria) this;
        }

        public Criteria andIsthumbNotIn(List<Integer> values) {
            addCriterion("isthumb not in", values, "isthumb");
            return (Criteria) this;
        }

        public Criteria andIsthumbBetween(Integer value1, Integer value2) {
            addCriterion("isthumb between", value1, value2, "isthumb");
            return (Criteria) this;
        }

        public Criteria andIsthumbNotBetween(Integer value1, Integer value2) {
            addCriterion("isthumb not between", value1, value2, "isthumb");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNull() {
            addCriterion("downloads is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNotNull() {
            addCriterion("downloads is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsEqualTo(Integer value) {
            addCriterion("downloads =", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotEqualTo(Integer value) {
            addCriterion("downloads <>", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThan(Integer value) {
            addCriterion("downloads >", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("downloads >=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThan(Integer value) {
            addCriterion("downloads <", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThanOrEqualTo(Integer value) {
            addCriterion("downloads <=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsIn(List<Integer> values) {
            addCriterion("downloads in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotIn(List<Integer> values) {
            addCriterion("downloads not in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsBetween(Integer value1, Integer value2) {
            addCriterion("downloads between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotBetween(Integer value1, Integer value2) {
            addCriterion("downloads not between", value1, value2, "downloads");
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

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadtime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadtime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Integer value) {
            addCriterion("uploadtime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Integer value) {
            addCriterion("uploadtime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Integer value) {
            addCriterion("uploadtime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadtime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Integer value) {
            addCriterion("uploadtime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Integer value) {
            addCriterion("uploadtime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Integer> values) {
            addCriterion("uploadtime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Integer> values) {
            addCriterion("uploadtime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Integer value1, Integer value2) {
            addCriterion("uploadtime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadtime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadipIsNull() {
            addCriterion("uploadip is null");
            return (Criteria) this;
        }

        public Criteria andUploadipIsNotNull() {
            addCriterion("uploadip is not null");
            return (Criteria) this;
        }

        public Criteria andUploadipEqualTo(String value) {
            addCriterion("uploadip =", value, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipNotEqualTo(String value) {
            addCriterion("uploadip <>", value, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipGreaterThan(String value) {
            addCriterion("uploadip >", value, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipGreaterThanOrEqualTo(String value) {
            addCriterion("uploadip >=", value, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipLessThan(String value) {
            addCriterion("uploadip <", value, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipLessThanOrEqualTo(String value) {
            addCriterion("uploadip <=", value, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipLike(String value) {
            addCriterion("uploadip like", value, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipNotLike(String value) {
            addCriterion("uploadip not like", value, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipIn(List<String> values) {
            addCriterion("uploadip in", values, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipNotIn(List<String> values) {
            addCriterion("uploadip not in", values, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipBetween(String value1, String value2) {
            addCriterion("uploadip between", value1, value2, "uploadip");
            return (Criteria) this;
        }

        public Criteria andUploadipNotBetween(String value1, String value2) {
            addCriterion("uploadip not between", value1, value2, "uploadip");
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

        public Criteria andAuthcodeIsNull() {
            addCriterion("authcode is null");
            return (Criteria) this;
        }

        public Criteria andAuthcodeIsNotNull() {
            addCriterion("authcode is not null");
            return (Criteria) this;
        }

        public Criteria andAuthcodeEqualTo(String value) {
            addCriterion("authcode =", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotEqualTo(String value) {
            addCriterion("authcode <>", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeGreaterThan(String value) {
            addCriterion("authcode >", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeGreaterThanOrEqualTo(String value) {
            addCriterion("authcode >=", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeLessThan(String value) {
            addCriterion("authcode <", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeLessThanOrEqualTo(String value) {
            addCriterion("authcode <=", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeLike(String value) {
            addCriterion("authcode like", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotLike(String value) {
            addCriterion("authcode not like", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeIn(List<String> values) {
            addCriterion("authcode in", values, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotIn(List<String> values) {
            addCriterion("authcode not in", values, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeBetween(String value1, String value2) {
            addCriterion("authcode between", value1, value2, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotBetween(String value1, String value2) {
            addCriterion("authcode not between", value1, value2, "authcode");
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