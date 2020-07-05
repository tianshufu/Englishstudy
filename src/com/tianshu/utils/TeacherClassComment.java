package com.tianshu.utils;


import com.tianshu.entity.Student;
import com.tianshu.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//this is the jdbc to write the teacher's comment for student, also delete the value from the schedule table
public class TeacherClassComment {
    public void InsertTeacherComment(int teacherid, int studentid,String date,String timeslot,String studentstatus, String pronounciation,String gramma,String comment) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT INTO Teacher_Comment_Course (Teacher_id, Student_id,Date, Time_slot, Student_status, Pronounciation, Gramma, Comment) VALUES (?,?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,teacherid);
            preparedStatement.setInt(2,studentid);
            preparedStatement.setString(3,date);
            preparedStatement.setString(4,timeslot);
            preparedStatement.setString(5,studentstatus);
            preparedStatement.setString(6,pronounciation);
            preparedStatement.setString(7,gramma);
            preparedStatement.setString(8,comment);
            preparedStatement.executeUpdate();


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


    }

    public void Delete_Finnished_Class(int teacherid, int studentid,String date,String timeslot) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = " DELETE from BookCourse_table where Teacher_id=? and Student_id=? and Date=? and Time=? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,teacherid);
            preparedStatement.setInt(2,studentid);
            preparedStatement.setString(3,date);
            preparedStatement.setString(4,timeslot);

            preparedStatement.executeUpdate();


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


    }




    public static void main(String[] args) {
        TeacherClassComment teacherClassComment=new TeacherClassComment();
       // teacherClassComment.InsertTeacherComment(1,2,"2020-06-02","08:30-08:55","Absent","verygood","need to improve","very great");
        teacherClassComment.Delete_Finnished_Class(5,1,"2020-06-02","09:00-09:25");
    }
}
