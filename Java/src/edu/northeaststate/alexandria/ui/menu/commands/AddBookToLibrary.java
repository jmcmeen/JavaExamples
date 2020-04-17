package edu.northeaststate.alexandria.ui.menu.commands;

import edu.northeaststate.alexandria.models.Library;

import java.util.Scanner;

public class AddBookToLibrary implements MenuCommand {
    private Library library;

    public AddBookToLibrary(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);

        String name;
        String author;
        String ISBN;

        System.out.print("Enter book name:");
        name = keyboard.nextLine();
        System.out.print("Enter book author:");
        author = keyboard.nextLine();
        System.out.print("Enter book ISBN:");
        ISBN = keyboard.nextLine();

        this.library.addBook(name, ISBN, author);

        System.out.println("Book added!");
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Add Book To Library";
    }
}
