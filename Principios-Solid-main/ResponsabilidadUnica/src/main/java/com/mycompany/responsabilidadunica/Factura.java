package com.mycompany.responsabilidadunica;

import java.util.Date;

public class Factura {
    private String codigo;
    private Date fechaEmision;
    private TotalFactura totalFactura;

    public Factura(String codigo, Date fechaEmision, float importeFactura, int porcentajeDeduccion) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.totalFactura = new TotalFactura(importeFactura, porcentajeDeduccion);
    }

    public float getImporteTotal() {
        return totalFactura.getImporteTotal();
    }
}