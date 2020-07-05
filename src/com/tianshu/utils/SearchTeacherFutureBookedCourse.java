package com.tianshu.utils;


import com.tianshu.entity.StudentCourse;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//This is the jdbc to find the booked but not finnished course for teacher for one date
public class SearchTeacherFutureBookedCourse {
    public List<StudentCourse> searchteachercourse(int teacherid, String date) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<StudentCourse> studentcourseslist = new ArrayList<>();

        StudentCourse studentCourse = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "select * from BookCourse_table inner join Teacher_table on BookCourse_table.Teacher_id=Teacher_table.Teacher_id where BookCourse_table.Teacher_id=? and Date=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, teacherid);
            preparedStatement.setString(2,date);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String date2 = resultSet.getString("Date");
                String time = resultSet.getString("Time");
                String books = resultSet.getString("Books");
                String speakpace = resultSet.getString("Speaking_pace");
                String teachername = resultSet.getString("Teacher_name");
                String zoomcontact = resultSet.getString("Zoom_contact");
                String zoompassword = resultSet.getString("Zoom_password");
                String leavewords=resultSet.getString("Leave_word");
                String platform=resultSet.getString("Class_platform");
                String skype_account=resultSet.getString("Skype_account");
                String wechat_account=resultSet.getString("Wechat_account");
                studentCourse = new StudentCourse(date2, time, books, speakpace, teachername, zoomcontact, zoompassword, teacherid,leavewords,platform,skype_account,wechat_account);
                studentcourseslist.add(studentCourse);


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
        return studentcourseslist;
    }

    public static void main(String[] args) {
        SearchTeacherFutureBookedCourse searchTeacherFutureBookedCourse= new SearchTeacherFutureBookedCourse();
        //List<StudentCourse>=searchTeacherFutureBookedCourse.searchteachercourse(1,"2020-06-01");
    }



}
