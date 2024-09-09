/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.context;

/**
 *
 * @author User
 */
class OnState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("El dispositivo está encendido.");
        context.setState(this);
    }

    public String toString() {
        return "Estado Encendido";
    }
}