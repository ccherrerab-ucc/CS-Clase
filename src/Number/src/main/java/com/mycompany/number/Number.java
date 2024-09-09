/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number;

import java.util.Map;

/**
 *
 * @author User
 */
class Number implements Expression {
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}
 
