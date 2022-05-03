/**
 * -------------------------------------------------
 * File name: BitSetExample.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: Brayden Bartley
 *                 John McMeen
 * Email: bbartle2@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.bitset;

import java.util.BitSet;
/**
 * Class Name: BitSetExample
 * Purpose: Shows off bitset and its methods
 */
public class BitSetDriver2 {
    /**
     * Method Name: main
     * Method Description: Entry point for the application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(8);
        BitSet bitSet1 = new BitSet(8);
        BitSet bitSet2 = new BitSet(16);

        //sets the bits in the array using a for loop
        setTheBit(bitSet,8);
        setTheBit(bitSet1,7);
        setTheBit(bitSet2,8);


        //prints the original pattern in the bit set
        System.out.println("Original array for bitSet: " + bitSet);
        System.out.println("Original array for bitSet1: " + bitSet1);
        System.out.println("Original array for bitSet2: " + bitSet2);
        System.out.println();

        //checks if bitSet and bitSet1 are equal
        System.out.println("Is bitSet equal to bitSet1: " + bitSet.equals(bitSet1));
        System.out.println("Is bitSet equal to bitSet2: " + bitSet.equals(bitSet2));
        System.out.println();

        //prints the number of set bits in the bit set
        System.out.println("Number of set bits in bitSet: " + bitSet.cardinality());
        System.out.println("Number of set bits in bitSet1: " + bitSet1.cardinality());
        System.out.println();


        //andNot method compares the bitSet arrays then sets the array to the output.
        bitSet.andNot(bitSet1);
        System.out.println("bitSet and not bitSet1: " + bitSet);
        setTheBit(bitSet,8);

        //and method compares the bitSet arrays then sets the array to the output
        bitSet.and(bitSet1);
        System.out.println("bitSet and bitSet1: " + bitSet);
        setTheBit(bitSet,8);

        //or method the bitSet arrays then sets the array to the output
        bitSet.or(bitSet1);
        System.out.println("bitSet or bitSet1: " + bitSet);
        setTheBit(bitSet,8);
    }
    /**
     * Method Name: setTheBit
     * Method Description: sets the bits in the bitset array
     * @param bitset
     * @param num
     */
    public static BitSet setTheBit(BitSet bitset,int num){
        for (int i = 1; i <= num; i++) {
            bitset.set(i);
        }

        return bitset;
    }
}

