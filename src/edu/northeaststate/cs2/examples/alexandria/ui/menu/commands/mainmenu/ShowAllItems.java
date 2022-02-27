package edu.northeaststate.cs2.examples.alexandria.ui.menu.commands.mainmenu;

import edu.northeaststate.cs2.examples.alexandria.models.LibraryItem;
import edu.northeaststate.cs2.examples.alexandria.models.Library;
import edu.northeaststate.cs2.examples.alexandria.ui.menu.commands.MenuCommand;

public class ShowAllItems implements MenuCommand {
    private Library library;

    public ShowAllItems(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        for (LibraryItem i : library.getItems()) {
            System.out.println(i.toString());
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Show All Items";
    }
}
