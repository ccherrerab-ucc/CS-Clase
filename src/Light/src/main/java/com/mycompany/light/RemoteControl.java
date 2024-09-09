/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.light;

import java.util.Stack;

/**
 *
 * @author User
 */
class RemoteControl {
    private final Stack<Command> commandHistory = new Stack<>();

    public void pressButton(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }
}
