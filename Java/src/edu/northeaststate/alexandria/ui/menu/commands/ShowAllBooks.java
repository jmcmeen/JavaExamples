package edu.northeaststate.alexandria.ui.menu.commands;

import edu.northeaststate.alexandria.models.Book;
import edu.northeaststate.alexandria.models.Library;

public class ShowAllBooks implements MenuCommand {
    private Library library;

    public ShowAllBooks(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        for (Book b : library.getBooks()) {
            System.out.println(b.toString());
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Show All Books";
    }
}
