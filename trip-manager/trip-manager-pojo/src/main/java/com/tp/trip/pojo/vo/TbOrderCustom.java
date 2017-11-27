package com.tp.trip.pojo.vo;

import com.tp.trip.pojo.po.TbOrder;

import java.util.Date;

/**
 * User: Administrator
 * Date: 2017/11/25
 * Time: 11:34
 * Version:V1.0
 */
public class TbOrderCustom extends TbOrder {
    private String username;
    private String hotelName;
    private String stateName;
    private Double subtotal;
    private Date inTime;
    private Date outTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }
}
