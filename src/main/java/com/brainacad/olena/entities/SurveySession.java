package com.brainacad.olena.entities;

import java.sql.*;

public class SurveySession {
    private Long id;
    private Timestamp dateTime;
    private Long interviewerId;
    private Long questionnaireId;

    public SurveySession(){};

    public SurveySession(Long id, Timestamp dateTime, Long interviewerId, Long questionnaireId){
        this.setId(id);
        this.setDateTime(dateTime);
        this.setInterviewerId(interviewerId);
        this.setQuestionnaireId(questionnaireId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDateTime(){return dateTime;}

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public Long getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(Long interviewerId) {
        this.interviewerId = interviewerId;
    }

    public Long getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Long questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    @Override
    public String toString() {
        return "Survey session info {" + "Survey session Id" + id +
                "Survey Timestamp" + dateTime +
                "Interviewer ID" + interviewerId +
                "Questionnaire ID" + questionnaireId + "}";
    }
}


