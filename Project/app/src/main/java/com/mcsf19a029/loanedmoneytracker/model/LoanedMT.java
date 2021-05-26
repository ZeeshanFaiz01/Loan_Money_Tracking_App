package com.mcsf19a029.loanedmoneytracker.model;

public class LoanedMT {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String pass;

    public LoanedMT(String name, String email, String phone,String pass) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
