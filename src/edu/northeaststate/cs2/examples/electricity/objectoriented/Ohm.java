/**
 * -------------------------------------------------
 * File name: Ohm.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.electricity.objectoriented;

/**
 * Models resistance in Ohms calculated from Ohm's Law
 */
public class Ohm {
    private double amps, volts;

    /**
     * Parameterized constructor
     * @param amps current in amps
     * @param volts voltage in volts
     */
    public Ohm(double amps, double volts) {
        this.amps = amps;
        this.volts = volts;
    }

    /**
     * Calculates resistance in Ohms using Ohm's Law
     * @return calculated Ohms
     */
    public double getValue(){
        return volts /amps;
    }
}

