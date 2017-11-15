package com.tp.trip.pojo.po;

public class TbScenicActivityWithBLOBs extends TbScenicActivity {
    private String activityIntro;

    private String activitySchedule;

    private String activityAddress;

    public String getActivityIntro() {
        return activityIntro;
    }

    public void setActivityIntro(String activityIntro) {
        this.activityIntro = activityIntro == null ? null : activityIntro.trim();
    }

    public String getActivitySchedule() {
        return activitySchedule;
    }

    public void setActivitySchedule(String activitySchedule) {
        this.activitySchedule = activitySchedule == null ? null : activitySchedule.trim();
    }

    public String getActivityAddress() {
        return activityAddress;
    }

    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress == null ? null : activityAddress.trim();
    }
}