package edu.northeaststate.cs2.examples.designpatterns.decorator;

public class Milk extends AddOn {
    public Milk(Beverage bev) {
        super("Milk", bev);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " [add milk]";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
