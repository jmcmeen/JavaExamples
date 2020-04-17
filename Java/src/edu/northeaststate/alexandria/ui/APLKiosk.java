package edu.northeaststate.alexandria.ui;

import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.ui.menu.ConsoleMenu;
import edu.northeaststate.alexandria.ui.menu.commands.*;

public class APLKiosk {
    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu("Welcome to the Alexandria Public Library");

        Library alexandria = new Library("APL");

        menu.addCommand(new LoadLibraryFromFile(alexandria));
        menu.addCommand(new SaveLibraryToFile(alexandria));
        menu.addCommand(new AddBookToLibrary(alexandria));
        menu.addCommand(new SearchForBookByName(alexandria));
        menu.addCommand(new ShowAllBooks(alexandria));
        menu.addCommand(new ExitWithSave(alexandria));
        menu.addCommand(new ExitWithoutSave(alexandria));


        menu.show();
    }
}
