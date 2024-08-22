/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskovprinciple;

/**
 *
 * @author XPG
 */
public class Main {
    
        public static void main(String[] args) {
        Configuration configuration = new Configuration();

        // Registrando las configuraciones
        configuration.registerConfiguration(new SystemConfiguration());
        configuration.registerConfiguration(new UserConfiguration());
        configuration.registerConfiguration(new HourlyConfiguration());

        // Cargar y guardar las configuraciones
        configuration.chargeConfiguration();
        configuration.saveConfiguration();
<<<<<<< HEAD
        configuration.notificarCambios();
=======
>>>>>>> origin/master
    }
}
