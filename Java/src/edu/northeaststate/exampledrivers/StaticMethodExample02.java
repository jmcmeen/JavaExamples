package edu.northeaststate.exampledrivers;

import edu.northeaststate.dnd.util.Helper;

import java.util.Scanner;

public class StaticMethodExample02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String tempInput;
        int parsedInteger;
        double parsedDouble;

        //Classes with static methods do no require you to create an object first
        //The Helper class has a static method named isPositiveInteger
        //Just use the name of the class and the method you want to call
        System.out.print("Enter a positive integer: ");
        tempInput = keyboard.nextLine();

        //while the parsed integer is not positive, keep getting input
        while ((parsedInteger = Helper.isPositiveInteger(tempInput)) == -1) {
            System.out.println(tempInput + " is not a positive integer.");
            System.out.print("Enter a positive integer: ");
            tempInput = keyboard.nextLine();
        }

        System.out.println(parsedInteger + " is a positive integer.");
        System.out.println("------------------------------------------");

        System.out.print("Enter a positive double: ");
        tempInput = keyboard.nextLine();

        //while the parsed double is not positive, keep getting input
        while ((parsedDouble = Helper.isPositiveDouble(tempInput)) == -1) {
            System.out.println(tempInput + " is not a positive double.");
            System.out.print("Enter a positive double: ");
            tempInput = keyboard.nextLine();
        }

        System.out.println(parsedDouble + " is a positive double.");
    }
}
