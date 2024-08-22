/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsabilidadunica;

public class IVAFactura {
    private final float TASA_IVA = 0.16f;

    public float calcularIVA(float importeBase) {
        return importeBase * TASA_IVA;
    }
}