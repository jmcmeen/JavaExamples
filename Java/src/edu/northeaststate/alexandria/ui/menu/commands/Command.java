package edu.northeaststate.alexandria.ui.menu.commands;

public interface Command {
    void execute();

    boolean isExit();

    String getCommandName();
}
