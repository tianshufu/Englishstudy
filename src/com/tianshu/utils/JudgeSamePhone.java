package com.tianshu.utils;

import java.sql.*;

// this jdbc is to see whether the phone num had been registerd before
public class JudgeSamePhone {
    public boolean judgesamephone(String phonenum) {
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
            String sql = "SELECT Phonenum from englishstudy.Student where Phonenum=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, phonenum);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Phonenum"));
                if(phonenum.equals(resultSet.getString("Phonenum")));
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
        JudgeSamePhone judgeSamePhone=new JudgeSamePhone();
        boolean flag=judgeSamePhone.judgesamephone("138712");
        System.out.println("if it is in"+flag);
    }
}
