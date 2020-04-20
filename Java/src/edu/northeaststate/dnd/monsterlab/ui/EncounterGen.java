/**
 * -------------------------------------------------
 * File name: EncounterGen.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.dnd.monsterlab.ui;

import edu.northeaststate.dnd.monsterlab.models.Encounter;
import edu.northeaststate.dnd.monsterlab.ui.menu.ConsoleMenu;
import edu.northeaststate.dnd.monsterlab.ui.menu.commands.mainmenu.AddMonsters;
import edu.northeaststate.dnd.monsterlab.ui.menu.commands.mainmenu.Exit;
import edu.northeaststate.dnd.monsterlab.ui.menu.commands.mainmenu.ShowAllMonsters;

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
