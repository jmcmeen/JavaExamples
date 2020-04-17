package edu.northeaststate.alexandria.ui.menu.commands;

import edu.northeaststate.alexandria.logic.Library;

public class ExitWithSave implements MenuCommand {
    private Library library;

    public ExitWithSave(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        System.out.println("Saving changes to library file...");
        System.out.println("Exiting");
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public String getCommandName() {
        return "Exit - Save Changes";
    }
}
