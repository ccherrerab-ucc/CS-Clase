/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskovprinciple;

/**
 *
 * @author XPG
 */
public class HourlyConfiguration implements PersistentResource {
    @Override
    public void load() {
        System.out.println("Configuración horaria cargada");
    }

    @Override
    public void save() {
        System.out.println("ERROR, la hora no se puede almacenar, es solo de lectura");
    }
}
