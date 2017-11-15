package com.tp.trip.pojo.po;

public class TbScenicDescWithBLOBs extends TbScenicDesc {
    private String scenicIntro;

    private String scenicAddress;

    public String getScenicIntro() {
        return scenicIntro;
    }

    public void setScenicIntro(String scenicIntro) {
        this.scenicIntro = scenicIntro == null ? null : scenicIntro.trim();
    }

    public String getScenicAddress() {
        return scenicAddress;
    }

    public void setScenicAddress(String scenicAddress) {
        this.scenicAddress = scenicAddress == null ? null : scenicAddress.trim();
    }
}