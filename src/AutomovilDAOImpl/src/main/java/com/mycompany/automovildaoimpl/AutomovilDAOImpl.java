/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovildaoimpl;

/**
 *
 * @author User
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutomovilDAOImpl implements AutomovilDAO {
    private Connection conexion;

    public AutomovilDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void crearAutomovil(Automovil automovil) throws Exception {
        String query = "INSERT INTO automovil (marca, modelo, anio, color, numero_placa, numero_chasis, tipo_combustible, transmision, kilometraje, precio) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, automovil.getMarca());
            stmt.setString(2, automovil.getModelo());
            stmt.setInt(3, automovil.getAnio());
            stmt.setString(4, automovil.getColor());
            stmt.setString(5, automovil.getNumeroPlaca());
            stmt.setString(6, automovil.getNumeroChasis());
            stmt.setString(7, automovil.getTipoCombustible());
            stmt.setString(8, automovil.getTransmision());
            stmt.setInt(9, automovil.getKilometraje());
            stmt.setDouble(10, automovil.getPrecio());
            stmt.executeUpdate();
        }
    }

    @Override
    public Automovil obtenerAutomovilPorId(int id) throws Exception {
        String query = "SELECT * FROM automovil WHERE id = ?";
        Automovil automovil = null;
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                automovil = new Automovil();
                automovil.setId(rs.getInt("id"));
                automovil.setMarca(rs.getString("marca"));
                automovil.setModelo(rs.getString("modelo"));
                automovil.setAnio(rs.getInt("anio"));
                automovil.setColor(rs.getString("color"));
                automovil.setNumeroPlaca(rs.getString("numero_placa"));
                automovil.setNumeroChasis(rs.getString("numero_chasis"));
                automovil.setTipoCombustible(rs.getString("tipo_combustible"));
                automovil.setTransmision(rs.getString("transmision"));
                automovil.setKilometraje(rs.getInt("kilometraje"));
                automovil.setPrecio(rs.getDouble("precio"));
                
            }
        }
        return automovil;
    }

    @Override
    public List<Automovil> obtenerTodosLosAutomoviles() throws Exception {
        String query = "SELECT * FROM automovil";
        List<Automovil> automoviles = new ArrayList<>();
        try (Statement stmt = conexion.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Automovil automovil = new Automovil();
                automovil.setId(rs.getInt("id"));
                automovil.setMarca(rs.getString("marca"));
                automovil.setModelo(rs.getString("modelo"));
                automovil.setAnio(rs.getInt("anio"));
                automovil.setColor(rs.getString("color"));
                automovil.setNumeroPlaca(rs.getString("numero_placa"));
                automovil.setNumeroChasis(rs.getString("numero_chasis"));
                automovil.setTipoCombustible(rs.getString("tipo_combustible"));
                automovil.setTransmision(rs.getString("transmision"));
                automovil.setKilometraje(rs.getInt("kilometraje"));
                automovil.setPrecio(rs.getDouble("precio"));
               
                automoviles.add(automovil);
            }
        }
        return automoviles;
    }

    @Override
    public void actualizarAutomovil(Automovil automovil) throws Exception {
        String query = "UPDATE automovil SET marca = ?, modelo = ?, anio = ?, color = ?, numero_placa = ?, numero_chasis = ?, tipo_combustible = ?, transmision = ?, kilometraje = ?, precio = ? WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, automovil.getMarca());
            stmt.setString(2, automovil.getModelo());
            stmt.setInt(3, automovil.getAnio());
            stmt.setString(4, automovil.getColor());
            stmt.setString(5, automovil.getNumeroPlaca());
            stmt.setString(6, automovil.getNumeroChasis());
            stmt.setString(7, automovil.getTipoCombustible());
            stmt.setString(8, automovil.getTransmision());
            stmt.setInt(9, automovil.getKilometraje());
            stmt.setDouble(10, automovil.getPrecio());
            stmt.setInt(11, automovil.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void eliminarAutomovil(int id) throws Exception {
        String query = "DELETE FROM automovil WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
