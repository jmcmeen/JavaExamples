package edu.northeaststate.cs2.examples.designpatterns.command.commands;

import edu.northeaststate.cs2.examples.designpatterns.command.models.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
