/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composite;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
class Composite implements Component {
    private final List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Componente compuesto:");
        for (Component child : children) {
            child.operation(); // Delegación a los hijos
        }
    }
}
