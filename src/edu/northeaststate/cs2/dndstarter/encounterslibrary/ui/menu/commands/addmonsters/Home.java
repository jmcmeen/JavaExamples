/**
 * -------------------------------------------------
 * File name: Home.java
 * Project Name: Monster Lab!
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.addmonsters;

import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.MenuCommand;

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
