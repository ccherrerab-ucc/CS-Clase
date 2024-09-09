/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstraction;

/**
 *
 * @author User
 */
abstract class Abstraction {
    protected Implementation implementation;

    protected Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public abstract void operation();
}
