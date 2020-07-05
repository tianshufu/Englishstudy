package com.tianshu.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTools {
    private static DataSource dataSource;
    static {
        dataSource=new ComboPooledDataSource("abcd");
        

    }
    
    public static Connection getConnection(){
        Connection connection=null;
        try (Connection connection1 = connection = dataSource.getConnection()) {
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
        
    }
    
    public static void release(Connection connection, Statement statement, ResultSet resultSet)
    {
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement!=null)
        {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(resultSet!=null)
        {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        System.out.println(JDBCTools.getConnection());
    }
}
