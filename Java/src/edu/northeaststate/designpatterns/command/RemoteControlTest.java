package edu.northeaststate.designpatterns.command;

import edu.northeaststate.designpatterns.command.commands.LightOnCommand;
import edu.northeaststate.designpatterns.command.commands.StereoOffCommand;
import edu.northeaststate.designpatterns.command.commands.StereoOnWithCDCommand;
import edu.northeaststate.designpatterns.command.controller.SimpleRemoteControl;
import edu.northeaststate.designpatterns.command.models.Light;
import edu.northeaststate.designpatterns.command.models.Stereo;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        Stereo stereo = new Stereo();

        // we can change command dynamically
        remote.setButtonCommand(new LightOnCommand(light));
        remote.pressButton();

        remote.setButtonCommand(new StereoOnWithCDCommand(stereo));
        remote.pressButton();

        remote.setButtonCommand(new StereoOffCommand(stereo));
        remote.pressButton();
    }
}