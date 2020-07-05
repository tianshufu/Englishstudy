package com.tianshu.entity;

public class Coursevideo {
    private  int teacher_id;
    private  String date;
    private  String time_slot;
    private  int student_id;
    private  String video_url;

    public Coursevideo() {

    }

    public Coursevideo(int teacher_id, String date, String time_slot, int student_id, String video_url) {
        this.teacher_id = teacher_id;
        this.date = date;
        this.time_slot = time_slot;
        this.student_id = student_id;
        this.video_url = video_url;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(String time_slot) {
        this.time_slot = time_slot;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    @Override
    public String toString() {
        return "Coursevideo{" +
                "teacher_id=" + teacher_id +
                ", date='" + date + '\'' +
                ", time_slot='" + time_slot + '\'' +
                ", student_id=" + student_id +
                ", video_url='" + video_url + '\'' +
                '}';
    }
}
