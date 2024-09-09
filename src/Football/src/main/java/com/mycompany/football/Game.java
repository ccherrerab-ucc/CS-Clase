/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.football;

/**
 *
 * @author User
 */
abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Plantilla del algoritmo
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
