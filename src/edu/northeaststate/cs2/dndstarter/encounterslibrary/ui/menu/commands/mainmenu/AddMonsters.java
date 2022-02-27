/**
 * -------------------------------------------------
 * File name: AddMonsters.java
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
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.ConsoleMenu;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.MenuCommand;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.addmonsters.AddOrcs;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.addmonsters.AddTrolls;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.addmonsters.Home;

public class AddMonsters implements MenuCommand {
    private final String COMMAND_NAME = "Add Monsters";
    private Encounter encounter;

    public AddMonsters(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        ConsoleMenu menu = new ConsoleMenu(COMMAND_NAME);

        menu.addCommand(new AddOrcs(this.encounter));
        menu.addCommand(new AddTrolls(this.encounter));
        //TODO You will add the MenuCommand object here for AddRandomMonsters, and an Add Monster MenuCommand for
        // each of your 3 Monster sub classes.(Hint: 4 LOC)

        menu.addCommand(new Home());

        menu.show();
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
