package com.tianshu.utils;

import com.tianshu.entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BooksInfo {
    public void InsertBookinfo(String bookname, String bookurl) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT into Booksinfo (Book_name, Book_url) VALUES (?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,bookname);
            preparedStatement.setString(2,bookurl);
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

    public void DeleteBooks(int bookid) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "delete from Booksinfo where Book_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,bookid);


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



    public List<Book> Searchallbooksinfo() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Book> booklist = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://127.0.0.1:3306/englishstudy?&useSSL=false&characterEncoding=utf8";
            final String USER = "root";
            final String PASS = "Fts970914980416+123";
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * from Booksinfo";
            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               String bookname=resultSet.getString("Book_name");
               int bookid=resultSet.getInt("Book_id");
               String bookurl=resultSet.getString("Book_url");
               Book book=new Book(bookname,bookid,bookurl);
               booklist.add(book);



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
        return booklist;

    }






    // test function
    public static void main(String[] args) {
        BooksInfo booksInfo=new BooksInfo();
        //booksInfo.InsertBookinfo("Tofel","loren.world");
        booksInfo.DeleteBooks(1);
        System.out.println(booksInfo.Searchallbooksinfo());
    }
}
