/**
 * -------------------------------------------------
 * File name: EncounterGen.java
 * Project Name: Monster Lab!
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.dndstarter.encounterslibrary.ui;

import edu.northeaststate.cs2.dndstarter.encounterslibrary.models.Encounter;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.ConsoleMenu;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.mainmenu.AddMonsters;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.mainmenu.Exit;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.mainmenu.ShowAllMonsters;

public class EncounterGen {
    public static void main(String[] args) {
        final String MENU_NAME = "MONSTER LAB! Encounter Manager\n" +
                                 "------------------------------";

        Encounter encounter = new Encounter();

        ConsoleMenu menu = new ConsoleMenu(MENU_NAME);

        //TODO add MenuCommand objects to menu, for load, save, and sort commands (Hint 3 LOC)
        menu.addCommand(new AddMonsters(encounter));
        menu.addCommand(new ShowAllMonsters(encounter));
        menu.addCommand(new Exit()); 

        menu.show();
    }
}
