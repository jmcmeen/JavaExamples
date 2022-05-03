package edu.northeaststate.cs2.examples.designpatterns.decorator;

public class PumpkinPieWhippedCream extends AddOn{
    public PumpkinPieWhippedCream(Beverage bev) {
        super("Pumpkin Pie Whipped Cream", bev);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " [add pumpkin pie whipped cream]";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }
}
