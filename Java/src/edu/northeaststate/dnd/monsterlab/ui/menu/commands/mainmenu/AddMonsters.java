/**
 * -------------------------------------------------
 * File name: AddMonsters.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.dnd.monsterlab.ui.menu.commands.mainmenu;

import edu.northeaststate.dnd.monsterlab.models.Encounter;
import edu.northeaststate.dnd.monsterlab.ui.menu.ConsoleMenu;
import edu.northeaststate.dnd.monsterlab.ui.menu.commands.MenuCommand;
import edu.northeaststate.dnd.monsterlab.ui.menu.commands.addmonsters.AddOrcs;
import edu.northeaststate.dnd.monsterlab.ui.menu.commands.addmonsters.AddTrolls;
import edu.northeaststate.dnd.monsterlab.ui.menu.commands.addmonsters.Home;

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
