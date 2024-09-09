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
class Add implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public Add(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftExpression.interpret(variables) + rightExpression.interpret(variables);
    }
}