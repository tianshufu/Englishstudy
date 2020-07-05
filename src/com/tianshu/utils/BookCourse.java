package com.tianshu.utils;

import com.tianshu.entity.TeacherTimeTable;
import com.tianshu.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookCourse {
    public boolean Add_Course_info_and_Delete_slot(int teacherId,String date, int timeslot,int studentid, String time,String books,String speakingPace,String leaveword,String courseplatform){
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
            String sql1 = "INSERT INTO BookCourse_table (Student_id, Teacher_id, Date, Time, Books, Speaking_pace, Leave_word,Class_platform) VALUES (?,?,?,?,?,?,?,?)";
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1, studentid);
            preparedStatement1.setInt(2, teacherId);
            preparedStatement1.setString(3, date);
            preparedStatement1.setString(4, time);
            preparedStatement1.setString(5, books);
            preparedStatement1.setString(6, speakingPace);
            preparedStatement1.setString(7, leaveword);
            preparedStatement1.setString(8,courseplatform);
            preparedStatement1.executeUpdate();

            String sql2 = "UPDATE  Teacher_Time SET  Selected=True WHERE Teacher_id=?  AND Date=? AND  Time_slot=?";
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


    public Integer Search_Student_left_class(int studentid)
    {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int studentleftclass=0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT LeftClassNum from englishstudy.Student where Student_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, studentid);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next())
            {
                studentleftclass=resultSet.getInt("LeftClassNum");
                System.out.println(studentleftclass);
            }



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

        return  studentleftclass;



    }


    //jdbc function to add student's left class when booking a new class

    public void Add_Student_left_class(int studentid,int cost)
    {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "update Student set LeftClassNum=LeftClassNum+? where Student_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,cost);
            preparedStatement.setInt(2, studentid);
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


    //jdbc function to subtract student's left class when booking a new class

    public void Subtract_Student_left_class(int studentid,int cost)
    {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "update Student set LeftClassNum=LeftClassNum-? where Student_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,cost);
            preparedStatement.setInt(2, studentid);
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

    public static void main(String[] args) {
        BookCourse bookCourse= new BookCourse();
        //5,"2020-06-05",2,2,"09:00-09:25"
       // bookCourse.Add_Course_info_and_Delete_slot(5,"2020-06-05",2,2,"09:00-09:25","toefl","Fast","how are you");
        //bookCourse.Subtract_Student_left_class(1);
        //bookCourse.Search_Student_left_class(2);
        bookCourse.Search_Student_left_class(2);
        bookCourse.Subtract_Student_left_class(2,2);
        bookCourse.Search_Student_left_class(2);

    }
}
