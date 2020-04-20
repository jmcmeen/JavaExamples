/**
 * -------------------------------------------------
 * File name: Home.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.dnd.monsterlab.ui.menu.commands.addmonsters;

import edu.northeaststate.dnd.monsterlab.ui.menu.commands.MenuCommand;

public class Home implements MenuCommand {
    private final String COMMAND_NAME = "Home";
    @Override
    public void execute() {
        System.out.println("Home");
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
