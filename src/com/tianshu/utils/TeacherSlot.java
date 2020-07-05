package com.tianshu.utils;

//JDBC for class to insert, modify, delete the time-slot to the database
// In: Teacher-id, Date, Time-slot
//Out:None

import com.tianshu.entity.StudentCourse;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherSlot {
    //function to insert the data
    public void InsertTeacherTimeslot(int teacherid,String date, int timeslot) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT into Teacher_Time  (Teacher_id,Date,Time_slot,Selected) values (?,?,?,FALSE)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, teacherid);
            preparedStatement.setString(2, date);
            preparedStatement.setInt(3,timeslot);
            preparedStatement.executeUpdate();


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
    //test
    public static void main(String[] args) {
        TeacherSlot teacherSlot=new TeacherSlot();
        teacherSlot.InsertTeacherTimeslot(5,"2020-06-03",17);

    }


}
