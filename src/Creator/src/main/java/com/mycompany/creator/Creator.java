/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creator;

/**
 *
 * @author User
 */
abstract class Creator<T extends Product> {
    // Método factory que usa reflección
    public T createProduct(Class<T> productClass) {
        try {
            return productClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("No se pudo crear la instancia del producto.");
        }
    }
}
