/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multiplystrategy;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new AddStrategy());
        System.out.println("Suma: " + context.executeStrategy(5, 3));

        context.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplicación: " + context.executeStrategy(5, 3));
    }
}
