package com.mycompany.responsabilidadunica;

import java.util.Date;

public class ResponsabilidadUnica {

    public static void main(String[] args) {
        // Creamos una factura con importe de 1000 y una deducción del 10%
        Factura factura1 = new Factura("001", new Date(), 1000, 10);

        // Mostramos el importe total de la factura
        System.out.println("Importe total de la factura 1: " + factura1.getImporteTotal());

        // Creamos otra factura con importe de 500 y una deducción del 5%
        Factura factura2 = new Factura("002", new Date(), 500, 5);

        // Mostramos el importe total de la factura
        System.out.println("Importe total de la factura 2: " + factura2.getImporteTotal());
    }
}
