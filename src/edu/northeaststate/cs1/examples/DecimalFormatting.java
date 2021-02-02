package edu.northeaststate.cs1.examples;

import java.text.DecimalFormat;

public class DecimalFormatting {
    public static void main(String[] args) {
        float myFloat = 15.2394872f;
        double myDouble = 9.541269873541265;

        //using String.format where %.2f is the placeholder and the formatting designation
        System.out.println(String.format("The value of myFloat = %.2f", myFloat));
        System.out.println(String.format("The value of myDouble = %.2f", myDouble));

        //using DecimalFormat object (advanced)
        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println("The values of myFloat = " + dc.format(myFloat));
        System.out.println("The values of myDouble = " + dc.format(myDouble));
    }
}
