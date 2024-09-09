/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handler;

/**
 *
 * @author User
 */
class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handler B procesó la solicitud.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
