package edu.northeaststate.cs2.examples.inheritance.farmland;

public class Frog extends Animal{
    public Frog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "It's not easy being green, ribbit.";
    }
}
