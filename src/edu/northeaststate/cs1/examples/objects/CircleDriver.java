/**
 * -------------------------------------------------
 * File Name: CircleDriver.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * Last Updated By: Kayleigh Post
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples.objects;

/**
 * Class Name: CircleDriver
 * Purpose: Demonstrates the use of the model class, Circle, to create an object of that class
 *          and various ways to use it.
 */
public class CircleDriver {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
     */
    public static void main(String[] args) {
        //using default constructor to create Circle
        Circle circle1 = new Circle();
        System.out.print("\ncircle1 radius = " + String.format("%.2f", circle1.getRadius() ) );
        System.out.print(" area = " + String.format("%.2f",circle1.calculateArea()) );
        System.out.print(" circumference = " + String.format("%.2f",circle1.calculateCircumference()));

        //using default constructor to create Circle
        Circle circle2 = new Circle(5);
        System.out.print("\n\ncircle2 radius = " + String.format("%.2f", circle2.getRadius() ) );
        System.out.print(" area = " + String.format("%.2f",circle2.calculateArea()) );
        System.out.print(" circumference = " + String.format("%.2f",circle2.calculateCircumference()));

        System.out.println();

        //Use default constructor to make a Circle
        Circle circle3 = new Circle();
        //loop i - 0 through 100, set Circle radius to i
        for (int i = 0; i <= 100; i++) {
            circle3.setRadius(i);
            System.out.print("\ncircle3 radius = " + String.format("%.2f", circle3.getRadius() ) );
            System.out.print(" area = " + String.format("%.2f", circle3.calculateArea()) );
            System.out.print(" circumference = " + String.format("%.2f", circle3.calculateCircumference()));
        }

        //loop i - 99 through 0, set Circle radius to i
        for (int i = 99; i >=0; i--) {
            circle3.setRadius(i);
            System.out.print("\ncircle3 radius = " + String.format("%.2f", circle3.getRadius() ) );
            System.out.print(" area = " + String.format("%.2f", circle3.calculateArea()) );
            System.out.print(" circumference = " + String.format("%.2f", circle3.calculateCircumference()));
        }
    }
}

