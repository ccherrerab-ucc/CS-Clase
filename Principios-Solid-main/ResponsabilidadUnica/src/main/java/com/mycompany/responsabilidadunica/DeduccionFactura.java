/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsabilidadunica;

public class DeduccionFactura {
    private int porcentajeDeduccion;

    public DeduccionFactura(int porcentajeDeduccion) {
        this.porcentajeDeduccion = porcentajeDeduccion;
    }

    public float calcularImporteDeduccion(float importeBase) {
        return (importeBase * porcentajeDeduccion) / 100;
    }
}
