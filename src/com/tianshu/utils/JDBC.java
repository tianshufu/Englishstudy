package com.tianshu.utils;

import com.tianshu.entity.Student;
import com.tianshu.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
Connect the database
 */

// jdbc to get the info of the student
public class JDBC {
    public Student login(String Username, String Password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> list = new ArrayList<>();
        User user = null;
        Student student=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * from Student where Studentname=? and Password=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, Username);
            preparedStatement.setString(2, Password);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String  username = resultSet.getString("Studentname");
                String  password = resultSet.getString("Password");
                String  email = resultSet.getString("Email");
                Integer student_id=resultSet.getInt("Student_id");
                Integer leftclassnum=resultSet.getInt("LeftClassNum");
                String  phonenum=resultSet.getString("Phonenum");
                student=new Student(Username,password,email,student_id,leftclassnum,phonenum);


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
        return student;

    }

    public Student studentinfo(int studentid) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> list = new ArrayList<>();
        User user = null;
        Student student=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * from Student where Student_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,studentid);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String  username = resultSet.getString("Studentname");
                String  password = resultSet.getString("Password");
                String  email = resultSet.getString("Email");
                Integer student_id=resultSet.getInt("Student_id");
                Integer leftclassnum=resultSet.getInt("LeftClassNum");
                String  phonenum=resultSet.getString("Phonenum");
                student=new Student(username,password,email,student_id,leftclassnum,phonenum);


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
        return student;

    }

    public static void main(String[] args) {
       JDBC jdbc=new JDBC();
       Student student=jdbc.login("TONY","FTS970914");
       if (student==null)
       {
           System.out.println("No such a person");
       }
       else {
           System.out.println(student);
       }



    }


}
