/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskovprinciple;

/**
 *
 * @author XPG
 */
 

<<<<<<< HEAD
public class SystemConfiguration implements PersistentResource, Notificable {
    @Override
    public void load() {
        System.out.println("Configuración del sistema cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuración del sistema almacenada");
    }
    
        @Override
    public void notificar() {
        System.out.println("Notificación: Configuración sistema ha sido actualizada.");
=======
public class SystemConfiguration implements PersistentResource {
    @Override
    public void load() {
        System.out.println("Configuración sistema cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuración sistema almacenada");
>>>>>>> origin/master
    }
}

    