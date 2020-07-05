package com.tianshu.utils;

import com.tianshu.entity.AdminCourseInfo;
import com.tianshu.entity.StudentCourse;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminSearchCourse {
    public List<AdminCourseInfo> adminsearchcourse() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        AdminCourseInfo adminCourseInfo=new AdminCourseInfo();
        List<AdminCourseInfo> admincourseslist = new ArrayList<>();
        StudentCourse studentCourse = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "select  Student.Student_id,Studentname,Teacher_table.Teacher_id,Teacher_name,Date,Time,Books,Speaking_pace,Leave_word,Class_platform,Phonenum,Student.Email from (BookCourse_table inner join Student on BookCourse_table.Student_id=Student.Student_id) inner join Teacher_table on BookCourse_table.Teacher_id=Teacher_table.Teacher_id; ";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               int studentid=resultSet.getInt("Student_id");
               String studentname=resultSet.getString("Studentname");
               int teacherid=resultSet.getInt("Teacher_id");
               String teachername=resultSet.getString("Teacher_name");
               String date=resultSet.getString("Date");
               String time=resultSet.getString("Time");
               String books=resultSet.getString("Books");
               String speakpace=resultSet.getString("Speaking_pace");
               String leaveword=resultSet.getString("Leave_word");
               String courseplatform=resultSet.getString("Class_platform");
               String phonenum=resultSet.getString("Phonenum");
               String email=resultSet.getString("Email");
               adminCourseInfo=new AdminCourseInfo(studentid,studentname,teacherid,teachername,date,time,books,speakpace,leaveword,courseplatform,phonenum,email);
               admincourseslist.add(adminCourseInfo);


            }


            System.out.println(" 实例化Statement对象...");


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return admincourseslist;
    }

    public static void main(String[] args) {
        AdminSearchCourse adminSearchCourse= new AdminSearchCourse();
        AdminCourseInfo adminCourseInfo= new AdminCourseInfo();
        List<AdminCourseInfo> adminCourseInfoList=new ArrayList<>();
        adminCourseInfoList=adminSearchCourse.adminsearchcourse();
        System.out.println(adminCourseInfoList);

    }

}
