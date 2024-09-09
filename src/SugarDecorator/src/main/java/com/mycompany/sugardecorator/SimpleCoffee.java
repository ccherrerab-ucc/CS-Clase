/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sugardecorator;

/**
 *
 * @author User
 */
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Café simple";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
