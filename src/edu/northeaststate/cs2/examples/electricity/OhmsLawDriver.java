/**
 * -------------------------------------------------
 * File name: OhmsLawDemo.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Additional Notes:
 *   https://www.fluke.com/en-us/learn/blog/electrical/what-is-ohms-law
 *   https://www.rapidtables.com/calc/electric/ohms-law-calculator.html
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.electricity;

import edu.northeaststate.cs2.examples.electricity.objectoriented.Amp;
import edu.northeaststate.cs2.examples.electricity.objectoriented.Ohm;
import edu.northeaststate.cs2.examples.electricity.objectoriented.Volt;
import edu.northeaststate.cs2.examples.electricity.statichelper.OhmsLawHelper;

/**
 * Application to demonstrate Ohm's Law calculations using two different paradigms, Object-Oriented and Static Helper Classes
 */
public class OhmsLawDriver {
    /**
     * Entry point for the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //Static helper class example
        System.out.println("Using static methods from the OhmsLawHelper static helper class");
        System.out.println("\tOhms = " + OhmsLawHelper.getOhms(.005, 9));
        System.out.println("\tVolts = " + OhmsLawHelper.getVolts(.005, 1800));
        System.out.println("\tAmps = " + OhmsLawHelper.getAmps(1800,9));

        //Object-oriented Ohms Law demonstration
        System.out.println("Using objects to represent Ohm's law values");
        Ohm o = new Ohm(.005, 9);
        System.out.println("\tOhms = " + o.getValue());

        Volt v = new Volt(.005, 1800);
        System.out.println("\tVolts = " + v.getValue());

        Amp a = new Amp(1800, 9);
        System.out.println("\tAmps = " + a.getValue());
    }
}
