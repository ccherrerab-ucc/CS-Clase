/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number;

import java.util.Map;

/**
 *
 * @author User
 */
class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return variables.get(name).interpret(variables);
    }
}
