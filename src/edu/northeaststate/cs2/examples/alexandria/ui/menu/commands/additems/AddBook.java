package edu.northeaststate.cs2.examples.alexandria.ui.menu.commands.additems;

import edu.northeaststate.cs2.examples.alexandria.models.Library;
import edu.northeaststate.cs2.examples.alexandria.models.book.Book;
import edu.northeaststate.cs2.examples.alexandria.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddBook implements MenuCommand {
    private final String COMMAND_NAME = "Add Book";
    private Library library;

    public AddBook(Library library) {
        this.library = library;
    }

    @Override
    public void execute(){
        System.out.println(COMMAND_NAME);

        Scanner keyboard = new Scanner(System.in);

        String id;
        String year;
        String title;
        String author;
        String ISBN;

        System.out.print("Enter book ID: ");
        id = keyboard.nextLine();
        System.out.print("Enter book name: ");
        title = keyboard.nextLine();
        System.out.print("Enter book year: ");
        year = keyboard.nextLine();
        System.out.print("Enter book author: ");
        author = keyboard.nextLine();
        System.out.print("Enter book ISBN: ");
        ISBN = keyboard.nextLine();

        try {
            this.library.addItem( new Book(id, title, year,author, ISBN) );
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Book added to library.");
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
