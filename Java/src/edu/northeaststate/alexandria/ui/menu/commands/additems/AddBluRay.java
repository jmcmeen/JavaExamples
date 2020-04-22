package edu.northeaststate.alexandria.ui.menu.commands.additems;

import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.models.film.BluRay;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;


import java.util.Scanner;

public class AddBluRay implements MenuCommand {
    private final String COMMAND_NAME = "Add BluRay";
    private Library library;

    public AddBluRay(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        System.out.println(COMMAND_NAME);

        Scanner keyboard = new Scanner(System.in);

        String id;
        String year;
        String title;
        String director;

        System.out.print("Enter BluRay ID: ");
        id = keyboard.nextLine();
        System.out.print("Enter BluRay name: ");
        title = keyboard.nextLine();
        System.out.print("Enter BluRay year: ");
        year = keyboard.nextLine();
        System.out.print("Enter BluRay director: ");
        director = keyboard.nextLine();

        try {
            this.library.addItem( new BluRay(id, title, year, director) );
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("BluRay added to library.");
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
