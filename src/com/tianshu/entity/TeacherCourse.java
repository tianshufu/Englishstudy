package com.tianshu.entity;

public class TeacherCourse {
    private String date;
    private String time ;
    private String books ;
    private String speakpace ;
    private String leaveword ;
    private String studentname;
    private String leavewords;
    private int studentid;
    private  String class_platform;

    public TeacherCourse() {
    }

    public TeacherCourse(String date, String time, String books, String speakpace, String leaveword, String studentname, String leavewords, int studentid, String class_platform) {
        this.date = date;
        this.time = time;
        this.books = books;
        this.speakpace = speakpace;
        this.leaveword = leaveword;
        this.studentname = studentname;
        this.leavewords = leavewords;
        this.studentid = studentid;
        this.class_platform = class_platform;
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

    public String getLeaveword() {
        return leaveword;
    }

    public void setLeaveword(String leaveword) {
        this.leaveword = leaveword;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getLeavewords() {
        return leavewords;
    }

    public void setLeavewords(String leavewords) {
        this.leavewords = leavewords;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getClass_platform() {
        return class_platform;
    }

    public void setClass_platform(String class_platform) {
        this.class_platform = class_platform;
    }

    @Override
    public String toString() {
        return "TeacherCourse{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", books='" + books + '\'' +
                ", speakpace='" + speakpace + '\'' +
                ", leaveword='" + leaveword + '\'' +
                ", studentname='" + studentname + '\'' +
                ", leavewords='" + leavewords + '\'' +
                ", studentid=" + studentid +
                ", class_platform='" + class_platform + '\'' +
                '}';
    }
}
