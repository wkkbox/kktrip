package com.tp.trip.pojo.po;

import java.util.Date;

public class TbComment {
    private Long id;

    private Long userId;

    private Long scenicId;

    private String replyMsg;

    private Double serviceGrade;

    private Double hotelGrade;

    private Double foodGrade;

    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getScenicId() {
        return scenicId;
    }

    public void setScenicId(Long scenicId) {
        this.scenicId = scenicId;
    }

    public String getReplyMsg() {
        return replyMsg;
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg == null ? null : replyMsg.trim();
    }

    public Double getServiceGrade() {
        return serviceGrade;
    }

    public void setServiceGrade(Double serviceGrade) {
        this.serviceGrade = serviceGrade;
    }

    public Double getHotelGrade() {
        return hotelGrade;
    }

    public void setHotelGrade(Double hotelGrade) {
        this.hotelGrade = hotelGrade;
    }

    public Double getFoodGrade() {
        return foodGrade;
    }

    public void setFoodGrade(Double foodGrade) {
        this.foodGrade = foodGrade;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}