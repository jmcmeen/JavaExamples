package edu.northeaststate.cs2.examples.alexandria.ui;

import edu.northeaststate.cs2.examples.alexandria.models.Library;
import edu.northeaststate.cs2.examples.alexandria.ui.menu.ConsoleMenu;
import edu.northeaststate.cs2.examples.alexandria.ui.menu.commands.mainmenu.*;

public class APLKiosk {
    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu("Welcome to the Alexandria Public Library");

        Library alexandria = new Library("APL");

        menu.addCommand(new LoadLibraryFromFile(alexandria));
        menu.addCommand(new SaveLibraryToFile(alexandria));
        menu.addCommand(new AddItems(alexandria));
        menu.addCommand(new SearchLibrary(alexandria));
        menu.addCommand(new ShowAllItems(alexandria));
        menu.addCommand(new AddItems(alexandria));
        menu.addCommand(new Exit());

        menu.show();
    }
}
