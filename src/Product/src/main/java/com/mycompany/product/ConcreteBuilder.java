/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author User
 */
class ConcreteBuilder extends Builder {
    public void buildPart1() {
        product.setPart1("Part 1 Built");
    }

    public void buildPart2() {
        product.setPart2("Part 2 Built");
    }
}
