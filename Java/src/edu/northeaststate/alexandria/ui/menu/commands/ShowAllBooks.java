package edu.northeaststate.alexandria.ui.menu.commands;

import edu.northeaststate.alexandria.logic.Book;
import edu.northeaststate.alexandria.logic.Library;

public class ShowAllBooks implements Command {
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
