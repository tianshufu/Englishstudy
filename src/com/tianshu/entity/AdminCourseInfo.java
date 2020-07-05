package com.tianshu.entity;

public class AdminCourseInfo {
    private int studentid;
    private String studentname;
    private int teacherid;
    private  String teachername;
    private String date;
    private String time;
    private String books;
    private String speakingpace;
    private String leavewords;
    private String classplatform;
    private String phonenum;
    private String email;

    public AdminCourseInfo() {
    }

    public AdminCourseInfo(int studentid, String studentname, int teacherid, String teachername, String date, String time, String books, String speakingpace, String leavewords, String classplatform, String phonenum, String email) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.date = date;
        this.time = time;
        this.books = books;
        this.speakingpace = speakingpace;
        this.leavewords = leavewords;
        this.classplatform = classplatform;
        this.phonenum = phonenum;
        this.email = email;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
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

    public String getSpeakingpace() {
        return speakingpace;
    }

    public void setSpeakingpace(String speakingpace) {
        this.speakingpace = speakingpace;
    }

    public String getLeavewords() {
        return leavewords;
    }

    public void setLeavewords(String leavewords) {
        this.leavewords = leavewords;
    }

    public String getClassplatform() {
        return classplatform;
    }

    public void setClassplatform(String classplatform) {
        this.classplatform = classplatform;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AdminCourseInfo{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", teacherid=" + teacherid +
                ", teachername='" + teachername + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", books='" + books + '\'' +
                ", speakingpace='" + speakingpace + '\'' +
                ", leavewords='" + leavewords + '\'' +
                ", classplatform='" + classplatform + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
