package edu.northeaststate.designpatterns.decorator;

public class Sugar extends AddOn {
    public Sugar(Beverage bev) {
        super("Sugar", bev);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " [add sugar]";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
