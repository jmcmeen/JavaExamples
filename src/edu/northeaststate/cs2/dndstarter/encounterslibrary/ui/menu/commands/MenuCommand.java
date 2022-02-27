/**
 * -------------------------------------------------
 * File name: MenuCommand.java
 * Project Name: Monster Lab!
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands;

public interface MenuCommand {
    void execute();
    boolean isExit();
    String getCommandName();
}

