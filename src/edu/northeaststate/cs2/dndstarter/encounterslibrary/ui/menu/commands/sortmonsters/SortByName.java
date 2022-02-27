/**
 * -------------------------------------------------
 * File name: SortByName.java
 * Project Name: Monster Lab!
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.sortmonsters;

import edu.northeaststate.cs2.dndstarter.encounterslibrary.models.Encounter;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.MenuCommand;

public class SortByName implements MenuCommand {
    private final String COMMAND_NAME = "Sort by Name";
    private Encounter encounter;

    public SortByName(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        System.out.println("Sorting...");
        this.encounter.sortMonstersByName();
        System.out.println("Monsters sorted by name");
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }
}
