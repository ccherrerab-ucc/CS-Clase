/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prototyperegistry;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
class PrototypeRegistry {
    private Map<String, Prototype> registry = new HashMap<>();

    public void addPrototype(String key, Prototype prototype) {
        registry.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        return registry.get(key).clone(); // Clonación del prototipo
    }
}
