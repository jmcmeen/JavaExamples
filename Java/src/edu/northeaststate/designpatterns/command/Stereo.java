package edu.northeaststate.designpatterns.command;

// Stereo and its command classes
class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Stereo is set " +
                "for CD input");
    }

    public void setDVD() {
        System.out.println("Stereo is set" +
                " for DVD input");
    }

    public void setRadio() {
        System.out.println("Stereo is set" +
                " for Radio");
    }

    public void setVolume(int volume) {
        // code to set the volume
        System.out.println("Stereo volume set"
                + " to " + volume);
    }
}