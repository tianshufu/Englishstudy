package com.tianshu.utils;

import com.tianshu.entity.Admin;

import java.sql.*;

public class AdminLoginInfoSearch {
    public Admin adminloginsearch(String Username, String Password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultset1 = null;
        Admin admin=null;
        String adminname = null;
        String adminpass=null;
        Integer adminlevel=null;
        Integer adminid=null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * from Admin where Adminname=? and Adminpass=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, Username);
            preparedStatement.setString(2, Password);
            resultset1 = preparedStatement.executeQuery();
            while (resultset1.next()) {
                adminname=resultset1.getString("Adminname");
                adminpass=resultset1.getString("Adminpass");
                adminlevel=resultset1.getInt("Adminlevel");
                adminid=resultset1.getInt("Adminid");
                admin=new Admin(adminname,adminid,adminpass,adminlevel);

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
            return admin;

    }


    public static void main(String[] args) {
        AdminLoginInfoSearch adminLoginInfoSearch=new AdminLoginInfoSearch();
        Admin admin=adminLoginInfoSearch.adminloginsearch("Tony","1234");
        System.out.println(admin);

    }


}
