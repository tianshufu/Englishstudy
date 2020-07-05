package com.tianshu.utils;

import com.tianshu.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SearchStudentInfo {
    public List<Student> Searchallstudentinfo() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Student> studentList = new ArrayList<>();
        Student student=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * from Student";
            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String  studentname = resultSet.getString("Studentname");
                String  password = resultSet.getString("Password");
                String  email = resultSet.getString("Email");
                Integer student_id=resultSet.getInt("Student_id");
                Integer leftclassnum=resultSet.getInt("LeftClassNum");
                String  phonenum=resultSet.getString("Phonenum");
                student=new Student(studentname,password,email,student_id,leftclassnum,phonenum);
                studentList.add(student);


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
        return studentList;

    }

    public static void main(String[] args) {
        SearchStudentInfo searchStudentInfo=new SearchStudentInfo();
        List<Student> studentLis=new ArrayList<>();
        studentLis=searchStudentInfo.Searchallstudentinfo();
        System.out.println(studentLis);
    }

}
