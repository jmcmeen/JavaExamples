package edu.northeaststate.alexandria.ui.menu.commands.mainmenu;

import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;

public class SearchLibrary implements MenuCommand {
    private Library library;

    public SearchLibrary(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        /*Scanner keyboard = new Scanner(System.in);

        String nameInput;

        System.out.print("Enter book name:");
        nameInput = keyboard.nextLine();

        for(Book b: library.getBooks()){
            if(b.getTitle().equalsIgnoreCase(nameInput)){
                System.out.println("Found book!");
                System.out.println(b);
                break;
            }
        }*/
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
