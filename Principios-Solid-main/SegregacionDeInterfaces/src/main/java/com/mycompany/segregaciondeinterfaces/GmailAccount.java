package com.mycompany.segregaciondeinterfaces;

public class GmailAccount implements EmailContacto {

    String name, emailAddress;

    public GmailAccount(String n, String ea) {
        name = n;
        emailAddress = ea;
    }

    @Override
    public void setEmailAddress(String ea) {
        emailAddress = ea;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
}
