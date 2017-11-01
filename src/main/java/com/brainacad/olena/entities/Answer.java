package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Answer {
    private Long id;
    private String answerText;
    private Long questionId;
    private Long scopeId;
    private Long surveySessionId;

    public Answer(){};

    public Answer(Long id, String answerText, Long questionId, Long scopeId, Long surveySessionId){
        this.setId(id);
        this.setAnswerText(answerText);
        this.setQuestionId(questionId);
        this.setScopeId(scopeId);
        this.setSurveySessionId(surveySessionId);
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answeText) {
        this.answerText = answerText;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getScopeId() {
        return scopeId;
    }

    public void setScopeId(Long scope_id) {
        this.scopeId = scopeId;
    }

    public Long getSurveySessionId() {
        return surveySessionId;
    }

    public void setSurveySessionId(Long surveySessionId) {
        this.surveySessionId= surveySessionId;
    }

    @Override
    public String toString() {
        return "Answer {" + "answer text" + answerText +
                "Question ID" + questionId +
                "Scope Id"+ scopeId +
                "Survey Session ID" + surveySessionId + "}";


    }
}

