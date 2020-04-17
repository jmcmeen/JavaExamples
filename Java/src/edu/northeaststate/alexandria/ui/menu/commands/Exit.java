package edu.northeaststate.alexandria.ui.menu.commands;

import edu.northeaststate.alexandria.models.Library;

public class Exit implements MenuCommand {
    private Library library;

    public Exit(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        System.out.println("Exiting");
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public String getCommandName() {
        return "Exit - No Save";
    }
}
