package edu.northeaststate.cs2.examples.alexandria.ui.menu.commands;

public interface MenuCommand {
    void execute();
    boolean isExit();
    String getCommandName();
}
