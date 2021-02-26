package edu.northeaststate.cs2.examples.inheritance.farmland;

public class Horse extends Animal{
    public Horse(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "ney ney!";
    }
}
