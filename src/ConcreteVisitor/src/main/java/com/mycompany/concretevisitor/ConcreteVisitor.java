/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concretevisitor;

/**
 *
 * @author User
 */
class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visitando " + elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visitando " + elementB.operationB());
    }
}
