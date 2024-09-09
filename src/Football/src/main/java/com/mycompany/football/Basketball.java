/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.football;

/**
 *
 * @author User
 */
class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("El baloncesto ha comenzado.");
    }

    @Override
    void startPlay() {
        System.out.println("Jugando baloncesto.");
    }

    @Override
    void endPlay() {
        System.out.println("El baloncesto ha terminado.");
    }
}
