package edu.northeaststate.cs2.examples.designpatterns.decorator;

public class CoffeShopRegister {
    public static void main(String[] args) {
        HouseBlend houseblend = new HouseBlend();
        System.out.println(houseblend.getDescription() + ": Cost $" + houseblend.cost());

        Milk milkAddOn = new Milk(houseblend);
        System.out.println(milkAddOn.getDescription() + ": Cost $" + milkAddOn.cost());

        Sugar sugarAddOn = new Sugar(milkAddOn);
        System.out.println(sugarAddOn.getDescription() + ": Cost $" + sugarAddOn.cost());

        PumpkinPieWhippedCream ppwcAddOn = new PumpkinPieWhippedCream(sugarAddOn);
        System.out.println(ppwcAddOn.getDescription() + ": Cost $" + ppwcAddOn.cost());
    }
}
