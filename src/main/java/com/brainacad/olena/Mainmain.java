package com.brainacad.olena;

import org.flywaydb.core.Flyway;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import static com.brainacad.olena.dao.DbUtils.*;

/**
 * Created by elenafostachuk on 10/2/17.
 */
public class Mainmain {

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


