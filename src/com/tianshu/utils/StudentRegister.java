package com.tianshu.utils;

import java.sql.*;

//this is the jdbc to register an account for the student
public class StudentRegister {
    public boolean InsertStudentaccount(String username, String password, String email, String phonenum,int leftclassnum) {
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
            String sql = "INSERT into englishstudy.Student (englishstudy.Student.Studentname, englishstudy.Student.Password, englishstudy.Student.Email, englishstudy.Student.LeftClassNum, englishstudy.Student.Phonenum) values (?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            preparedStatement.setString(3,email);
            preparedStatement.setInt(4,leftclassnum);
            preparedStatement.setString(5,phonenum);
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

        return  true;
    }

    public static void main(String[] args) {
        StudentRegister studentRegister=new StudentRegister();
        studentRegister.InsertStudentaccount("Jessy","1234","abc@qq.com","123789123",3);
    }


}
