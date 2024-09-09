/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.context;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        OnState onState = new OnState();
        onState.doAction(context);

        System.out.println(context.getState().toString());

        OffState offState = new OffState();
        offState.doAction(context);

        System.out.println(context.getState().toString());
    }
}