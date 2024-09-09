/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton;

/**
 *
 * @author User
 */
import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;

    // Uso de volatile para asegurar visibilidad en hilos
    private static volatile Singleton instance;

    // Constructor privado
    private Singleton() {
        // Protección contra reflexiones
        if (instance != null) {
            throw new RuntimeException("Use getInstance() para crear la instancia.");
        }
    }

    // Método para obtener la instancia (doble verificación de bloqueo)
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Implementación para evitar que la serialización rompa el Singleton
    protected Object readResolve() {
        return getInstance();
    }

    public void showMessage() {
        System.out.println("Singleton avanzado con protección de concurrencia.");
    }
}

