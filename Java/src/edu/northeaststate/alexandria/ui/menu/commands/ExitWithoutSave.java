package edu.northeaststate.alexandria.ui.menu.commands;

import edu.northeaststate.alexandria.logic.Library;

public class ExitWithoutSave implements Command {
    private Library library;

    public ExitWithoutSave(Library library) {
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
