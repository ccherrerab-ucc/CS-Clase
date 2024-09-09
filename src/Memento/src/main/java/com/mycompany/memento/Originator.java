/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memento;

/**
 *
 * @author User
 */
class Originator {
    private String state;

    public void setState(String state) {
        System.out.println("Estado actual del Originator: " + state);
        this.state = state;
    }

    public Memento saveStateToMemento() {
        System.out.println("Guardando estado en Memento: " + state);
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Restaurando estado desde Memento: " + state);
    }
}
