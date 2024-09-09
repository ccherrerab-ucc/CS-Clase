/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxy;

/**
 *
 * @author User
 */
class Proxy implements Subject {
    private final RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void request() {
        // Control adicional antes de la solicitud real
        System.out.println("Proxy: Controlando acceso");
        realSubject.request();
    }
}
