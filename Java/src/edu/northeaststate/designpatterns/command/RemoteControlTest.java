package edu.northeaststate.designpatterns.command;

// Driver class
class RemoteControlTest {
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