/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskovprinciple;

import java.util.Vector;
/**
 *
 * @author XPG
 */
public class Configuration {
    
        private Vector<PersistentResource> conf = new Vector<PersistentResource>();

    public void registerConfiguration(PersistentResource configuration) {
        conf.add(configuration);
    }

    public void chargeConfiguration() {
        for (PersistentResource resource : conf) {
            resource.load();
        }
    }

    public void saveConfiguration() {
        for (PersistentResource resource : conf) {
            resource.save();
        }
    }
<<<<<<< HEAD
    
    public void notificarCambios() {
        for (PersistentResource resource : conf) {
            if (resource instanceof Notificable) {
                ((Notificable) resource).notificar();
            }
        }
    }
}
=======
}
>>>>>>> origin/master
