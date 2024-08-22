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
public class UserConfiguration implements PersistentResource, Notificable {
    @Override
    public void load() {
        System.out.println("Configuración usuario cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuración usuario almacenada");
    }
    
    @Override
    public void notificar() {
        System.out.println("Notificación: Configuración de usuario ha sido actualizada.");
=======
public class UserConfiguration implements PersistentResource {
    @Override
    public void load() {
        System.out.println("Configuración usuario cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuración usuario almacenada");
>>>>>>> origin/master
    }
}
