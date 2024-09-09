/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

/**
 *
 * @author User
 */
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Solicitud del RealSubject");
    }
}
