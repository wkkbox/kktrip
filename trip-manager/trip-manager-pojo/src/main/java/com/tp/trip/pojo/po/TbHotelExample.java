package com.tp.trip.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class TbHotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbHotelExample() {
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

        public Criteria andHotelNameIsNull() {
            addCriterion("hotel_name is null");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNotNull() {
            addCriterion("hotel_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotelNameEqualTo(String value) {
            addCriterion("hotel_name =", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotEqualTo(String value) {
            addCriterion("hotel_name <>", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThan(String value) {
            addCriterion("hotel_name >", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_name >=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThan(String value) {
            addCriterion("hotel_name <", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThanOrEqualTo(String value) {
            addCriterion("hotel_name <=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLike(String value) {
            addCriterion("hotel_name like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotLike(String value) {
            addCriterion("hotel_name not like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameIn(List<String> values) {
            addCriterion("hotel_name in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotIn(List<String> values) {
            addCriterion("hotel_name not in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameBetween(String value1, String value2) {
            addCriterion("hotel_name between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotBetween(String value1, String value2) {
            addCriterion("hotel_name not between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHoteltypeIsNull() {
            addCriterion("hotelType is null");
            return (Criteria) this;
        }

        public Criteria andHoteltypeIsNotNull() {
            addCriterion("hotelType is not null");
            return (Criteria) this;
        }

        public Criteria andHoteltypeEqualTo(Byte value) {
            addCriterion("hotelType =", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeNotEqualTo(Byte value) {
            addCriterion("hotelType <>", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeGreaterThan(Byte value) {
            addCriterion("hotelType >", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("hotelType >=", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeLessThan(Byte value) {
            addCriterion("hotelType <", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeLessThanOrEqualTo(Byte value) {
            addCriterion("hotelType <=", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeIn(List<Byte> values) {
            addCriterion("hotelType in", values, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeNotIn(List<Byte> values) {
            addCriterion("hotelType not in", values, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeBetween(Byte value1, Byte value2) {
            addCriterion("hotelType between", value1, value2, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeNotBetween(Byte value1, Byte value2) {
            addCriterion("hotelType not between", value1, value2, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanIsNull() {
            addCriterion("hotel_linkman is null");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanIsNotNull() {
            addCriterion("hotel_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanEqualTo(String value) {
            addCriterion("hotel_linkman =", value, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanNotEqualTo(String value) {
            addCriterion("hotel_linkman <>", value, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanGreaterThan(String value) {
            addCriterion("hotel_linkman >", value, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_linkman >=", value, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanLessThan(String value) {
            addCriterion("hotel_linkman <", value, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanLessThanOrEqualTo(String value) {
            addCriterion("hotel_linkman <=", value, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanLike(String value) {
            addCriterion("hotel_linkman like", value, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanNotLike(String value) {
            addCriterion("hotel_linkman not like", value, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanIn(List<String> values) {
            addCriterion("hotel_linkman in", values, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanNotIn(List<String> values) {
            addCriterion("hotel_linkman not in", values, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanBetween(String value1, String value2) {
            addCriterion("hotel_linkman between", value1, value2, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelLinkmanNotBetween(String value1, String value2) {
            addCriterion("hotel_linkman not between", value1, value2, "hotelLinkman");
            return (Criteria) this;
        }

        public Criteria andHotelTelIsNull() {
            addCriterion("hotel_tel is null");
            return (Criteria) this;
        }

        public Criteria andHotelTelIsNotNull() {
            addCriterion("hotel_tel is not null");
            return (Criteria) this;
        }

        public Criteria andHotelTelEqualTo(String value) {
            addCriterion("hotel_tel =", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelNotEqualTo(String value) {
            addCriterion("hotel_tel <>", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelGreaterThan(String value) {
            addCriterion("hotel_tel >", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_tel >=", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelLessThan(String value) {
            addCriterion("hotel_tel <", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelLessThanOrEqualTo(String value) {
            addCriterion("hotel_tel <=", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelLike(String value) {
            addCriterion("hotel_tel like", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelNotLike(String value) {
            addCriterion("hotel_tel not like", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelIn(List<String> values) {
            addCriterion("hotel_tel in", values, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelNotIn(List<String> values) {
            addCriterion("hotel_tel not in", values, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelBetween(String value1, String value2) {
            addCriterion("hotel_tel between", value1, value2, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelNotBetween(String value1, String value2) {
            addCriterion("hotel_tel not between", value1, value2, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelImageIsNull() {
            addCriterion("hotel_image is null");
            return (Criteria) this;
        }

        public Criteria andHotelImageIsNotNull() {
            addCriterion("hotel_image is not null");
            return (Criteria) this;
        }

        public Criteria andHotelImageEqualTo(String value) {
            addCriterion("hotel_image =", value, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageNotEqualTo(String value) {
            addCriterion("hotel_image <>", value, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageGreaterThan(String value) {
            addCriterion("hotel_image >", value, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_image >=", value, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageLessThan(String value) {
            addCriterion("hotel_image <", value, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageLessThanOrEqualTo(String value) {
            addCriterion("hotel_image <=", value, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageLike(String value) {
            addCriterion("hotel_image like", value, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageNotLike(String value) {
            addCriterion("hotel_image not like", value, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageIn(List<String> values) {
            addCriterion("hotel_image in", values, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageNotIn(List<String> values) {
            addCriterion("hotel_image not in", values, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageBetween(String value1, String value2) {
            addCriterion("hotel_image between", value1, value2, "hotelImage");
            return (Criteria) this;
        }

        public Criteria andHotelImageNotBetween(String value1, String value2) {
            addCriterion("hotel_image not between", value1, value2, "hotelImage");
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

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTemp4IsNull() {
            addCriterion("temp4 is null");
            return (Criteria) this;
        }

        public Criteria andTemp4IsNotNull() {
            addCriterion("temp4 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp4EqualTo(String value) {
            addCriterion("temp4 =", value, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4NotEqualTo(String value) {
            addCriterion("temp4 <>", value, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4GreaterThan(String value) {
            addCriterion("temp4 >", value, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4GreaterThanOrEqualTo(String value) {
            addCriterion("temp4 >=", value, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4LessThan(String value) {
            addCriterion("temp4 <", value, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4LessThanOrEqualTo(String value) {
            addCriterion("temp4 <=", value, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4Like(String value) {
            addCriterion("temp4 like", value, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4NotLike(String value) {
            addCriterion("temp4 not like", value, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4In(List<String> values) {
            addCriterion("temp4 in", values, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4NotIn(List<String> values) {
            addCriterion("temp4 not in", values, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4Between(String value1, String value2) {
            addCriterion("temp4 between", value1, value2, "temp4");
            return (Criteria) this;
        }

        public Criteria andTemp4NotBetween(String value1, String value2) {
            addCriterion("temp4 not between", value1, value2, "temp4");
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