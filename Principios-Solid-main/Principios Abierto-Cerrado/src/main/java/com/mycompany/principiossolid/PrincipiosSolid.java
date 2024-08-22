package com.mycompany.principiossolid;

public class PrincipiosSolid{

    public static void main(String[] args) {
        Figuras figuras = new Figuras();

        // Crear una instancia de Circulo y agregarlo a figuras
        Circulo circulo = new Circulo();
        figuras.addFigura(circulo);

        // Crear una instancia de Cuadrado y agregarlo a figuras
        Cuadrado cuadrado = new Cuadrado();
        figuras.addFigura(cuadrado);

        // Dibujar todas las figuras
        figuras.dibujarFiguras();
    }
}
