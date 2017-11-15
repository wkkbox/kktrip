package com.tp.trip.pojo.po;

public class TbRountDesc {
    private Long id;

    private Long scenicId;

    private Long rountId;

    private String rountSchedule;

    private String temp1;

    private String temp2;

    private String temp3;

    private String rountIntro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScenicId() {
        return scenicId;
    }

    public void setScenicId(Long scenicId) {
        this.scenicId = scenicId;
    }

    public Long getRountId() {
        return rountId;
    }

    public void setRountId(Long rountId) {
        this.rountId = rountId;
    }

    public String getRountSchedule() {
        return rountSchedule;
    }

    public void setRountSchedule(String rountSchedule) {
        this.rountSchedule = rountSchedule == null ? null : rountSchedule.trim();
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
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

    public String getRountIntro() {
        return rountIntro;
    }

    public void setRountIntro(String rountIntro) {
        this.rountIntro = rountIntro == null ? null : rountIntro.trim();
    }
}