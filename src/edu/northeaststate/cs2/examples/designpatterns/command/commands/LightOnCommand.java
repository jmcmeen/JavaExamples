package edu.northeaststate.cs2.examples.designpatterns.command.commands;

import edu.northeaststate.cs2.examples.designpatterns.command.models.Light;

public class LightOnCommand implements Command {
    private Light light;

    // The constructor is passed the light it
    // is going to control.
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}