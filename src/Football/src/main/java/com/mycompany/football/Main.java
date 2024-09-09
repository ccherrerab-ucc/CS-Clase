/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.football;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();

        game = new Basketball();
        game.play();
    }
}
