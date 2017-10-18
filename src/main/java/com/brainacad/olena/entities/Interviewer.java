package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Interviewer {
    private int id;
    private String phone_number;
    private String login;
    private String password;

    public Interviewer(int id, String phone_number, String login, String password){
        this.setId(id);
        this.setPhone_number(phone_number);
        this.setLogin(login);
        this.setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Interviewer {" + "Interviewer ID"+ id +
                "Interviewer phone number" + phone_number +
                "Interviewer login" + login +
                "Interviewer password" + password + "}";
    }
}
