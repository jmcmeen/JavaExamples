package edu.northeaststate.alexandria.ui.menu.commands;

import edu.northeaststate.alexandria.data.FileAccess;
import edu.northeaststate.alexandria.models.Library;

import java.util.Scanner;

public class LoadLibraryFromFile implements MenuCommand{
    private Library library;

    public LoadLibraryFromFile(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the file name to load: ");

        String ans = keyboard.nextLine().trim();
        try {
            FileAccess.openLibraryFile(ans, this.library);
        } catch (Exception e) {
            //System.out.println("\n======================= ERROR ========================");
            System.out.println("\n" + e.getMessage() + "\n");
            //System.out.println("======================================================");
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Load Library Data From File";
    }
}
