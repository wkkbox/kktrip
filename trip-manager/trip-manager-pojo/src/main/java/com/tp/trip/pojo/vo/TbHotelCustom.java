package com.tp.trip.pojo.vo;

import com.tp.trip.pojo.po.TbHotel;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 13:42
 * Version:V1.0
 */
public class TbHotelCustom  extends TbHotel {
    //酒店供应商名字
    private String username;
    private String  statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
