package com.brainacad.olena;

import com.brainacad.olena.dao.AnswerDao;
import com.brainacad.olena.entities.Answer;
import org.flywaydb.core.Flyway;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
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


    Answer answer = new Answer();
    Long id = Long.valueOf(123);
    String answerText = "There is some life on Mars";
    Long questionId = Long.valueOf(22);
    Long scopeId = Long.valueOf(21);
    Long surveySessionId = Long.valueOf(55);

    public void saveAnswer(Answer answer) throws SQLException {
        if (id != 0 | answerText != null | questionId != 0 | scopeId != 0 | surveySessionId != 0) {
            AnswerDao.saveAnswer(answer);
        } else System.out.println("Save failed");
    }
}







