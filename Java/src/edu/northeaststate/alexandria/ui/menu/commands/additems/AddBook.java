package edu.northeaststate.alexandria.ui.menu.commands.additems;

import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;

public class AddBook implements MenuCommand {
    private final String COMMAND_NAME = "Add Book";
    private Library library;

    public AddBook(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        System.out.println(COMMAND_NAME);

        /*
             Scanner keyboard = new Scanner(System.in);

        String title;
        String author;
        String ISBN;

        System.out.print("Enter book name: ");
        title = keyboard.nextLine();
        System.out.print("Enter book author: ");
        author = keyboard.nextLine();
        System.out.print("Enter book ISBN: ");
        ISBN = keyboard.nextLine();

        this.library.addBook( new Book() );

        System.out.println("Book added to library.");
         */
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
