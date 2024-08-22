package com.mycompany.segregaciondeinterfaces;
public class Contacto implements EmailContacto, TelContacto {

    String name, address, emailAddress, telephone;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void setEmailAddress(String ea) {
        emailAddress = ea;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setTelephone(String t) {
        telephone = t;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }
}
