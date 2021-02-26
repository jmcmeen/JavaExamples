package edu.northeaststate.cs2.examples.inheritance.farmland;

public class Cow extends Animal{
    public Cow(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "moo moo!";
    }
}
