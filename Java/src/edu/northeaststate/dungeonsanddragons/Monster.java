//* A simple Monster class
package edu.northeaststate.dungeonsanddragons;

public class Monster {
    private int hitPoints;

    public Monster(){
    }

    public Monster(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public int getHitPoints(){
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public void hit(int damage){
        this.hitPoints -= damage;
    }
}

