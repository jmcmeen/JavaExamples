package edu.northeaststate.alexandria.ui.menu.commands.mainmenu;

import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.ui.menu.ConsoleMenu;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;
import edu.northeaststate.alexandria.ui.menu.commands.additems.*;

public class AddItems implements MenuCommand {
    private final String COMMAND_NAME = "Add Item";
    private Library library;

    public AddItems(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        ConsoleMenu menu = new ConsoleMenu(COMMAND_NAME);

        menu.addCommand(new AddBook(this.library));
        menu.addCommand(new AddDVD(this.library));
        menu.addCommand(new AddJournal(this.library));
        menu.addCommand(new AddNewspaper(library));
        menu.addCommand(new AddVHS(library));
        menu.addCommand(new Home());

        menu.show();
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }
}
