package com.mycompany.principiossolid;

import java.util.Enumeration;
import java.util.Vector;

public class Figuras {

    Vector<Figura> figuras = new Vector<Figura>();

    public void addFigura(Figura f) {
        figuras.add(f);
    }

    public void dibujarFiguras() {
        Enumeration<Figura> figurs = figuras.elements();
        while (figurs.hasMoreElements()) {
            Figura f = figurs.nextElement();
            f.dibujar();
        }
    }
}
