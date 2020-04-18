package edu.northeaststate.designpatterns.command.controller;

import edu.northeaststate.designpatterns.command.commands.Command;

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
