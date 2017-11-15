package com.tp.trip.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCommentExample() {
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

        public Criteria andScenicIdIsNull() {
            addCriterion("scenic_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("scenic_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Long value) {
            addCriterion("scenic_id =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Long value) {
            addCriterion("scenic_id <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Long value) {
            addCriterion("scenic_id >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("scenic_id >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Long value) {
            addCriterion("scenic_id <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Long value) {
            addCriterion("scenic_id <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Long> values) {
            addCriterion("scenic_id in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Long> values) {
            addCriterion("scenic_id not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Long value1, Long value2) {
            addCriterion("scenic_id between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Long value1, Long value2) {
            addCriterion("scenic_id not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andReplyMsgIsNull() {
            addCriterion("reply_msg is null");
            return (Criteria) this;
        }

        public Criteria andReplyMsgIsNotNull() {
            addCriterion("reply_msg is not null");
            return (Criteria) this;
        }

        public Criteria andReplyMsgEqualTo(String value) {
            addCriterion("reply_msg =", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgNotEqualTo(String value) {
            addCriterion("reply_msg <>", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgGreaterThan(String value) {
            addCriterion("reply_msg >", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgGreaterThanOrEqualTo(String value) {
            addCriterion("reply_msg >=", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgLessThan(String value) {
            addCriterion("reply_msg <", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgLessThanOrEqualTo(String value) {
            addCriterion("reply_msg <=", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgLike(String value) {
            addCriterion("reply_msg like", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgNotLike(String value) {
            addCriterion("reply_msg not like", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgIn(List<String> values) {
            addCriterion("reply_msg in", values, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgNotIn(List<String> values) {
            addCriterion("reply_msg not in", values, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgBetween(String value1, String value2) {
            addCriterion("reply_msg between", value1, value2, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgNotBetween(String value1, String value2) {
            addCriterion("reply_msg not between", value1, value2, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andServiceGradeIsNull() {
            addCriterion("service_grade is null");
            return (Criteria) this;
        }

        public Criteria andServiceGradeIsNotNull() {
            addCriterion("service_grade is not null");
            return (Criteria) this;
        }

        public Criteria andServiceGradeEqualTo(Double value) {
            addCriterion("service_grade =", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeNotEqualTo(Double value) {
            addCriterion("service_grade <>", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeGreaterThan(Double value) {
            addCriterion("service_grade >", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("service_grade >=", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeLessThan(Double value) {
            addCriterion("service_grade <", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeLessThanOrEqualTo(Double value) {
            addCriterion("service_grade <=", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeIn(List<Double> values) {
            addCriterion("service_grade in", values, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeNotIn(List<Double> values) {
            addCriterion("service_grade not in", values, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeBetween(Double value1, Double value2) {
            addCriterion("service_grade between", value1, value2, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeNotBetween(Double value1, Double value2) {
            addCriterion("service_grade not between", value1, value2, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeIsNull() {
            addCriterion("hotel_grade is null");
            return (Criteria) this;
        }

        public Criteria andHotelGradeIsNotNull() {
            addCriterion("hotel_grade is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGradeEqualTo(Double value) {
            addCriterion("hotel_grade =", value, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeNotEqualTo(Double value) {
            addCriterion("hotel_grade <>", value, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeGreaterThan(Double value) {
            addCriterion("hotel_grade >", value, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("hotel_grade >=", value, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeLessThan(Double value) {
            addCriterion("hotel_grade <", value, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeLessThanOrEqualTo(Double value) {
            addCriterion("hotel_grade <=", value, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeIn(List<Double> values) {
            addCriterion("hotel_grade in", values, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeNotIn(List<Double> values) {
            addCriterion("hotel_grade not in", values, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeBetween(Double value1, Double value2) {
            addCriterion("hotel_grade between", value1, value2, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andHotelGradeNotBetween(Double value1, Double value2) {
            addCriterion("hotel_grade not between", value1, value2, "hotelGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeIsNull() {
            addCriterion("food_grade is null");
            return (Criteria) this;
        }

        public Criteria andFoodGradeIsNotNull() {
            addCriterion("food_grade is not null");
            return (Criteria) this;
        }

        public Criteria andFoodGradeEqualTo(Double value) {
            addCriterion("food_grade =", value, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeNotEqualTo(Double value) {
            addCriterion("food_grade <>", value, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeGreaterThan(Double value) {
            addCriterion("food_grade >", value, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("food_grade >=", value, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeLessThan(Double value) {
            addCriterion("food_grade <", value, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeLessThanOrEqualTo(Double value) {
            addCriterion("food_grade <=", value, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeIn(List<Double> values) {
            addCriterion("food_grade in", values, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeNotIn(List<Double> values) {
            addCriterion("food_grade not in", values, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeBetween(Double value1, Double value2) {
            addCriterion("food_grade between", value1, value2, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andFoodGradeNotBetween(Double value1, Double value2) {
            addCriterion("food_grade not between", value1, value2, "foodGrade");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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