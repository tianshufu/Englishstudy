package com.tianshu.utils;

import com.tianshu.entity.Teacher;

import java.sql.*;

// this is the jdbc to get the teacher's all info
public class SearchTeacherInfo {
    public Teacher searchteacherinfo(int teacherid) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultset1 = null;
        Teacher teacher=null;
        String teacher_name = null;
        String zoom_contact = null;
        int credit = 0;
        Float rate = 0f;
        int teacherId = 0;
        String email = null;
        String image_url = null;
        String audio_url = null;
        String teacher_password = null;
        String zoom_password=null;
        String skype_account=null;
        String wechat_account=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * from Teacher_table where Teacher_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,teacherid);

            resultset1 = preparedStatement.executeQuery();
            while (resultset1.next()) {
                teacherId = resultset1.getInt("Teacher_id");
                teacher_name = resultset1.getString("Teacher_name");
                zoom_contact = resultset1.getString("Zoom_contact");
                credit = resultset1.getInt("Credit");
                rate = resultset1.getFloat("Rate");
                email = resultset1.getString("Email");
                image_url = resultset1.getString("Image_url");
                audio_url = resultset1.getString("Audio_url");
                teacher_password = resultset1.getString("Teacher_password");
                zoom_password=resultset1.getString("Zoom_password");
                skype_account=resultset1.getString("Skype_account");
                wechat_account=resultset1.getString("Wechat_account");

                teacher = new Teacher(teacherId, teacher_name, zoom_contact, credit, rate, email, image_url, audio_url, teacher_password,zoom_password,skype_account,wechat_account);

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
        return teacher;

    }

    public static void main(String[] args) {
        SearchTeacherInfo searchTeacherInfo=new SearchTeacherInfo();
        Teacher teacher=searchTeacherInfo.searchteacherinfo(3);
        System.out.println(teacher);
    }

}
