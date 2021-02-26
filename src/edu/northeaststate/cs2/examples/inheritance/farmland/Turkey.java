package edu.northeaststate.cs2.examples.inheritance.farmland;

public class Turkey extends Animal{
    public Turkey(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "gobble gobble!";
    }
}
