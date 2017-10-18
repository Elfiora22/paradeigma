package com.brainacad.olena.entities;

import java.sql.Timestamp;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Survey_session {
    private int id;
    private Timestamp date_time;
    private int interviewer_id;
    private int questionnaire_id;

    public Survey_session(int id, Timestamp date_time, int interviewer_id, int questionnaire_id){
        this.setId(id);
        this.setDate_time(date_time);
        this.setInterviewer_id(interviewer_id);
        this.setQuestionnaire_id(questionnaire_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDate_time() {
        return date_time;
    }

    public void setDate_time(Timestamp date_time) {
        this.date_time = date_time;
    }

    public int getInterviewer_id() {
        return interviewer_id;
    }

    public void setInterviewer_id(int interviewer_id) {
        this.interviewer_id = interviewer_id;
    }

    public int getQuestionnaire_id() {
        return questionnaire_id;
    }

    public void setQuestionnaire_id(int questionnaire_id) {
        this.questionnaire_id = questionnaire_id;
    }

    @Override
    public String toString() {
        return "Survey session info {" + "Survey session Id" + id +
                "Survey Timestamp" + date_time +
                "Interviewer ID" + interviewer_id +
                "Questionnaire ID" + questionnaire_id + "}";
    }
}
