package com.tianshu.entity;

public class StudentCourseComment {
    private int teacherid;
    private int studentid;
    private String teachername;
    private  String teacherimageurl;
    private String date;
    private  String timeslot;
    private  String studentstatus;
    private  String pronounciation;
    private  String gramma;
    private  String comment;

    public StudentCourseComment(int teacherid, int studentid, String teachername, String teacherimageurl, String date, String timeslot, String studentstatus, String pronounciation, String gramma, String comment) {
        this.teacherid = teacherid;
        this.studentid = studentid;
        this.teachername = teachername;
        this.teacherimageurl = teacherimageurl;
        this.date = date;
        this.timeslot = timeslot;
        this.studentstatus = studentstatus;
        this.pronounciation = pronounciation;
        this.gramma = gramma;
        this.comment = comment;
    }

    public StudentCourseComment() {

    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getTeacherimageurl() {
        return teacherimageurl;
    }

    public void setTeacherimageurl(String teacherimageurl) {
        this.teacherimageurl = teacherimageurl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public String getStudentstatus() {
        return studentstatus;
    }

    public void setStudentstatus(String studentstatus) {
        this.studentstatus = studentstatus;
    }

    public String getPronounciation() {
        return pronounciation;
    }

    public void setPronounciation(String pronounciation) {
        this.pronounciation = pronounciation;
    }

    public String getGramma() {
        return gramma;
    }

    public void setGramma(String gramma) {
        this.gramma = gramma;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "StudentCourseComment{" +
                "teacherid=" + teacherid +
                ", studentid=" + studentid +
                ", teachername='" + teachername + '\'' +
                ", teacherimageurl='" + teacherimageurl + '\'' +
                ", date='" + date + '\'' +
                ", timeslot='" + timeslot + '\'' +
                ", studentstatus='" + studentstatus + '\'' +
                ", pronounciation='" + pronounciation + '\'' +
                ", gramma='" + gramma + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}


