package edu.northeaststate.cs2.examples.alexandria.ui.menu;

import edu.northeaststate.cs2.examples.alexandria.ui.menu.commands.MenuCommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleMenu {
    private String menuHeader;
    private HashMap<Integer, MenuCommand> mapCommands = new HashMap<>();

    public ConsoleMenu(String menuHeader) {
        this.menuHeader = menuHeader;
    }

    public void addCommand(MenuCommand menuItem) {
        this.mapCommands.put(mapCommands.size() + 1, menuItem);
    }

    public void show() {
        MenuCommand c;

        do {
            if(mapCommands.isEmpty()){
                System.out.println("Empty Menu");
                break;
            }
            Scanner keyboard = new Scanner(System.in);

            System.out.println("\n" + this.menuHeader);

            // Using for-each loop
            for (Map.Entry mapElement : mapCommands.entrySet()) {
                int key = (int) mapElement.getKey();
                c = (MenuCommand) mapElement.getValue();

                System.out.println(key + ". " + c.getCommandName());
            }

            System.out.print("Choose a number and press enter: ");
            int input = keyboard.nextInt();

            while (!mapCommands.containsKey(input)) {
                System.out.println("Invalid choice. Choose a number and press enter: ");
                input = keyboard.nextInt();
            }

            pageFeed();

            c = mapCommands.get(input);

            c.execute();
        } while (!c.isExit());
    }

    private void pageFeed(){
        String n = "\n";
        System.out.println(n.repeat(30));
    }
}
