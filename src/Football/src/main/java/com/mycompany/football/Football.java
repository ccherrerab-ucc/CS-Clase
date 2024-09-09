/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.football;

/**
 *
 * @author User
 */
class Football extends Game {
    @Override
    void initialize() {
        System.out.println("El fútbol ha comenzado.");
    }

    @Override
    void startPlay() {
        System.out.println("Jugando fútbol.");
    }

    @Override
    void endPlay() {
        System.out.println("El fútbol ha terminado.");
    }
}