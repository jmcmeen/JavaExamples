/**
 * -------------------------------------------------
 * File name: OhmsLawHelper.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.electricity.statichelper;

/**
 * Class Name: OhmsLawHelper
 * Purpose: Class that provides static methods to perform various calculations using Ohm's Law
 */
public class OhmsLawHelper {
    /**
     * Method Name: getAmps
     * Method Description: Calculates the current in amps using Ohm's Law
     * @param ohms resistance in ohms
     * @param volts voltage in volts
     * @return double
     */
    public static double getAmps(double ohms, double volts){
        return volts/ohms;
    }

    /**
     * Method Name: getVolts
     * Method Description: Calculates the voltage in volts using Ohm's law
     * @param ohms resistance in ohms
     * @param amps current in amps
     * @return double
     */
    public static double getVolts(double amps, double ohms){
        return amps * ohms;
    }

    /**
     * Method Name: getOhms
     * Method Description: Calculates the resistance in Ohms using Ohm's Law
     * @param volts voltage in volts
     * @param amps current in amps
     * @return double
     */
    public static double getOhms(double amps, double volts){
        return volts/amps;
    }
}
