package com.brainacad.olena;
import com.brainacad.olena.dao.AnswerDao;
import com.brainacad.olena.entities.Answer;
import org.flywaydb.core.Flyway;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import static com.brainacad.olena.dao.DbUtils.PASSWORD;
import static com.brainacad.olena.dao.DbUtils.URL;
import static com.brainacad.olena.dao.DbUtils.USER;

/**
 * Created by elenafostachuk on 10/2/17.
 */
public class Mainmain {

    public static void main(String[] args) throws IOException, SQLException {
        Properties props = new Properties();
        try (InputStream stream = com.brainacad.olena.Mainmain.class.getClassLoader().getResourceAsStream("db.properties")) {
            props.load(stream);
        }
        Flyway flyway = new Flyway();
        flyway.setDataSource(props.getProperty(URL),props.getProperty(USER), props.getProperty(PASSWORD));
        flyway.migrate();

        Answer answer = new Answer(12L, "aaa", 13L, 14L, 15L);
        answer.setId(12L);
        answer.setAnswerText("aaa");
        answer.setQuestionId(13L);
        answer.setScopeId(14L);
        answer.setScopeId(15L);
        answer.setSurveySessionId(16L);
        AnswerDao.saveAnswer(answer);
    }
}



























