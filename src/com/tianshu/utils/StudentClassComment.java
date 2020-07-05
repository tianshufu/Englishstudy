package com.tianshu.utils;

import com.tianshu.entity.StudentCourseComment;

import java.sql.*;

public class StudentClassComment {
    public void InsertStudentComment(int teacherid, int studentid,String date,String timeslot,int score,String comment) {
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
            String sql = "INSERT INTO Student_Comment_Course(Teacher_id, Student_id, Date, Time_slot, RateScore, Comment) VALUES (?,?,?,?,?,?) ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,teacherid);
            preparedStatement.setInt(2,studentid);
            preparedStatement.setString(3,date);
            preparedStatement.setString(4,timeslot);
            preparedStatement.setInt(5,score);
            preparedStatement.setString(6,comment);
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
        StudentClassComment studentClassComment=new StudentClassComment();
        studentClassComment.InsertStudentComment(3,4,"2020-06-06","08:00:08:25",9,"Teacher Cindy is very good");
    }

}
