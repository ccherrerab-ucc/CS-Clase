package com.mycompany.inversiondedependencias;

import java.util.Date;

public class InversionDeDependencias {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Factura
        Factura factura = new Factura(10);
        
        // Asignamos valores a los atributos de la factura
        factura.codigo = "F001";
        factura.fechaEmision = new Date();
        factura.importeFactura = 1000;
        
        // Calculamos el total de la factura
        factura.calcularTotal();
        
        // Imprimimos los resultados
        System.out.println("Código: " + factura.codigo);
        System.out.println("Fecha de emisión: " + factura.fechaEmision);
        System.out.println("Importe de la factura: " + factura.importeFactura);
        System.out.println("Importe de la deducción: " + factura.importeDeduccion);
        System.out.println("Importe del IVA: " + factura.importeIVA);
        System.out.println("Importe total: " + factura.importeTotal);
    }
}
