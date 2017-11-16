package com.tp.trip.pojo.po;

import java.util.Date;

public class TbScenic {
    private Long id;

    private String scenicLinkman;

    private String scenicTel;

    private String scenicImage;

    private Integer tid;

    private Byte state;

    private Date createdTime;

    private Date updateTime;

    private Long uid;

    private String temp2;

    private String temp3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScenicLinkman() {
        return scenicLinkman;
    }

    public void setScenicLinkman(String scenicLinkman) {
        this.scenicLinkman = scenicLinkman == null ? null : scenicLinkman.trim();
    }

    public String getScenicTel() {
        return scenicTel;
    }

    public void setScenicTel(String scenicTel) {
        this.scenicTel = scenicTel == null ? null : scenicTel.trim();
    }

    public String getScenicImage() {
        return scenicImage;
    }

    public void setScenicImage(String scenicImage) {
        this.scenicImage = scenicImage == null ? null : scenicImage.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }

    public String getTemp3() {
        return temp3;
    }

    public void setTemp3(String temp3) {
        this.temp3 = temp3 == null ? null : temp3.trim();
    }
}