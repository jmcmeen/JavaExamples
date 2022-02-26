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
package edu.northeaststate.cs2.examples.electricity.statichelper;

/**
 * Class that provides static methods to perform various calculations using Ohm's Law
 */
public class OhmsLawHelper {
    /**
     * Calculates the current in amps using Ohm's Law
     * @param ohms resistance in ohms
     * @param volts voltage in volts
     * @return  calculated amps
     */
    public static double getAmps(double ohms, double volts){
        return volts/ohms;
    }

    /**
     * Calculates the voltage in volts using Ohm's law
     * @param ohms resistance in ohms
     * @param amps current in amps
     * @return calculated volts
     */
    public static double getVolts(double amps, double ohms){
        return amps * ohms;
    }

    /**
     * Calculates the resistance in Ohms using Ohm's Law
     * @param volts voltage in volts
     * @param amps current in amps
     * @return calculated Ohms
     */
    public static double getOhms(double amps, double volts){
        return volts/amps;
    }
}
