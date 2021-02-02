package edu.northeaststate.cs2.examples.designpatterns.command.controller;

import edu.northeaststate.cs2.examples.designpatterns.command.commands.Command;

public class SimpleRemoteControl {
    private Command command;

    public SimpleRemoteControl() {
    }

    public void setButtonCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
