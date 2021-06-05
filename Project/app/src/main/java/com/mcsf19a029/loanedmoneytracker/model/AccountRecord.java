package com.mcsf19a029.loanedmoneytracker.model;

public class AccountRecord {
    private int id;
    private String Name;
    private String Contact;

    public AccountRecord(String name, String contact) {
        Name = name;
        Contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
