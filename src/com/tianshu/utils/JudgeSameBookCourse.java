package com.tianshu.utils;

import java.sql.*;

public class JudgeSameBookCourse {
    public boolean judgesamebookcourse(int studentid, int teacherid,String date, String time) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT Teacher_id from englishstudy.BookCourse_table where Student_id=? and  Date=? and Time=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, studentid);
            preparedStatement.setString(2,date);
            preparedStatement.setString(3,time);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Teacher_id"));
                if(teacherid==resultSet.getInt("Teacher_id"));
                {
                    return  false;
                }
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
        return true;
    }

    public static void main(String[] args) {
        JudgeSameBookCourse judgeSameBookCourse=new JudgeSameBookCourse();
        boolean courseflag=judgeSameBookCourse.judgesamebookcourse(2,4,"2020-06-15","13:30-13:55");
        System.out.println(courseflag);
    }
}
