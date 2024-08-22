package com.mycompany.principioliskov;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
/**
public class Configuracion {

    Vector<RecursoPersistente> conf = new Vector<RecursoPersistente>();

    public void cargarConfiguracion() {
        conf.add(new ConfiguracionSistema());
        conf.add(new ConfiguracionUsuario());
        conf.add(new ConfiguracionHoraria());
        for (Iterator<RecursoPersistente> i = conf.iterator(); i.hasNext();) {
            i.next().load();
        }

    }

    public void salvarConfiguracion() {
        for (Iterator<RecursoPersistente> i = conf.iterator(); i.hasNext();) {
            i.next().save();
        }

    }
}
*/
public class Configuracion {
    List<RecursoPersistente> recursos;

    public Configuracion(List<RecursoPersistente> recursos) {
        this.recursos = recursos;
    }

    public void cargarConfiguracion() {
        for (RecursoPersistente recurso : recursos) {
            recurso.load();
        }
    }

    public void salvarConfiguracion() {
        for (RecursoPersistente recurso : recursos) {
            recurso.save();
        }
    }
}