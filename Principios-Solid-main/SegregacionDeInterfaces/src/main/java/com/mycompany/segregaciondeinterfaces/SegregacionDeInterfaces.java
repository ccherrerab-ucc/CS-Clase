package com.mycompany.segregaciondeinterfaces;

public class SegregacionDeInterfaces {

    public static void main(String[] args) {
        
        // Creamos un objeto de la clase Contacto
        Contacto contacto = new Contacto();
        contacto.setName("Juan");
        contacto.setAddress("Calle 123");
        contacto.setEmailAddress("Juanito123@gmail.com");
        contacto.setTelephone("1234567890");
        
        // Enviamos un email utilizando la clase EmailSender
        EmailSender.sendEmail(contacto, "Hello from consola");
        
        // Enviamos un SMS utilizando la clase SMSSender
        SMSSender.sendSMS(contacto, "Hello from consola");
        
    }
}
