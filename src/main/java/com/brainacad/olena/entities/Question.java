package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Question {
    private Long id;
    private String questionText;
    private Long questionnaireId;

    public Question (){};

    public Question(Long id, String questionText, Long questionnaireId){
        this.setId(id);
        this.setQuestionText(questionText);
        this.setQuestionnaireId(questionnaireId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String question_text) {
        this.questionText = questionText;
    }

    public Long getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Long questionnaire_id) {
        this.questionnaireId = questionnaireId;
    }

    @Override
    public String toString() {
        return "Question {" + "Question ID" + id +
                "Question text" + questionText +
                "Questionnaire ID" + questionnaireId + "}";

    }
}
