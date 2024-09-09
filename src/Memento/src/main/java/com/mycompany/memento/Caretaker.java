/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memento;

import java.util.Stack;

/**
 *
 * @author User
 */
class Caretaker {
    private final Stack<Memento> mementoStack = new Stack<>();

    public void addMemento(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento getMemento() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null; // Opcional: manejar el caso donde no hay más mementos
    }
}