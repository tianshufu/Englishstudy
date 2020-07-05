package com.tianshu.utils;

import com.tianshu.entity.TeacherTimeTable;
import com.tianshu.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentCancelCourse {
    public boolean StudentCancelCourse(int teacherId,String date, int timeslot,int studentid, String time){
        TeacherTimeTable teacherTimeTable = new TeacherTimeTable();
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        List<User> list = new ArrayList<>();
        User user = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
        final String USER = "root";
        final String PASS = "Fts970914980416+123";
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setAutoCommit(false);
            String sql1 = "DELETE from englishstudy.BookCourse_table where englishstudy.BookCourse_table.Teacher_id=? and englishstudy.BookCourse_table.Student_id=? and englishstudy.BookCourse_table.Time=? and englishstudy.BookCourse_table.Date=?";
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1, teacherId);
            preparedStatement1.setInt(2, studentid);
            preparedStatement1.setString(3, time);
            preparedStatement1.setString(4, date);

            preparedStatement1.executeUpdate();

            String sql2 = "UPDATE  Teacher_Time SET  Selected=FALSE WHERE Teacher_id=?  AND Date=? AND  Time_slot=?";
            preparedStatement2 = connection.prepareStatement(sql2);
            preparedStatement2.setInt(1, teacherId);
            preparedStatement2.setString(2, date);
            preparedStatement2.setInt(3, timeslot);

            preparedStatement2.executeUpdate();
            connection.commit();
        }catch(Exception e){
            if(connection != null){
                try {
                    connection.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();
        }finally {
            if(connection != null){
                try{
                    try{
                        try{
                            preparedStatement2.close();
                        }catch (SQLException e){
                            e.printStackTrace();
                        }
                        preparedStatement1.close();
                    }catch (SQLException e){
                        e.printStackTrace();
                    }

                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }

            }
        }
        System.out.println(" 实例化Statement对象...");
        return true;

    }

    public static void main(String[] args) {
        StudentCancelCourse studentCancelCourse=new StudentCancelCourse();
        studentCancelCourse.StudentCancelCourse(5,"2020-06-05",2,2,"09:00-09:25");
    }
}
