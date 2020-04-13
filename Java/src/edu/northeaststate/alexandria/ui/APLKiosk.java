package edu.northeaststate.alexandria.ui;

import edu.northeaststate.alexandria.logic.Library;
import edu.northeaststate.alexandria.ui.menu.ConsoleMenu;
import edu.northeaststate.alexandria.ui.menu.commands.AddBookToLibrary;
import edu.northeaststate.alexandria.ui.menu.commands.ExitWithSave;
import edu.northeaststate.alexandria.ui.menu.commands.ExitWithoutSave;
import edu.northeaststate.alexandria.ui.menu.commands.ShowAllBooks;

public class APLKiosk {
    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu("Welcome to the Alexandria Public Library");

        Library alexandria = new Library("Alexandria Public Library");

        menu.addCommand(new AddBookToLibrary(alexandria));
        menu.addCommand(new ShowAllBooks(alexandria));
        menu.addCommand(new ExitWithSave(alexandria));
        menu.addCommand(new ExitWithoutSave(alexandria));

        menu.show();
    }
}
