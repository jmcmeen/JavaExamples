/**
 * -------------------------------------------------
 * File name: MenuCommand.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.dnd.monsterlab.ui.menu.commands;

public interface MenuCommand {
    void execute();
    boolean isExit();
    String getCommandName();
}

