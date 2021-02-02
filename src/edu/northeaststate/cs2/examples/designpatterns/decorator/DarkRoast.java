package edu.northeaststate.cs2.examples.designpatterns.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("Dark Roast");
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
