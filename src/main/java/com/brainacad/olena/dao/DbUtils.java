package com.brainacad.olena.dao;


import com.brainacad.olena.dao.DbUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtils{

    public static final  String URL= "url";
    public static final  String USER ="user";
    public static final  String PASSWORD ="password";
    public  static Properties props = new Properties();
    private static Connection connection;
    static {
        try (InputStream stream =
                     com.brainacad.olena.dao.DbUtils.class.getClassLoader().getResourceAsStream("db.properties")){

        }catch (IOException e){
            throw new RuntimeException();
        }


        Thread thread = new Thread(DbUtils::closeConnection);
            Runtime.getRuntime().addShutdownHook(thread);
    }

    public static Connection getConnection()throws SQLException {
        try {
            if (connection== null || !connection.isValid(500))
                connection = DriverManager.getConnection(DbUtils.props.getProperty(URL), DbUtils.props.getProperty(USER), DbUtils.props.getProperty(PASSWORD));
        }catch(SQLException e){
            throw new RuntimeException("ups!",e);
        }
        return connection;
    }
    private static void  closeConnection()throws SQLException {
        try{
        if(connection!=null) connection.close();
    }catch (SQLException e){
        throw new RuntimeException("ups!2", e);
        }
    }

}
