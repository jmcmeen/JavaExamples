package edu.northeaststate.alexandria.ui.menu.commands.mainmenu;

import edu.northeaststate.alexandria.models.Item;
import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;

public class ShowAllItems implements MenuCommand {
    private Library library;

    public ShowAllItems(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        for (Item i : library.getItems()) {
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
