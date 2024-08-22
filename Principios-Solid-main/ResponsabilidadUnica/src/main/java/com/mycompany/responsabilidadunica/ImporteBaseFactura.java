/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsabilidadunica;

public class ImporteBaseFactura {
    private float importeFactura;

    public ImporteBaseFactura(float importeFactura) {
        this.importeFactura = importeFactura;
    }

    public float calcularImporteBase() {
        return importeFactura;
    }
}