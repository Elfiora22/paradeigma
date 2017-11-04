package com.brainacad.olena.dao;

import com.brainacad.olena.entities.Answer;

import java.sql.*;

import static com.brainacad.olena.dao.DbUtils.*;

public class AnswerDao {

    public  static Answer getById(Long id) throws SQLException {
        Answer answer = new Answer();
        Connection connection = getConnection();
        try(
            PreparedStatement statement =connection.prepareStatement("SELECT*FROM answer WHERE id=?")) {
            statement.setLong(1, id);
            ResultSet resultset1= statement.executeQuery();
            if (resultset1.next()){
                answer.setId(resultset1.getLong("id"));
                answer.setAnswerText(resultset1.getString("answer_text"));
                answer.setQuestionId(resultset1.getLong("question"));
                answer.setScopeId(resultset1.getLong("scope_id"));
                answer.setSurveySessionId(resultset1.getLong("survey_session_id"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return answer;
    }

    public static void  saveAnswer(Answer answer)throws SQLException {
        Connection connection = getConnection();
        try (PreparedStatement statement = connection.prepareStatement("INSERT  INTO answer VALUES(NULL,?,?,?,?,?)")) {
            statement.setLong(1, Long.parseLong("id"));
            statement.setString(2, "answer_text");
            statement.setLong(3, Long.parseLong("question_id"));
            statement.setLong(4, Long.parseLong("scope_id"));
            statement.setLong(5, Long.parseLong("survey_session_id"));
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void  update(Answer answer)throws SQLException {
        Connection connection = getConnection();
        try(PreparedStatement statement =
                        connection.prepareStatement("UPDATE answer SET  answer_text=?, question_id=?, scope_id=?,survey_session_id=?WHERE id=?"))  {

            statement.setLong(1, Long.parseLong("id"));
            statement.setString(2,"answer_text");
            statement.setLong(3, Long.parseLong("question_id"));
            statement.setLong(4, Long.parseLong("scope_id"));
            statement.setLong(5, Long.parseLong("survey_session_id"));
            statement.executeUpdate();

        }catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void delete(Answer answer)throws SQLException {
        Connection connection = getConnection();
        try(PreparedStatement statement =connection.prepareStatement(String.format("DELETE *answer_text, question_id, scope_id, survey_session_id FROM  answer WHERE id=?"))){
            statement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
