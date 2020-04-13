package edu.northeaststate.designpatterns.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("House Blend");
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
