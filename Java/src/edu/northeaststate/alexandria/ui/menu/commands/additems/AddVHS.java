package edu.northeaststate.alexandria.ui.menu.commands.additems;

import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.models.film.VHS;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddVHS implements MenuCommand {
    private final String COMMAND_NAME = "Add VHS";
    private Library library;

    public AddVHS(Library library) {
        this.library = library;
    }

    @Override
    public void execute() throws CloneNotSupportedException {
        System.out.println(COMMAND_NAME);

        Scanner keyboard = new Scanner(System.in);

        String id;
        String year;
        String title;
        String director;

        System.out.print("Enter VHS ID: ");
        id = keyboard.nextLine();
        System.out.print("Enter VHS name: ");
        title = keyboard.nextLine();
        System.out.print("Enter VHS year: ");
        year = keyboard.nextLine();
        System.out.print("Enter VHS director: ");
        director = keyboard.nextLine();

        this.library.addItem( new VHS(id, title, year, director) );

        System.out.println("VHS added to library.");
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
