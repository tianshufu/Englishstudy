package com.tianshu.entity;

public class Teacher {
    private int teacher_id;
    private String teacher_name;
    private String zoom_contact;
    private int credit;
    private float rate;
    private String email;
    private String image_url;
    private String audio_url;
    private String teacher_password;
    private String zoom_password;
    private String skype_account;
    private String wechat_account;

    public Teacher() {
    }

    public Teacher(int teacher_id, String teacher_name, String zoom_contact, int credit, float rate, String email, String image_url, String audio_url, String teacher_password, String zoom_password, String skype_account, String wechat_account) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.zoom_contact = zoom_contact;
        this.credit = credit;
        this.rate = rate;
        this.email = email;
        this.image_url = image_url;
        this.audio_url = audio_url;
        this.teacher_password = teacher_password;
        this.zoom_password = zoom_password;
        this.skype_account = skype_account;
        this.wechat_account = wechat_account;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getZoom_contact() {
        return zoom_contact;
    }

    public void setZoom_contact(String zoom_contact) {
        this.zoom_contact = zoom_contact;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public String getTeacher_password() {
        return teacher_password;
    }

    public void setTeacher_password(String teacher_password) {
        this.teacher_password = teacher_password;
    }

    public String getZoom_password() {
        return zoom_password;
    }

    public void setZoom_password(String zoom_password) {
        this.zoom_password = zoom_password;
    }

    public String getSkype_account() {
        return skype_account;
    }

    public void setSkype_account(String skype_account) {
        this.skype_account = skype_account;
    }

    public String getWechat_account() {
        return wechat_account;
    }

    public void setWechat_account(String wechat_account) {
        this.wechat_account = wechat_account;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", teacher_name='" + teacher_name + '\'' +
                ", zoom_contact='" + zoom_contact + '\'' +
                ", credit=" + credit +
                ", rate=" + rate +
                ", email='" + email + '\'' +
                ", image_url='" + image_url + '\'' +
                ", audio_url='" + audio_url + '\'' +
                ", teacher_password='" + teacher_password + '\'' +
                ", zoom_password='" + zoom_password + '\'' +
                ", skype_account='" + skype_account + '\'' +
                ", wechat_account='" + wechat_account + '\'' +
                '}';
    }
}


