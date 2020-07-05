package com.tianshu.utils;

import com.tianshu.entity.Teacher;
import com.tianshu.entity.TeacherTimeTable;
import com.tianshu.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SearchTeacherTimeStudent {
    public TeacherTimeTable fetchby_teacher_date(int teacherId, String date) {
        FilterPassedClass filterPassedClass=new FilterPassedClass();
        TeacherTimeTable teacherTimeTable = new TeacherTimeTable();
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        ResultSet resultset1=null;
        ResultSet resultSet2 = null;
        List<User> list = new ArrayList<>();
        User user = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql1 = "SELECT * from  Teacher_table where Teacher_id=?";
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1,teacherId);
            resultset1 = preparedStatement1.executeQuery();
            String teacher_name = null;
            String zoom_contact = null;
            int credit = 0;
            Float rate = 0f;
            String email = null;
            String image_url = null;
            String audio_url =null;
            String teacher_password=null;
            String zoom_password=null;
            String skype_account=null;
            String wechat_account=null;
            while (resultset1.next())
            {
                teacherId=resultset1.getInt("Teacher_id");
                teacher_name=resultset1.getString("Teacher_name");
                zoom_contact=resultset1.getString("Zoom_contact");
                credit=resultset1.getInt("Credit");
                rate= resultset1.getFloat("Rate");
                email=resultset1.getString("Email");
                image_url=resultset1.getString("Image_url");
                audio_url=resultset1.getString("Audio_url");
                teacher_password=resultset1.getString("Teacher_password");
                zoom_password=resultset1.getString("Zoom_password");
                skype_account=resultset1.getString("Skype_account");
                wechat_account=resultset1.getString("Wechat_account");

            }
            Teacher teacher = new Teacher(teacherId,teacher_name,zoom_contact,credit,rate,email,image_url,audio_url,teacher_password,zoom_password,skype_account,wechat_account);
            teacherTimeTable = new TeacherTimeTable(teacher,date);
            String sql2 = "SELECT Time_slot,Selected from Teacher_Time where Teacher_id=? and Date=?";
            preparedStatement2 = connection.prepareStatement(sql2);
            preparedStatement2.setInt(1, teacherId);
            preparedStatement2.setString(2, date);

            resultSet2 = preparedStatement2.executeQuery();



            while (resultSet2.next()) {
                int timeslot = resultSet2.getInt("Time_slot");
                boolean selected=resultSet2.getBoolean("Selected");
                int current_slot=filterPassedClass.current_timeslot_todate(date);
                System.out.println("Current_slot"+current_slot);
                if((selected!=true )&(timeslot>current_slot+1))
                {
                    teacherTimeTable.addTeacherTime(timeslot);
                    System.out.println(timeslot);
                }
                //teacherTimeTable.addTeacherTime(timeslot);
                // user= new User(username,password,email);


            }



            System.out.println(" 实例化Statement对象...");


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                try{
                    try{
                        preparedStatement2.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    preparedStatement1.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return  teacherTimeTable;

    }

    public static void main(String[] args) {
        SearchTeacherTimeStudent searchTeacherTimeStudent=new SearchTeacherTimeStudent();
        searchTeacherTimeStudent.fetchby_teacher_date(4,"2020-06-11");
    }
}
