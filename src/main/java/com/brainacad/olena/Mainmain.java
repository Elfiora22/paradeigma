package com.brainacad.olena;
import com.brainacad.olena.dao.AnswerDao;
import com.brainacad.olena.entities.Answer;
import org.flywaydb.core.Flyway;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.brainacad.olena.dao.DbUtils.PASSWORD;
import static com.brainacad.olena.dao.DbUtils.URL;
import static com.brainacad.olena.dao.DbUtils.USER;

/**
 * Created by elenafostachuk on 10/2/17.
 */
public class Mainmain {

    public static void main(String[] args) throws  IOException {
        Properties props = new Properties();
        try (InputStream stream = Mainmain.class.getClassLoader().getResourceAsStream("db.properties")) {
            props.load(stream);
        }

        Answer answer = new Answer();
        Long id = Long.valueOf(12);
        String answerText = "aaaaaaaa";
        Long questionID = Long.valueOf(13);
        Long scopeId = Long.valueOf(14);
        Long surveySessionId = Long.valueOf(15);
        AnswerDao.saveAnswer(answer);

        Flyway flyway = new Flyway();
        flyway.setDataSource(props.getProperty(URL),props.getProperty(USER), props.getProperty(PASSWORD));
        flyway.migrate();
        
    }

}



























