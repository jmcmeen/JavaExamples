/**
 * -------------------------------------------------
 * File Name: Circle.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * Last Updated By: Kayleigh Post
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples.objects;

/**
 * Class Name: InputLoop01
 * Purpose: Models attributes and methods for a geometric circle
 */
public class Circle {
    /**
     * Private attributes
     */
    private double radius;

    /**
     * Method Name: Circle
     * Method Description: Default constructor
     */
    public Circle() {
        radius = 1;
    }

    /**
     * Method Name: Circle
     * Method Description: Parameterized constructor
     * @param newRadius new radius for circle
     */
    public Circle(double newRadius) {
        radius = newRadius;
    }

    /**
     * Method Name: calculateArea
     * Method Description: calculate geometric area of circle
     * @return calculated area
     */
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Method Name: calculateCircumference
     * Method Description: calculate geometric circumference of circle
     * @return calculated area
     */
    public double calculateCircumference() {
        return 2 * radius * Math.PI;
    }

    /**
     * Method Name: getRadius
     * Method Description: return the radius of this circle
     * @return circle radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Method Name: setRadius
     * Method Description: sets the radius attribute for this circle
     * @param newRadius new radius for circle
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
