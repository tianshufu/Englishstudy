package com.tianshu.utils;

import com.tianshu.entity.Coursevideo;
import com.tianshu.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherVideo {
    public void InsertCourseVideo(int teacherid,String date, String timeslot, int studentid,String video_url) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT into Course_video (Teacher_id, Date, Time_slot, Student_id, Video_url) VALUES (?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, teacherid);
            preparedStatement.setString(2, date);
            preparedStatement.setString(3,timeslot);
            preparedStatement.setInt(4,studentid);
            preparedStatement.setString(5,video_url);
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

    public void DeleteCourseVideo(int teacherid,String date, String timeslot, int studentid) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "delete from Course_video where Teacher_id=? and Date=? and Time_slot=? and Student_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, teacherid);
            preparedStatement.setString(2, date);
            preparedStatement.setString(3,timeslot);
            preparedStatement.setInt(4,studentid);

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

    public List<Coursevideo> Searchallstudentinfo() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Coursevideo> coursevideoList = new ArrayList<>();
        Student student=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * from Course_video";
            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer teacherid = resultSet.getInt("Teacher_id");
                String date=resultSet.getString("Date");
                String timeslot=resultSet.getString("Time_slot");
                Integer studentid=resultSet.getInt("Student_id");
                String videourl=resultSet.getString("Video_url");

                Coursevideo coursevideo= new Coursevideo(teacherid,date,timeslot,studentid,videourl);
                coursevideoList.add(coursevideo);


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
        return coursevideoList;

    }





    // test
    public static void main(String[] args) {
        TeacherVideo teacherVideo=new TeacherVideo();
        System.out.println(teacherVideo.Searchallstudentinfo());

    }
}
