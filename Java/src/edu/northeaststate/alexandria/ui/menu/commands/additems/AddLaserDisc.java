package edu.northeaststate.alexandria.ui.menu.commands.additems;

import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.models.film.LaserDisc;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddLaserDisc implements MenuCommand {
    private final String COMMAND_NAME = "Add LaserDisc";
    private Library library;

    public AddLaserDisc(Library library) {
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

        System.out.print("Enter LaserDisc ID: ");
        id = keyboard.nextLine();
        System.out.print("Enter LaserDisc name: ");
        title = keyboard.nextLine();
        System.out.print("Enter LaserDisc year: ");
        year = keyboard.nextLine();
        System.out.print("Enter LaserDisc director: ");
        director = keyboard.nextLine();

        try {
            this.library.addItem( new LaserDisc(id, title, year, director) );
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("LaserDisc added to library.");
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
