/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memento;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Estado 1");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("Estado 2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("Estado 3");

        // Deshacer al estado anterior
        originator.getStateFromMemento(caretaker.getMemento());
        originator.getStateFromMemento(caretaker.getMemento());
    }
}
