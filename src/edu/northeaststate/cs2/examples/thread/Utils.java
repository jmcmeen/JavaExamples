/**
 * -------------------------------------------------
 * File name: Utils.java
 * Created By: Tyler Orton
 * Email: torton2@stumail.northeaststate.edu
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.thread;

import java.text.DecimalFormat;

/**
 * Class Name: Utils
 * Purpose: Static helper class for methods and objects used in other parts of the application that don't exactly fit
 * within any of the other classes used in this project.
 */
public class Utils
{
    public static DecimalFormat decimalFormatTwoPlaces = new DecimalFormat("0.00");

    /**
     * Method Name: clamp
     * Method Description: Restricts the given float value to a value between and including min and max
     * @param value The value to clamp
     * @param min The minimum value that value can be
     * @param max The maximum value that value can be
     * @return float
     */
    public static float clamp(float value, float min, float max)
    {
        return Math.max(min, Math.min(max, value));
    }
}