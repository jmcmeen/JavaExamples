package edu.northeaststate.alexandria.ui.menu.commands.additems;

import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.models.periodical.Journal;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddJournal implements MenuCommand {
    private final String COMMAND_NAME = "Add Journal";
    private Library library;

    public AddJournal(Library library) {
        this.library = library;
    }

    @Override
    public void execute() throws CloneNotSupportedException {
        System.out.println(COMMAND_NAME);

        Scanner keyboard = new Scanner(System.in);

        String id;
        String year;
        String title;
        String volumeNumber;

        System.out.print("Enter journal ID: ");
        id = keyboard.nextLine();
        System.out.print("Enter journal name: ");
        title = keyboard.nextLine();
        System.out.print("Enter journal year: ");
        year = keyboard.nextLine();
        System.out.print("Enter journal volume number: ");
        volumeNumber = keyboard.nextLine();

        this.library.addItem( new Journal(id, title, year, volumeNumber) );

        System.out.println("Journal added to library.");
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
