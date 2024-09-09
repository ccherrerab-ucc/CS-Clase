/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handler;

/**
 *
 * @author User
 */
class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("Handler A procesó la solicitud.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}