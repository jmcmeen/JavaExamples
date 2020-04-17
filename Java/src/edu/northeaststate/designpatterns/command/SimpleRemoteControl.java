package edu.northeaststate.designpatterns.command;

class SimpleRemoteControl {
    private Command command;

    public SimpleRemoteControl() {
    }

    public void setButtonCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
