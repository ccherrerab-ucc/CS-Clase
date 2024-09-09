/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handler;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNextHandler(handlerB);

        handlerA.handleRequest("A"); // Handler A procesó la solicitud.
        handlerA.handleRequest("B"); // Handler B procesó la solicitud.
        handlerA.handleRequest("C"); // No se procesó la solicitud.
    }
}
