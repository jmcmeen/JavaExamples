//* A simple Monster class
package edu.northeaststate.dungeonsanddragons;

public class Monster {
    private String name;
    private int hitPoints;

    //Default Constructor
    public Monster(){
    }

    //Overloaded Constructor
    public Monster(String name, int hitPoints){
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public int getHitPoints(){
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void hit(int damage){
        this.hitPoints -= damage;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Monster [name=");
        sb.append(this.name);
        sb.append(", hitPoints=");
        sb.append(this.hitPoints);
        sb.append("]");

        return sb.toString();
    }
}

