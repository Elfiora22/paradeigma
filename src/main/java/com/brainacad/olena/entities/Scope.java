package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Scope {
    private Long id;
    private String answerType;
    private String text;
    private Long questionId;

    public Scope (){};

    public  Scope(Long id, String answerType, String text, Long questionIdd){
        this.setId(id);
        this.setAnswerType(answerType);
        this.setText(text);
        this.setQuestionId(questionId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long question_id) {
        this.questionId = questionId;
    }

    @Override
    public String toString() {
        return "Scope {" + "Scope Id" + id +
                "Answer type" + answerType +
                "Scope answer text" + text +
                "Question ID" + questionId + "}";
    }
}
