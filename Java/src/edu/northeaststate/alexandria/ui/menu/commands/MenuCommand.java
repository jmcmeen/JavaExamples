package edu.northeaststate.alexandria.ui.menu.commands;

public interface MenuCommand {
    void execute() throws CloneNotSupportedException;
    boolean isExit();
    String getCommandName();
}
