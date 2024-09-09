/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.light;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.pressButton(lightOn);  // La luz está encendida
        remote.pressButton(lightOff); // La luz está apagada
        remote.pressUndo();           // La luz está encendida
    }
}
