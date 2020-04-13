package edu.northeaststate.designpatterns.command;

class SimpleRemoteControl {
    Command button;

    public SimpleRemoteControl() {
    }

    public void setButtonCommand(Command command) {
        button = command;
    }

    public void pressButton() {
        button.execute();
    }
}
