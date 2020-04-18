package edu.northeaststate.alexandria.ui.menu.commands.mainmenu;

import edu.northeaststate.alexandria.models.Item;
import edu.northeaststate.alexandria.models.Library;
import edu.northeaststate.alexandria.models.book.Book;
import edu.northeaststate.alexandria.models.film.DVD;
import edu.northeaststate.alexandria.models.film.VHS;
import edu.northeaststate.alexandria.models.periodical.Journal;
import edu.northeaststate.alexandria.models.periodical.Magazine;
import edu.northeaststate.alexandria.models.periodical.Newspaper;
import edu.northeaststate.alexandria.ui.menu.commands.MenuCommand;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchLibrary implements MenuCommand {
    private Library library;

    public SearchLibrary(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Item> searchResults = new ArrayList<>();

        String searchTerm;

        System.out.print("Enter search term:");
        searchTerm = keyboard.nextLine();

        for(Item item: library.getItems()){
            //Search item terms
            if(item.getTitle().toLowerCase().contains(searchTerm.toLowerCase()) ||
               item.getYear().toLowerCase().contains(searchTerm.toLowerCase())){
                searchResults.add(item);
                continue;
            }

            if(item instanceof Book){
                Book b = (Book)item;
                if(b.getAuthor().toLowerCase().contains(searchTerm.toLowerCase()) ||
                   b.getISBN().toLowerCase().contains(searchTerm.toLowerCase())){
                    searchResults.add(item);
                }
            }else if (item instanceof DVD){
                DVD d = (DVD)item;
                if(d.getDirector().toLowerCase().contains(searchTerm.toLowerCase())){
                    searchResults.add(item);

                }
            }else if (item instanceof VHS){
                VHS v = (VHS)item;
                if(v.getDirector().toLowerCase().contains(searchTerm.toLowerCase())){
                    searchResults.add(item);
                }
            }else if (item instanceof Journal){
                Journal j = (Journal)item;
                if(j.getVolumeNumber().toLowerCase().contains(searchTerm.toLowerCase())){
                    searchResults.add(item);
                }
            }else if (item instanceof Magazine){
                Magazine m = (Magazine)item;
                if(m.getVolumeNumber().toLowerCase().contains(searchTerm.toLowerCase())){
                    searchResults.add(item);
                }
            }else if (item instanceof Newspaper){
                Newspaper n = (Newspaper)item;
                if(n.getVolumeNumber().toLowerCase().contains(searchTerm.toLowerCase())){
                    searchResults.add(item);
                }
            }
        }

        System.out.println("Search Results for " + searchTerm + "-------------------------");
        if(searchResults.size() == 0){
            System.out.println("No Results");
        }else{
            for(Item i: searchResults){
                System.out.println(i.toString());
            }
        }
        System.out.println("-------------------------------------------------------------");
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Search Library";
    }
}
