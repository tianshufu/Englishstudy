package com.tianshu.utils;

import com.tianshu.entity.StudentCourse;
import com.tianshu.entity.TeacherCourse;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//this class is for searching and changing the booked class for the teacher
public class TeacherBookedClass {
    //see the booked class for a teacher
    public List<TeacherCourse> searchstudentcourse(int teacherid) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<StudentCourse> studentcourseslist = new ArrayList<>();
        List<TeacherCourse> teacherCourseList=new ArrayList<>();
        TeacherCourse teacherCourse=null;
        //StudentCourse studentCourse = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "select * from BookCourse_table inner join Student on BookCourse_table.Student_id=Student.Student_id where BookCourse_table.Teacher_id=? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, teacherid);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                String date = resultSet.getString("Date");
                String time = resultSet.getString("Time");
                String books = resultSet.getString("Books");
                String speakpace = resultSet.getString("Speaking_pace");
                String leaveword = resultSet.getString("Leave_word");
                String studentname = resultSet.getString("Studentname");
                String leavewords=resultSet.getString("Leave_word");
                int studentid=resultSet.getInt("Student_id");
                String platform=resultSet.getString("Class_platform");
                //studentCourse = new StudentCourse(date, time, books, speakpace, teachername, zoomcontact, zoompassword, teacherid,leavewords);
                //studentcourseslist.add(studentCourse);
                teacherCourse= new TeacherCourse(date,time,books,speakpace,leaveword,studentname,leavewords,studentid,platform);
                teacherCourseList.add(teacherCourse);

               // teacherCourse=new TeacherCourse(date,time,books,)



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
        return teacherCourseList;
    }

    public static void main(String[] args) {
        TeacherBookedClass teacherBookedClass=new TeacherBookedClass();

        System.out.println(teacherBookedClass.searchstudentcourse(5));
    }

}
