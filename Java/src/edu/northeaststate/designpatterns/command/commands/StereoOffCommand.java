package edu.northeaststate.designpatterns.command.commands;

import edu.northeaststate.designpatterns.command.commands.Command;
import edu.northeaststate.designpatterns.command.models.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
