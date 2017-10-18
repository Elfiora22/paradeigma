package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Answer {
    private int id;
    private String answer_text;
    private int question_id;
    private int scope_id;
    private int survey_session_id;

    public Answer(int id, String answer_text, int question_id, int scope_id, int survey_session_id){
        this.setId(id);
        this.setAnswer_text(answer_text);
        this.setQuestion_id(question_id);
        this.setScope_id(scope_id);
        this.setSurvey_session_id(survey_session_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer_text() {
        return answer_text;
    }

    public void setAnswer_text(String answer_text) {
        this.answer_text = answer_text;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getScope_id() {
        return scope_id;
    }

    public void setScope_id(int scope_id) {
        this.scope_id = scope_id;
    }

    public int getSurvey_session_id() {
        return survey_session_id;
    }

    public void setSurvey_session_id(int survey_session_id) {
        this.survey_session_id = survey_session_id;
    }

    @Override
    public String toString() {
        return "Answer {" + "answer text" + answer_text +
                "Question ID" + question_id +
                "Scope Id"+ scope_id +
                "Survey Session ID" + survey_session_id + "}";


    }
}

