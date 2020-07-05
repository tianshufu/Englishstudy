package com.tianshu.entity;

public class Student {
    private String studentname;
    private  String password;
    private  String email;
    private  int studentid;
    private  int leftcoursenum;
    private  String phonenumber;

    public Student() {
    }

    public Student(String studentname, String password, String email, int studentid, int leftcoursenum, String phonenumber) {
        this.studentname = studentname;
        this.password = password;
        this.email = email;
        this.studentid = studentid;
        this.leftcoursenum = leftcoursenum;
        this.phonenumber = phonenumber;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getLeftcoursenum() {
        return leftcoursenum;
    }

    public void setLeftcoursenum(int leftcoursenum) {
        this.leftcoursenum = leftcoursenum;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", studentid=" + studentid +
                ", leftcoursenum=" + leftcoursenum +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
