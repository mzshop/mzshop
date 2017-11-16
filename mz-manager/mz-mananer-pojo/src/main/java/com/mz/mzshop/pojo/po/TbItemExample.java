package com.mz.mzshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbItemExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNormalPriceIsNull() {
            addCriterion("normal_price is null");
            return (Criteria) this;
        }

        public Criteria andNormalPriceIsNotNull() {
            addCriterion("normal_price is not null");
            return (Criteria) this;
        }

        public Criteria andNormalPriceEqualTo(Long value) {
            addCriterion("normal_price =", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotEqualTo(Long value) {
            addCriterion("normal_price <>", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceGreaterThan(Long value) {
            addCriterion("normal_price >", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("normal_price >=", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceLessThan(Long value) {
            addCriterion("normal_price <", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceLessThanOrEqualTo(Long value) {
            addCriterion("normal_price <=", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceIn(List<Long> values) {
            addCriterion("normal_price in", values, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotIn(List<Long> values) {
            addCriterion("normal_price not in", values, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceBetween(Long value1, Long value2) {
            addCriterion("normal_price between", value1, value2, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotBetween(Long value1, Long value2) {
            addCriterion("normal_price not between", value1, value2, "normalPrice");
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

        public Criteria andSoldNumIsNull() {
            addCriterion("sold_num is null");
            return (Criteria) this;
        }

        public Criteria andSoldNumIsNotNull() {
            addCriterion("sold_num is not null");
            return (Criteria) this;
        }

        public Criteria andSoldNumEqualTo(Long value) {
            addCriterion("sold_num =", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumNotEqualTo(Long value) {
            addCriterion("sold_num <>", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumGreaterThan(Long value) {
            addCriterion("sold_num >", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumGreaterThanOrEqualTo(Long value) {
            addCriterion("sold_num >=", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumLessThan(Long value) {
            addCriterion("sold_num <", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumLessThanOrEqualTo(Long value) {
            addCriterion("sold_num <=", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumIn(List<Long> values) {
            addCriterion("sold_num in", values, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumNotIn(List<Long> values) {
            addCriterion("sold_num not in", values, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumBetween(Long value1, Long value2) {
            addCriterion("sold_num between", value1, value2, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumNotBetween(Long value1, Long value2) {
            addCriterion("sold_num not between", value1, value2, "soldNum");
            return (Criteria) this;
        }

        public Criteria andCouponIsNull() {
            addCriterion("coupon is null");
            return (Criteria) this;
        }

        public Criteria andCouponIsNotNull() {
            addCriterion("coupon is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEqualTo(Long value) {
            addCriterion("coupon =", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotEqualTo(Long value) {
            addCriterion("coupon <>", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThan(Long value) {
            addCriterion("coupon >", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon >=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThan(Long value) {
            addCriterion("coupon <", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThanOrEqualTo(Long value) {
            addCriterion("coupon <=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponIn(List<Long> values) {
            addCriterion("coupon in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotIn(List<Long> values) {
            addCriterion("coupon not in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponBetween(Long value1, Long value2) {
            addCriterion("coupon between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotBetween(Long value1, Long value2) {
            addCriterion("coupon not between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Long value) {
            addCriterion("sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Long value) {
            addCriterion("sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Long value) {
            addCriterion("sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Long value) {
            addCriterion("sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Long value) {
            addCriterion("sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Long value) {
            addCriterion("sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Long> values) {
            addCriterion("sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Long> values) {
            addCriterion("sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Long value1, Long value2) {
            addCriterion("sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Long value1, Long value2) {
            addCriterion("sum not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
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

        public Criteria andCreateIsNull() {
            addCriterion("create is null");
            return (Criteria) this;
        }

        public Criteria andCreateIsNotNull() {
            addCriterion("create is not null");
            return (Criteria) this;
        }

        public Criteria andCreateEqualTo(Date value) {
            addCriterion("create =", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateNotEqualTo(Date value) {
            addCriterion("create <>", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateGreaterThan(Date value) {
            addCriterion("create >", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("create >=", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateLessThan(Date value) {
            addCriterion("create <", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateLessThanOrEqualTo(Date value) {
            addCriterion("create <=", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateIn(List<Date> values) {
            addCriterion("create in", values, "create");
            return (Criteria) this;
        }

        public Criteria andCreateNotIn(List<Date> values) {
            addCriterion("create not in", values, "create");
            return (Criteria) this;
        }

        public Criteria andCreateBetween(Date value1, Date value2) {
            addCriterion("create between", value1, value2, "create");
            return (Criteria) this;
        }

        public Criteria andCreateNotBetween(Date value1, Date value2) {
            addCriterion("create not between", value1, value2, "create");
            return (Criteria) this;
        }

        public Criteria andUpdateIsNull() {
            addCriterion("update is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIsNotNull() {
            addCriterion("update is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateEqualTo(Date value) {
            addCriterion("update =", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotEqualTo(Date value) {
            addCriterion("update <>", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateGreaterThan(Date value) {
            addCriterion("update >", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("update >=", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateLessThan(Date value) {
            addCriterion("update <", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateLessThanOrEqualTo(Date value) {
            addCriterion("update <=", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateIn(List<Date> values) {
            addCriterion("update in", values, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotIn(List<Date> values) {
            addCriterion("update not in", values, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateBetween(Date value1, Date value2) {
            addCriterion("update between", value1, value2, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotBetween(Date value1, Date value2) {
            addCriterion("update not between", value1, value2, "update");
            return (Criteria) this;
        }

        public Criteria andStaleIsNull() {
            addCriterion("stale is null");
            return (Criteria) this;
        }

        public Criteria andStaleIsNotNull() {
            addCriterion("stale is not null");
            return (Criteria) this;
        }

        public Criteria andStaleEqualTo(Date value) {
            addCriterion("stale =", value, "stale");
            return (Criteria) this;
        }

        public Criteria andStaleNotEqualTo(Date value) {
            addCriterion("stale <>", value, "stale");
            return (Criteria) this;
        }

        public Criteria andStaleGreaterThan(Date value) {
            addCriterion("stale >", value, "stale");
            return (Criteria) this;
        }

        public Criteria andStaleGreaterThanOrEqualTo(Date value) {
            addCriterion("stale >=", value, "stale");
            return (Criteria) this;
        }

        public Criteria andStaleLessThan(Date value) {
            addCriterion("stale <", value, "stale");
            return (Criteria) this;
        }

        public Criteria andStaleLessThanOrEqualTo(Date value) {
            addCriterion("stale <=", value, "stale");
            return (Criteria) this;
        }

        public Criteria andStaleIn(List<Date> values) {
            addCriterion("stale in", values, "stale");
            return (Criteria) this;
        }

        public Criteria andStaleNotIn(List<Date> values) {
            addCriterion("stale not in", values, "stale");
            return (Criteria) this;
        }

        public Criteria andStaleBetween(Date value1, Date value2) {
            addCriterion("stale between", value1, value2, "stale");
            return (Criteria) this;
        }

        public Criteria andStaleNotBetween(Date value1, Date value2) {
            addCriterion("stale not between", value1, value2, "stale");
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