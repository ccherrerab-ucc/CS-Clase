/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototyperegistry;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();
        
        // Registro de prototipos
        ConcretePrototype prototype1 = new ConcretePrototype("Prototipo 1");
        registry.addPrototype("proto1", prototype1);
        
        // Obtención de clones
        Prototype clonedPrototype = registry.getPrototype("proto1");
        ((ConcretePrototype) clonedPrototype).showName(); // Prototipo: Prototipo 1
    }
}
