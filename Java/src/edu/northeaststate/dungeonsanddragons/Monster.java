//* A simple Monster class
package edu.northeaststate.dungeonsanddragons;

public class Monster {
    private int hp;

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void hit(int damage){
        this.hp -= damage;
    }
}

