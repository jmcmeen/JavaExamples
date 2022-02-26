/**
 * -------------------------------------------------
 * File name: OhmsLawDemo.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Mar 1, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.electricity.objectoriented;

/**
 * Models current in amps calculated from Ohm's Law
 */
public class Amp {
    public double ohms, volts;

    /**
     * Parameterized constructor
     * @param ohms resistance in Ohms
     * @param volts voltage in volts
     */
    public Amp(double ohms, double volts) {
        this.ohms = ohms;
        this.volts = volts;
    }

    /**
     * Calculates current in amps using Ohm's Law
     * @return calculated amps
     */
    public double getValue(){
        return volts/ ohms;
    }
}
