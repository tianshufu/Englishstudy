package com.tianshu.utils;

import com.tianshu.entity.Student;

import java.sql.*;
import java.util.HashMap;

//this is the class dealing with teacher's rank
public class TeacherRank {
    public HashMap<Integer,Integer> getteracherrank()
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        HashMap<Integer,Integer> teacherrankmap= new HashMap<Integer, Integer>();
        Student student=null;
        int teacherank;
        int teacherid;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * from Teacher_display_rank";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                teacherid=resultSet.getInt("Teacher_id");
                teacherank=resultSet.getInt("Rank");
                teacherrankmap.put(teacherank,teacherid);


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
        return teacherrankmap;

    }

    public static void main(String[] args) {
        TeacherRank teacherRank=new TeacherRank();
        HashMap<Integer, Integer> teacherankmap=teacherRank.getteracherrank();
        System.out.println(teacherankmap);
    }
}
