/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovildaoimpl;

import java.sql.Connection;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        try (Connection conexion = ConexionBD.obtenerConexion()) {
            AutomovilDAO automovilDAO = new AutomovilDAOImpl(conexion);

            // Crear un nuevo automóvil
            Automovil automovil = new Automovil(0, "Toyota", "Corolla", 2020, "Rojo", "ABC123", "CHASIS123", "Gasolina", "Manual", 30000, 12000.50, null);
            automovilDAO.crearAutomovil(automovil);

            // Obtener un automóvil por ID
            Automovil automovilRecuperado = automovilDAO.obtenerAutomovilPorId(1);
            System.out.println(automovilRecuperado);

            // Actualizar un automóvil
            automovilRecuperado.setColor("Azul");
            automovilDAO.actualizarAutomovil(automovilRecuperado);

            // Eliminar un automóvil
            automovilDAO.eliminarAutomovil(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

