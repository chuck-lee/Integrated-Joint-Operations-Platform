package com.fec.report.dao;

public class IllegalPerson {
    private String address;
    private String car_identity;
    private String content;
    private String current_address;
    private Long id;
    private String identity;
    private String isSend;
    private String note;
    private String phone;
    private String picture;
    private String power_number;
    private String relativePerson;
    private String relativeThing;
    private String submitLatitude;
    private String submitLongitude;
    private String submitTime;
    private String submiter;
    private String submiterUCId;
    private Integer type;
    private Integer urgency;
    private String video;
    private String voice;

    public IllegalPerson(Long id) {
        this.id = id;
    }

    public IllegalPerson(Long id, Integer type, String content, String address, String submitLatitude, String submitLongitude, String voice, String picture, String isSend, String identity, String relativePerson, String relativeThing, Integer urgency, String submiter, String video, String note, String submitTime, String submiterUCId, String car_identity, String power_number, String phone, String current_address) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.address = address;
        this.submitLatitude = submitLatitude;
        this.submitLongitude = submitLongitude;
        this.voice = voice;
        this.picture = picture;
        this.isSend = isSend;
        this.identity = identity;
        this.relativePerson = relativePerson;
        this.relativeThing = relativeThing;
        this.urgency = urgency;
        this.submiter = submiter;
        this.video = video;
        this.note = note;
        this.submitTime = submitTime;
        this.submiterUCId = submiterUCId;
        this.car_identity = car_identity;
        this.power_number = power_number;
        this.phone = phone;
        this.current_address = current_address;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubmitLatitude() {
        return this.submitLatitude;
    }

    public void setSubmitLatitude(String submitLatitude) {
        this.submitLatitude = submitLatitude;
    }

    public String getSubmitLongitude() {
        return this.submitLongitude;
    }

    public void setSubmitLongitude(String submitLongitude) {
        this.submitLongitude = submitLongitude;
    }

    public String getVoice() {
        return this.voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIsSend() {
        return this.isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    public String getIdentity() {
        return this.identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getRelativePerson() {
        return this.relativePerson;
    }

    public void setRelativePerson(String relativePerson) {
        this.relativePerson = relativePerson;
    }

    public String getRelativeThing() {
        return this.relativeThing;
    }

    public void setRelativeThing(String relativeThing) {
        this.relativeThing = relativeThing;
    }

    public Integer getUrgency() {
        return this.urgency;
    }

    public void setUrgency(Integer urgency) {
        this.urgency = urgency;
    }

    public String getSubmiter() {
        return this.submiter;
    }

    public void setSubmiter(String submiter) {
        this.submiter = submiter;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSubmitTime() {
        return this.submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getSubmiterUCId() {
        return this.submiterUCId;
    }

    public void setSubmiterUCId(String submiterUCId) {
        this.submiterUCId = submiterUCId;
    }

    public String getCar_identity() {
        return this.car_identity;
    }

    public void setCar_identity(String car_identity) {
        this.car_identity = car_identity;
    }

    public String getPower_number() {
        return this.power_number;
    }

    public void setPower_number(String power_number) {
        this.power_number = power_number;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCurrent_address() {
        return this.current_address;
    }

    public void setCurrent_address(String current_address) {
        this.current_address = current_address;
    }
}
