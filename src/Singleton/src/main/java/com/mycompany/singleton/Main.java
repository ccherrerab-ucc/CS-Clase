/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Obtención de la única instancia de Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage(); // ¡Hola desde Singleton!
    }
}
