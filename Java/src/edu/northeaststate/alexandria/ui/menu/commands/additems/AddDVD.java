package edu.northeaststate.alexandria.ui.menu.commands.additems;

import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.models.film.DVD;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddDVD implements MenuCommand {
    private final String COMMAND_NAME = "Add DVD";
    private Library library;

    public AddDVD(Library library) {
        this.library = library;
    }

    @Override
    public void execute(){
        System.out.println(COMMAND_NAME);

        Scanner keyboard = new Scanner(System.in);

        String id;
        String year;
        String title;
        String director;

        System.out.print("Enter DVD ID: ");
        id = keyboard.nextLine();
        System.out.print("Enter DVD name: ");
        title = keyboard.nextLine();
        System.out.print("Enter DVD year: ");
        year = keyboard.nextLine();
        System.out.print("Enter DVD director: ");
        director = keyboard.nextLine();

        try {
            this.library.addItem( new DVD(id, title, year, director) );
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("DVD added to library.");
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
