package edu.northeaststate.cs2.examples.bitset;

import java.util.BitSet;

public class BitSetDriver1 {

    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet(8);
        BitSet bitSet2 = new BitSet(8);

        //.set set the value of the bit at a given index to a boolean value
        bitSet1.set(0, 8, true);

        //cardinality returns the number of 1's set in the set
        int numberOfOnes = bitSet1.cardinality();

        //bitwise operations can be applied to a given bitset like so
        bitSet1.and(bitSet2);

        //get bit a given index
        boolean bool = bitSet1.get(1);

        //set the bit at index 5 to true
        bitSet1.set(5);

        //preforms a !boolean flip on the bit at the given index
        bitSet1.flip(5);
    }
}
