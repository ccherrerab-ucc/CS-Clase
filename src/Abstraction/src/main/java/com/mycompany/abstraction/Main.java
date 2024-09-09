/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Implementation implementationA = new ConcreteImplementationA();
        Abstraction abstraction = new RefinedAbstraction(implementationA);
        abstraction.operation(); // Operación en ConcreteImplementationA
        
        Implementation implementationB = new ConcreteImplementationB();
        abstraction = new RefinedAbstraction(implementationB);
        abstraction.operation(); // Operación en ConcreteImplementationB
    }
}