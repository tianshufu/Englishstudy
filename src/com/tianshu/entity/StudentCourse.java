package com.tianshu.entity;

public class StudentCourse {
    private  String  date ;
    private  String  time;
    private  String  books;
    private String  speakpace;
    private String  teachername;
    private String  zoomcontact;
    private String  zoompassword;
    private int teacherid;
    private String leavewords;
    private  String platform;
    private  String skype_account;
    private  String wechat_account;

    public StudentCourse() {
    }

    public StudentCourse(String date, String time, String books, String speakpace, String teachername, String zoomcontact, String zoompassword, int teacherid, String leavewords, String platform, String skype_account, String wechat_account) {
        this.date = date;
        this.time = time;
        this.books = books;
        this.speakpace = speakpace;
        this.teachername = teachername;
        this.zoomcontact = zoomcontact;
        this.zoompassword = zoompassword;
        this.teacherid = teacherid;
        this.leavewords = leavewords;
        this.platform = platform;
        this.skype_account = skype_account;
        this.wechat_account = wechat_account;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getSpeakpace() {
        return speakpace;
    }

    public void setSpeakpace(String speakpace) {
        this.speakpace = speakpace;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getZoomcontact() {
        return zoomcontact;
    }

    public void setZoomcontact(String zoomcontact) {
        this.zoomcontact = zoomcontact;
    }

    public String getZoompassword() {
        return zoompassword;
    }

    public void setZoompassword(String zoompassword) {
        this.zoompassword = zoompassword;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getLeavewords() {
        return leavewords;
    }

    public void setLeavewords(String leavewords) {
        this.leavewords = leavewords;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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
        return "StudentCourse{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", books='" + books + '\'' +
                ", speakpace='" + speakpace + '\'' +
                ", teachername='" + teachername + '\'' +
                ", zoomcontact='" + zoomcontact + '\'' +
                ", zoompassword='" + zoompassword + '\'' +
                ", teacherid=" + teacherid +
                ", leavewords='" + leavewords + '\'' +
                ", platform='" + platform + '\'' +
                ", skype_account='" + skype_account + '\'' +
                ", wechat_account='" + wechat_account + '\'' +
                '}';
    }
}
