package com.tianshu.entity;

public class BookCourse {
    private int student_id;
    private int teacher_id;
    private String date;
    private  int time_slot;
    private String books;
    private  String speaking_pace;
    private  String leave_word;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
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

    public int getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(int time_slot) {
        this.time_slot = time_slot;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getSpeaking_pace() {
        return speaking_pace;
    }

    public void setSpeaking_pace(String speaking_pace) {
        this.speaking_pace = speaking_pace;
    }

    public String getLeave_word() {
        return leave_word;
    }

    public void setLeave_word(String leave_word) {
        this.leave_word = leave_word;
    }

    @Override
    public String toString() {
        return "BookCourse{" +
                "student_id=" + student_id +
                ", teacher_id=" + teacher_id +
                ", date='" + date + '\'' +
                ", time_slot=" + time_slot +
                ", books='" + books + '\'' +
                ", speaking_pace='" + speaking_pace + '\'' +
                ", leave_word='" + leave_word + '\'' +
                '}';
    }

    public BookCourse(int student_id, int teacher_id, String date, int time_slot, String books, String speaking_pace, String leave_word) {
        this.student_id = student_id;
        this.teacher_id = teacher_id;
        this.date = date;
        this.time_slot = time_slot;
        this.books = books;
        this.speaking_pace = speaking_pace;
        this.leave_word = leave_word;
    }

    public BookCourse() {
    }
}
