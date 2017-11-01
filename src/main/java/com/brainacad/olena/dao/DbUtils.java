package com.brainacad.olena.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    private static final  String URL= "url";
    private static final  String USER ="user";
    private static final  String PASSWORD = "password";

    private static Connection connection;
    static {
        Thread thread = new Thread(DbUtils::closeConnection);
        Runtime.getRuntime().addShutdownHook(thread);
    }

    public static Connection getConnection(){
        try {
            if (connection == null || connection.isValid(500))
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (SQLException e) {
            throw new RuntimeException("Connection failed", e);
        }
        return connection;
    }
    private static void  closeConnection(){
        try{
        if(connection!=null){
            connection.close();
        }
    }catch (SQLException e){
        throw new RuntimeException("");
        }
    }

}
