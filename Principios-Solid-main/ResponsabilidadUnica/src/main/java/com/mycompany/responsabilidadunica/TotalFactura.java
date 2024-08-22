/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsabilidadunica;

public class TotalFactura {

    private float importeBase;
    private float importeDeduccion;
    private float importeIVA;
    private float importeTotal;

    public TotalFactura(float importeFactura, int porcentajeDeduccion) {
        ImporteBaseFactura importeBaseFactura = new ImporteBaseFactura(importeFactura);
        DeduccionFactura deduccionFactura = new DeduccionFactura(porcentajeDeduccion);
        IVAFactura ivaFactura = new IVAFactura();

        this.importeBase = importeBaseFactura.calcularImporteBase();
        this.importeDeduccion = deduccionFactura.calcularImporteDeduccion(importeBase);
        this.importeIVA = ivaFactura.calcularIVA(importeBase);
        this.importeTotal = (importeBase - importeDeduccion) + importeIVA;
    }

    public float getImporteTotal() {
        return importeTotal;
    }
}
