/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author User
 */
class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void operation() {
        implementation.operationImpl(); // Delegación a la implementación
    }
}
