package edu.northeaststate.designpatterns.command.commands;

import edu.northeaststate.designpatterns.command.models.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}