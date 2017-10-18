package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Scope {
    private int id;
    private String answer_type;
    private String text;
    private int question_id;

    public  Scope(int id, String answer_type, String text, int question_id){
        this.setId(id);
        this.setAnswer_type(answer_type);
        this.setText(text);
        this.setQuestion_id(question_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer_type() {
        return answer_type;
    }

    public void setAnswer_type(String answer_type) {
        this.answer_type = answer_type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    @Override
    public String toString() {
        return "Scope {" + "Scope Id" + id +
                "Answer type" + answer_type +
                "Scope answer text" + text +
                "Question ID" + question_id + "}";
    }
}
