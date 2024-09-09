/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flyweightfactory;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("State1");
        Flyweight flyweight2 = factory.getFlyweight("State2");
        Flyweight flyweight3 = factory.getFlyweight("State1");

        flyweight1.operation("Operation1");
        flyweight2.operation("Operation2");
        flyweight3.operation("Operation3"); // Usa el mismo objeto que flyweight1
    }
}
