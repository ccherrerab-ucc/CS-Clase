/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sugardecorator;

/**
 *
 * @author User
 */
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", con azúcar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}