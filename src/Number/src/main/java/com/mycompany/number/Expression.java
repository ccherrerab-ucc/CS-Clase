/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.number;

import java.util.Map;

/**
 *
 * @author User
 */
interface Expression {
    int interpret(Map<String, Expression> variables);
}
