/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author User
 */
abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPart1();
    public abstract void buildPart2();

    public Product getResult() {
        return product;
    }
}
