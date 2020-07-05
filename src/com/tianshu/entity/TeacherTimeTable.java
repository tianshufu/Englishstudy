package com.tianshu.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TeacherTimeTable {
    private Teacher teacher;
    private String date;
    private Map<Integer,Boolean> timeTable;

    public Map<Integer, Boolean> getTimeTable() {
        return timeTable;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TeacherTimeTable(Teacher teacher, String date) {
        this();
        this.teacher = teacher;
        this.date = date;
    }


    public TeacherTimeTable() {
        timeTable = new HashMap<Integer,Boolean>();
        for(int i = 0;i < 30;i++){
            timeTable.put(i,false);
        }

    }
    public void addTeacherTime(int timeSlot){
        this.timeTable.put(timeSlot,true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherTimeTable that = (TeacherTimeTable) o;
        return getTeacher().equals(that.getTeacher()) &&
                getDate().equals(that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeacher(), getDate());
    }

    @Override
    public String toString() {
        return "TeacherTimeTable{" +
                "teacher=" + teacher +
                ", date='" + date + '\'' +
                ", timeTable=" + timeTable +
                '}';
    }
}
