package com.tp.trip.pojo.vo;

import com.tp.trip.pojo.po.TbFood;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 20:30
 * Version:V1.0
 */
public class TbFoodCustom extends TbFood {
    private String priceView;
    private  String scenicName;
    private String statusName;

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getPriceView() {
        return priceView;
    }

    public void setPriceView(String priceView) {
        this.priceView = priceView;
    }
}
