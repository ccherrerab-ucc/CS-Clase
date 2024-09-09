/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.context;

/**
 *
 * @author User
 */
class OffState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("El dispositivo está apagado.");
        context.setState(this);
    }

    public String toString() {
        return "Estado Apagado";
    }
}
