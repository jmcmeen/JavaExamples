package edu.northeaststate.designpatterns.command.commands;

import edu.northeaststate.designpatterns.command.commands.Command;
import edu.northeaststate.designpatterns.command.models.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}