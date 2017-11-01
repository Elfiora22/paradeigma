package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Questionnaire {
    private Long id;
    private String title;

    public Questionnaire (){};

    public Questionnaire(Long id, String title){
        this.setId(id);
        this.setTitle(title);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
