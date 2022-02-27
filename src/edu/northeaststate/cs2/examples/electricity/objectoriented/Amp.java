/**
 * -------------------------------------------------
 * File name: Amp.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.electricity.objectoriented;

/**
 * Class Name: Amp
 * Purpose: Models current in amps calculated from Ohm's Law
 */
public class Amp {
    public double ohms, volts;

    /**
     * Method Name: Amp
     * Method Description: Parameterized constructor
     * @param ohms resistance in Ohms
     * @param volts voltage in volts
     */
    public Amp(double ohms, double volts) {
        this.ohms = ohms;
        this.volts = volts;
    }

    /**
     * Method Name: getValue
     * Method Description: Calculates current in amps using Ohm's Law
     * @return double
     */
    public double getValue(){
        return volts/ ohms;
    }
}
