/**
 * -------------------------------------------------
 * File name: AddOrcs.java
 * Project Name: Monster Lab!
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.addmonsters;

import edu.northeaststate.cs2.dndstarter.encounterslibrary.models.Encounter;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.models.Orc;
import edu.northeaststate.cs2.dndstarter.encounterslibrary.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddOrcs implements MenuCommand {
    private final String COMMAND_NAME = "Add Orcs";
    private Encounter encounter;

    public AddOrcs(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numOrcsToGenerate = 0;

        System.out.print("Number of Orcs to generate: ");
        numOrcsToGenerate = keyboard.nextInt();

        for (int i = 0; i < numOrcsToGenerate; i++) {
            encounter.addMonster(new Orc());
        }

        System.out.println("Added " +  numOrcsToGenerate + " Orcs.");
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
