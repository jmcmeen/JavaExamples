package edu.northeaststate.alexandria.ui.menu.commands;

import edu.northeaststate.alexandria.models.Book;
import edu.northeaststate.alexandria.models.Library;

import java.util.Scanner;

public class SearchForBookByName implements MenuCommand{
    private Library library;

    public SearchForBookByName(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);

        String nameInput;

        System.out.print("Enter book name:");
        nameInput = keyboard.nextLine();

        //search for book
        for(Book b: library.getBooks()){
            if(b.getName().equalsIgnoreCase(nameInput)){
                System.out.println("Found book!");
                System.out.println(b);
                break;
            }
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Search for Book";
    }
}
