/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creator;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Creator<Product> creator = new ConcreteCreator();
        
        Product productA = creator.createProduct(ConcreteProductA.class);
        productA.use(); // Usando ConcreteProductA
        
        Product productB = creator.createProduct(ConcreteProductB.class);
        productB.use(); // Usando ConcreteProductB
    }
}