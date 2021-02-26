package edu.northeaststate.cs2.examples.inheritance.farmland;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}
