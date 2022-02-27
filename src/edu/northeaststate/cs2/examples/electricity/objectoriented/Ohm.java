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
 * Class Name: Ohm
 * Purpose: Models resistance in Ohms calculated from Ohm's Law
 */
public class Ohm {
    private double amps, volts;

    /**
     * Method Name: Ohm
     * Method Description: Parameterized constructor
     * @param amps current in amps
     * @param volts voltage in volts
     */
    public Ohm(double amps, double volts) {
        this.amps = amps;
        this.volts = volts;
    }

    /**
     * Method Name: getValue
     * Method Description: Calculates resistance in Ohms using Ohm's Law
     * @return double
     */
    public double getValue(){
        return volts /amps;
    }
}

