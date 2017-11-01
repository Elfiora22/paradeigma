package com.brainacad.olena.entities;

/**
 * Created by elenafostachuk on 10/18/17.
 */
public class Interviewer {
    private Long id;
    private String phoneNumber;
    private String login;
    private String password;

    public Interviewer(){};

    public Interviewer(Long id, String phoneNumber, String login, String password){
        this.setId(id);
        this.setPhoneNumber(phoneNumber);
        this.setLogin(login);
        this.setPassword(password);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone_number() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone_number) {
        this.phoneNumber = phone_number;
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
                "Interviewer phone number" + phoneNumber +
                "Interviewer login" + login +
                "Interviewer password" + password + "}";
    }
}
