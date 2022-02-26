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
 * Models voltage in volts calculated from Ohm's Law
 */
public class Volt {
    private double amps, ohms;

    /**
     * Parameterized constructor
     * @param amps current in amps
     * @param ohms resistance in ohms
     */
    public Volt(double amps, double ohms) {
        this.amps = amps;
        this.ohms = ohms;
    }

    /**
     * Calculates voltage using Ohm's Law
     * @return calculated volts
     */
    public double getValue(){
        return amps * ohms;
    }
}
