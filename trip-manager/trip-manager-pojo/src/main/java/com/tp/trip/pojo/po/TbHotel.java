package com.tp.trip.pojo.po;

public class TbHotel {
    private Long id;

    private String hotelName;

    private Byte hoteltype;

    private String hotelLinkman;

    private String hotelTel;

    private String hotelImage;

    private String temp1;

    private String temp2;

    private String temp3;

    private String temp4;

    private String hotelAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public Byte getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(Byte hoteltype) {
        this.hoteltype = hoteltype;
    }

    public String getHotelLinkman() {
        return hotelLinkman;
    }

    public void setHotelLinkman(String hotelLinkman) {
        this.hotelLinkman = hotelLinkman == null ? null : hotelLinkman.trim();
    }

    public String getHotelTel() {
        return hotelTel;
    }

    public void setHotelTel(String hotelTel) {
        this.hotelTel = hotelTel == null ? null : hotelTel.trim();
    }

    public String getHotelImage() {
        return hotelImage;
    }

    public void setHotelImage(String hotelImage) {
        this.hotelImage = hotelImage == null ? null : hotelImage.trim();
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

    public String getTemp4() {
        return temp4;
    }

    public void setTemp4(String temp4) {
        this.temp4 = temp4 == null ? null : temp4.trim();
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress == null ? null : hotelAddress.trim();
    }
}