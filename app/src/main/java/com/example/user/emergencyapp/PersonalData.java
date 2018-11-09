package com.example.user.emergencyapp;


public class PersonalData {
    private String member_bno;
    private String member_agencyname;
    private String member_cal;
    private String member_longitude;
    private String member_latitude;

    public String getMember_bno() {
        return member_bno;
    }

    public String getMember_agencyname() {
        return member_agencyname;
    }

    public String getMember_cal() {
        return member_cal;
    }

    public String getMember_longitude() {
        return member_longitude;
    }

    public String getMember_latitude() {
        return member_latitude;
    }

    public void setMember_bno(String member_bno) {
        this.member_bno = member_bno;
    }

    public void setMember_agencyname(String member_agencyname) {
        this.member_agencyname = member_agencyname;
    }

    public void setMember_cal(String member_cal) {
        this.member_cal = member_cal;
    }

    public void setMember_longitude(String member_longitude) {
        this.member_longitude = member_longitude;
    }

    public void setMember_latitude(String member_latitude) {
        this.member_latitude = member_latitude;
    }
}