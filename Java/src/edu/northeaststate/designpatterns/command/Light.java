package edu.northeaststate.designpatterns.command;

// Light class and its corresponding command
// classes
class Light {
    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}