/**
 * -------------------------------------------------
 * File name: ShowAllMonsters.java
 * Project Name: Monster Lab!
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.mainmenu;

import edu.northeaststate.cs2.dndstarter.encounterslibrary.models.Encounter;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.models.Monster;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.MenuCommand;

public class ShowAllMonsters implements MenuCommand {
    private final String COMMAND_NAME = "Show All Monsters";
    private Encounter encounter;

    public ShowAllMonsters(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        if(encounter.getMonsters().size() == 0){
            System.out.println("No Monsters in Encounter");
        }else{
            for (Monster monster : encounter.getMonsters()) {
                System.out.println(monster.toString());
            }
        }
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
