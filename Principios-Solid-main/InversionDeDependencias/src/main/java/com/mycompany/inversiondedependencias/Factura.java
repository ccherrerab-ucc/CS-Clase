package com.mycompany.inversiondedependencias;

import java.util.Date;

public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public Impuesto impuesto;
    
    // Constructor que recibe el porcentaje de deducción
    public Factura(int porcentajeDeduccion) {
        this.impuesto = new Deduccion();
    }

    // Método que calcula el total de la factura
    public void calcularTotal() {
        // Calculamos la deducción
        importeDeduccion = impuesto.calcularImpuesto(importeFactura);
        impuesto = new Iva();
        // Calculamos el IVA
        importeIVA = impuesto.calcularImpuesto(importeFactura);
        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
