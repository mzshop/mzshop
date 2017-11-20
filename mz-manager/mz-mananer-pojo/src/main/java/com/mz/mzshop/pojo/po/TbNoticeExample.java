package com.mz.mzshop.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class TbNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbNoticeExample() {
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

        public Criteria andTopIsNull() {
            addCriterion("top is null");
            return (Criteria) this;
        }

        public Criteria andTopIsNotNull() {
            addCriterion("top is not null");
            return (Criteria) this;
        }

        public Criteria andTopEqualTo(String value) {
            addCriterion("top =", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotEqualTo(String value) {
            addCriterion("top <>", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThan(String value) {
            addCriterion("top >", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThanOrEqualTo(String value) {
            addCriterion("top >=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThan(String value) {
            addCriterion("top <", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThanOrEqualTo(String value) {
            addCriterion("top <=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLike(String value) {
            addCriterion("top like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotLike(String value) {
            addCriterion("top not like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopIn(List<String> values) {
            addCriterion("top in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotIn(List<String> values) {
            addCriterion("top not in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopBetween(String value1, String value2) {
            addCriterion("top between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotBetween(String value1, String value2) {
            addCriterion("top not between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andMiddleIsNull() {
            addCriterion("middle is null");
            return (Criteria) this;
        }

        public Criteria andMiddleIsNotNull() {
            addCriterion("middle is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleEqualTo(String value) {
            addCriterion("middle =", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleNotEqualTo(String value) {
            addCriterion("middle <>", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleGreaterThan(String value) {
            addCriterion("middle >", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("middle >=", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleLessThan(String value) {
            addCriterion("middle <", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleLessThanOrEqualTo(String value) {
            addCriterion("middle <=", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleLike(String value) {
            addCriterion("middle like", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleNotLike(String value) {
            addCriterion("middle not like", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleIn(List<String> values) {
            addCriterion("middle in", values, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleNotIn(List<String> values) {
            addCriterion("middle not in", values, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleBetween(String value1, String value2) {
            addCriterion("middle between", value1, value2, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleNotBetween(String value1, String value2) {
            addCriterion("middle not between", value1, value2, "middle");
            return (Criteria) this;
        }

        public Criteria andFootIsNull() {
            addCriterion("foot is null");
            return (Criteria) this;
        }

        public Criteria andFootIsNotNull() {
            addCriterion("foot is not null");
            return (Criteria) this;
        }

        public Criteria andFootEqualTo(String value) {
            addCriterion("foot =", value, "foot");
            return (Criteria) this;
        }

        public Criteria andFootNotEqualTo(String value) {
            addCriterion("foot <>", value, "foot");
            return (Criteria) this;
        }

        public Criteria andFootGreaterThan(String value) {
            addCriterion("foot >", value, "foot");
            return (Criteria) this;
        }

        public Criteria andFootGreaterThanOrEqualTo(String value) {
            addCriterion("foot >=", value, "foot");
            return (Criteria) this;
        }

        public Criteria andFootLessThan(String value) {
            addCriterion("foot <", value, "foot");
            return (Criteria) this;
        }

        public Criteria andFootLessThanOrEqualTo(String value) {
            addCriterion("foot <=", value, "foot");
            return (Criteria) this;
        }

        public Criteria andFootLike(String value) {
            addCriterion("foot like", value, "foot");
            return (Criteria) this;
        }

        public Criteria andFootNotLike(String value) {
            addCriterion("foot not like", value, "foot");
            return (Criteria) this;
        }

        public Criteria andFootIn(List<String> values) {
            addCriterion("foot in", values, "foot");
            return (Criteria) this;
        }

        public Criteria andFootNotIn(List<String> values) {
            addCriterion("foot not in", values, "foot");
            return (Criteria) this;
        }

        public Criteria andFootBetween(String value1, String value2) {
            addCriterion("foot between", value1, value2, "foot");
            return (Criteria) this;
        }

        public Criteria andFootNotBetween(String value1, String value2) {
            addCriterion("foot not between", value1, value2, "foot");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
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