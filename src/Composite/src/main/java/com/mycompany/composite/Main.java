/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Composite root = new Composite();
        Leaf leaf1 = new Leaf("Hoja 1");
        Leaf leaf2 = new Leaf("Hoja 2");

        root.add(leaf1);
        root.add(leaf2);

        Composite subComposite = new Composite();
        Leaf leaf3 = new Leaf("Hoja 3");
        subComposite.add(leaf3);

        root.add(subComposite);
        root.operation();
        // Salida:
        // Componente compuesto:
        // Hoja: Hoja 1
        // Hoja: Hoja 2
        // Componente compuesto:
        // Hoja: Hoja 3
    }
}
