/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author User
 */

 
public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new MacOSFactory();
        Application app = new Application(factory);
        app.render();
    }
}

