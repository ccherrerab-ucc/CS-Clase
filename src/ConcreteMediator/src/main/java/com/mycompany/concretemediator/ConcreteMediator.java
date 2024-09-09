/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concretemediator;

/**
 *
 * @author User
 */
class ConcreteMediator implements Mediator {
    private final ConcreteColleagueA colleagueA;
    private final ConcreteColleagueB colleagueB;

    public ConcreteMediator(ConcreteColleagueA colleagueA, ConcreteColleagueB colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.receive(message);
        } else if (colleague == colleagueB) {
            colleagueA.receive(message);
        }
    }
}
 
