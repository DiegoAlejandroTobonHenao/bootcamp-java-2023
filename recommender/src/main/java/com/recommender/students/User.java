package com.recommender.students;

public class User {
    private String email;
    private String document;
    private String password;

    public User(String email, String document, String password) {
        this.email = email;
        this.document = document;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


