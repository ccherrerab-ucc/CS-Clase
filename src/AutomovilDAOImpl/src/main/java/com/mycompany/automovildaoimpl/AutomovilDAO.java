/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.automovildaoimpl;

/**
 *
 * @author User
 */
import java.util.List;

public interface AutomovilDAO {
    void crearAutomovil(Automovil automovil) throws Exception;
    Automovil obtenerAutomovilPorId(int id) throws Exception;
    List<Automovil> obtenerTodosLosAutomoviles() throws Exception;
    void actualizarAutomovil(Automovil automovil) throws Exception;
    void eliminarAutomovil(int id) throws Exception;
}
