package com.tianshu.utils;

import com.tianshu.entity.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// this is the jdbc to find the comments of class for one student
public class StudentSearchComment {
    public List<StudentCourseComment> searchstudentcomment (int studentid) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        StudentCourseComment studentCourseComment=null;
        List<StudentCourseComment> studentCourseCommentsList = new ArrayList<>();

        StudentCourse studentCourse = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "select * from Teacher_Comment_Course INNER JOIN Teacher_table on Teacher_table.Teacher_id=Teacher_Comment_Course.Teacher_id where Student_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, studentid);
            resultSet=preparedStatement.executeQuery();

            while (resultSet.next()) {
                Integer teacherid= resultSet.getInt("Teacher_id");
                String teachername=resultSet.getString("Teacher_name");
                String teacherimageurl=resultSet.getString("Image_url");
                String date=resultSet.getString("Date");
                String timeslot=resultSet.getString("Time_slot");
                String studentstatus=resultSet.getString("Student_status");
                String pronounciation=resultSet.getString("Pronounciation");
                String gramma=resultSet.getString("Gramma");
                String comment=resultSet.getString("Comment");
                studentCourseComment=new StudentCourseComment(teacherid,studentid,teachername,teacherimageurl,date,timeslot,studentstatus,pronounciation,gramma,comment);
                studentCourseCommentsList.add(studentCourseComment);






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
        return    studentCourseCommentsList;

    }


    public static void main(String[] args) {
        StudentSearchComment studentSearchComment=new StudentSearchComment();
        List<StudentCourseComment> studentCourseCommentList= new ArrayList<>();
        studentCourseCommentList=studentSearchComment.searchstudentcomment(1);
        System.out.println(studentCourseCommentList);

    }



}
