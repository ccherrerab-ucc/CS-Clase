/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CN_DB.empresaUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Paula
 */
public class Conexion {
  

    protected static Connection conexion = null;

    // URL de conexión a la base de datos

    private static final String URL = "jdbc:mysql://localhost:3306/csuc_grh";
    private static final String USER = "root";
    private static final String PASSWORD = "";

 

    private static void conectar() {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/csuc_grh", "root", "");
        } catch (SQLException e) {
          System.out.println("Error de MySQL: " + e.getMessage()); 
        } /* catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
          System.out.println("Error inesperado: " + e.getMessage());
        }*/
    }

    private Conexion() {
        
    }

    public static Connection getInstance() {
        if (conexion == null) {
            conectar();
        }
        return conexion;
    }
    
}
