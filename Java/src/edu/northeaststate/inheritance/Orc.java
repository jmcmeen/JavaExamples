package edu.northeaststate.inheritance;

import edu.northeaststate.dungeonsanddragons.Monster;

public class Orc extends Monster {
    private static int numOrcs = 1;

    public Orc(){
        super("Orc " + numOrcs, 12 );
        numOrcs+=1;
    }
}
