package com.brainacad.olena;

import org.flywaydb.core.Flyway;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by elenafostachuk on 10/2/17.
 */
public class Mainmain {
    private static final  String URL= "url";
    private static final  String USER ="user";
    private static final  String PASSWORD = "password";


    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        try (InputStream stream = Mainmain.class.getClassLoader().getResourceAsStream("db.properties")) {
            props.load(stream);
        }
        Flyway flyway = new Flyway();
        flyway.setDataSource(props.getProperty(URL), props.getProperty(USER), props.getProperty(PASSWORD));
        flyway.migrate();
    }
}


