package com.brainacad.olena.dao;

import com.brainacad.olena.entities.Answer;

import java.sql.*;

import static com.brainacad.olena.dao.DbUtils.getConnection;

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
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return answer;
    }

    public void save(Answer answer){
        Connection connection = getConnection();
        try(PreparedStatement statement =connection.prepareStatement("SAVEPOINT answer")) {
            ResultSet resultSet2 = statement.executeQuery();
            if (resultSet2.next()){
                resultSet2.refreshRow();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void  update(Answer answer) {
        Connection connection = getConnection();
        try(PreparedStatement statement = connection.prepareStatement("INSERT INTO answer VALUES(?,?,?,?)")){
            ResultSet resultSet3=statement.executeQuery();
            if (resultSet3.next()){
                resultSet3.updateRow();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(Answer answer){
        Connection connection =getConnection();
        try(PreparedStatement statement =connection.prepareStatement("DELETE * FROM answer WHERE id =?")){
            ResultSet resultSet4= statement.executeQuery();
            if (resultSet4.next()){
                resultSet4.deleteRow();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }


}
