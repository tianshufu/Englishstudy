package com.tianshu.utils;

import java.sql.*;

//this is the jdbc to update the teacher's info
public class TeacherInfoUpdate {
    public void teacherinfoupdate(int teacherid,String teachername, String email, String zoomID, String zoompass, String skype ,String wechat) {
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
            String sql = "update englishstudy.Teacher_table SET  englishstudy.Teacher_table.Teacher_name=?,englishstudy.Teacher_table.Email=?,englishstudy.Teacher_table.Zoom_contact=?,englishstudy.Teacher_table.Zoom_password=?,englishstudy.Teacher_table.Skype_account=?,englishstudy.Teacher_table.Wechat_account=? where englishstudy.Teacher_table.Teacher_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,teachername);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,zoomID);
            preparedStatement.setString(4,zoompass);
            preparedStatement.setString(5,skype);
            preparedStatement.setString(6,wechat);
            preparedStatement.setInt(7,teacherid);
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


}
