package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Question {
    private int id;
    private String question_text;
    private int questionnaire_id;

    public Question(int id, String question_text, int questionnaire_id){
        this.setId(id);
        this.setQuestion_text(question_text);
        this.setQuestionnaire_id(questionnaire_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    public int getQuestionnaire_id() {
        return questionnaire_id;
    }

    public void setQuestionnaire_id(int questionnaire_id) {
        this.questionnaire_id = questionnaire_id;
    }

    @Override
    public String toString() {
        return "Question {" + "Question ID" + id +
                "Question text" + question_text +
                "Questionnaire ID" + questionnaire_id + "}";

    }
}
