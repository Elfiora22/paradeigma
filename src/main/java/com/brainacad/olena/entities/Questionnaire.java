package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Questionnaire {
    private int id;
    private String title;

    public Questionnaire(int id, String title){
        this.setId(id);
        this.setTitle(title);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Questionnaire" + id +
                "Questionnaire title" + title + "}";
    }
}
