/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concretemediator;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(null);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(null);
        ConcreteMediator mediator = new ConcreteMediator(colleagueA, colleagueB);
        colleagueA = new ConcreteColleagueA(mediator);
        colleagueB = new ConcreteColleagueB(mediator);

        colleagueA.send("Hola desde A");
        colleagueB.send("Hola desde B");
    }
}