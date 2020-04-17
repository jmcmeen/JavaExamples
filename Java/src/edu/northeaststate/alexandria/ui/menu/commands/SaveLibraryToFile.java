package edu.northeaststate.alexandria.ui.menu.commands;

import edu.northeaststate.alexandria.data.FileAccess;
import edu.northeaststate.alexandria.models.Library;

import java.io.IOException;
import java.util.Scanner;

public class SaveLibraryToFile implements MenuCommand{
    private Library library;

    public SaveLibraryToFile(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter file name to save: ");
        String fileName = keyboard.nextLine().trim();
        try {
            FileAccess.saveLibraryFile(fileName, this.library);
            System.out.println("\n\nFile saved.");
        } catch (IOException e) {
            System.out.println("File save error.");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Save Library to File";
    }
}
