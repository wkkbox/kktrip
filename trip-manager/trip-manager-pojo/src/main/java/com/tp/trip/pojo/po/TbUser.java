package com.tp.trip.pojo.po;

public class TbUser {
    private Long id;

    private String username;

    private String password;

    private String tel;

    private Integer usertype;

    private String email;

    private String tip1;

    private String tip2;

    private String tip3;

    private String tip4;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTip1() {
        return tip1;
    }

    public void setTip1(String tip1) {
        this.tip1 = tip1 == null ? null : tip1.trim();
    }

    public String getTip2() {
        return tip2;
    }

    public void setTip2(String tip2) {
        this.tip2 = tip2 == null ? null : tip2.trim();
    }

    public String getTip3() {
        return tip3;
    }

    public void setTip3(String tip3) {
        this.tip3 = tip3 == null ? null : tip3.trim();
    }

    public String getTip4() {
        return tip4;
    }

    public void setTip4(String tip4) {
        this.tip4 = tip4 == null ? null : tip4.trim();
    }
}