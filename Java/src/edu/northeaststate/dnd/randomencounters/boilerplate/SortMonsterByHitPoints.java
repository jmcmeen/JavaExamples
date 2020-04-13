package edu.northeaststate.dnd.randomencounters.boilerplate;

import edu.northeaststate.dnd.randomencounters.boilerplate.monsters.Monster;

import java.util.Comparator;

public class SortMonsterByHitPoints implements Comparator<Monster> {
    @Override
    public int compare(Monster m1, Monster m2) {
        /*
        if(m1.getHitPoints() < m2.getHitPoints()){
            return -1;
        }else if(m1.getHitPoints() > m2.getHitPoints()){
            return 1;
        }else{
            return 0;
        }
*/

        return m1.getHitPoints() - m2.getHitPoints();
    }
}
