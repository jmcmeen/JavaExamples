package edu.northeaststate.cs2.examples.designpatterns.command.commands;

import edu.northeaststate.cs2.examples.designpatterns.command.models.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}