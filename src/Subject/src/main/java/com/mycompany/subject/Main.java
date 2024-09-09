/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subject;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver("Observador 1");
        Observer observer2 = new ConcreteObserver("Observador 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("Estado A");
        subject.setState("Estado B");

        subject.removeObserver(observer1);
        subject.setState("Estado C");
    }
}
