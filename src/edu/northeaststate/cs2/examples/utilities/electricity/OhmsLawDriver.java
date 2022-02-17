/**
 * -------------------------------------------------
 * File name: OhmsLawDemo.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Mar 1, 2021
 * Additional Notes:
 *   https://www.fluke.com/en-us/learn/blog/electrical/what-is-ohms-law
 *   https://www.rapidtables.com/calc/electric/ohms-law-calculator.html
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.utilities.electricity;

import edu.northeaststate.cs2.examples.utilities.electricity.objectoriented.Amp;
import edu.northeaststate.cs2.examples.utilities.electricity.objectoriented.Ohm;
import edu.northeaststate.cs2.examples.utilities.electricity.objectoriented.Volt;
import edu.northeaststate.cs2.examples.utilities.electricity.statichelper.OhmsLawHelper;

/**
 * Application to demonstrate Ohm's Law calculations using two different paradigms, Object Oriented and Static Helper Classes
 */
public class OhmsLawDriver {
    /**
     * Entry point for the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //------------------------------------------------------------------
        //Static helper class example
        System.out.println(OhmsLawHelper.getOhms(9, .005));
        System.out.println(OhmsLawHelper.getVolts(1800, .005));
        System.out.println(OhmsLawHelper.getAmps(1800,9));

        //------------------------------------------------------------------
        //Object-oriented Ohms Law demonstration
        Ohm o = new Ohm(.005, 9);
        System.out.println(o.getOhms());

        Volt v = new Volt(.005, 1800);
        System.out.println(v.getVolts());

        Amp a = new Amp(1800, 9);
        System.out.println(a.getAmps());
    }
}
