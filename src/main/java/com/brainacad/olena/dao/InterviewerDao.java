package com.brainacad.olena.dao;

import com.brainacad.olena.entities.Interviewer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.brainacad.olena.dao.DbUtils.getConnection;

public class InterviewerDao {
    public static Interviewer getById(Long id) {
        Interviewer interviewer = new Interviewer();
        Connection connection = getConnection();
        try (PreparedStatement statement = connection.prepareStatement("SELECT*FROM interviewer WHERE id=?")) {
            statement.setLong(1, id);
            ResultSet resultset1 = statement.executeQuery();
            if (resultset1.next()) {
                interviewer.setId(resultset1.getLong("id"));
                interviewer.setPhoneNumber(resultset1.getString("phone_number"));
                interviewer.setLogin(resultset1.getString("login"));
                interviewer.setPassword(resultset1.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return interviewer;
    }

    public void save(Interviewer interviewer) {
        Connection connection = getConnection();
        try (PreparedStatement statement = connection.prepareStatement("SAVEPOINT interviewer")) {
            ResultSet resultSet2 = statement.executeQuery();
            if (resultSet2.next()) {
                resultSet2.refreshRow();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update(Interviewer interviewer) {
        Connection connection = getConnection();
        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO interviewer VALUES(?,?,?,?)")) {
            ResultSet resultSet3 = statement.executeQuery();
            if (resultSet3.next()) {
                resultSet3.updateRow();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Interviewer interviewer){
        Connection connection =getConnection();
        try(PreparedStatement statement =connection.prepareStatement("DELETE * FROM interviewer WHERE id =?")){
            ResultSet resultSet4= statement.executeQuery();
            if (resultSet4.next()){
                resultSet4.deleteRow();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}


