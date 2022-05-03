package edu.northeaststate.cs2.examples.runnable; /**
 * -------------------------------
 * File name: IntegerComparator.java
 * Created By: Matthew Hamilton
 * Email: mhamilt5@stumail.northeaststate.edu
 * --------------------------------
 */
import java.util.Comparator;

/**
 * Class Name: IntegerComparator
 * Purpose: used to sort an integer array list
 */
public class IntegerComparator implements Comparator<Integer> {

    /**
     * Method Name: compare
     * Method Description: required method for comparator.
     * @param o1
     * @param o2
     * @return int: an integer representing the result of the comparison
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
