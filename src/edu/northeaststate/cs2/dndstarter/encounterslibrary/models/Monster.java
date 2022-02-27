/**
 * -------------------------------------------------
 * File name: Monster.java
 * Project Name: D&D Encounters
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * Creation date: Apr 20, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.encounterslibrary.models;

import java.io.Serializable;

public abstract class Monster implements Serializable {
    protected String name;
    protected int hitPoints;
    protected int attackDamage;
    protected int armorClass;

    public Monster(String name, int hitPoints, int attackDamage, int armorClass) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackDamage = attackDamage;
        this.armorClass = armorClass;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getArmorClass() {
        return armorClass;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", attackDamage=" + attackDamage +
                ", armorClass=" + armorClass +
                '}';
    }
}


