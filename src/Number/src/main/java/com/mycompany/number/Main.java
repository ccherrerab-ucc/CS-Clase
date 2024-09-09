/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Expression> variables = new HashMap<>();
        variables.put("x", new Number(5));
        variables.put("y", new Number(10));

        Expression expression = new Add(new Variable("x"), new Variable("y"));
        System.out.println("Resultado: " + expression.interpret(variables)); // Resultado: 15
    }
}
