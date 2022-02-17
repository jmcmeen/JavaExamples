/**
 * -------------------------------------------------
 * File name: ObjectLabs.java
 * Project name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import edu.northeaststate.cs1.labs.lab15.RegularPolygon;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class ObjectsLab {
    public static void main(String[] args) {
        //Demonstrate static helper class String
        double value = 001.925374982;
        System.out.println( String.format("%.2f", value) );

        //Demonstrate DecimalFormat
        DecimalFormat dc = new DecimalFormat("##.##");
        System.out.println( dc.format(value) );

        //Demonstrate static helper class Math
        //System.out.println(Math.random());

        //Demonstrate Random
        Random random = new Random();
        //System.out.println(random.nextDouble());

        //Demonstrate StringBuilder (instead of concatenation)
        StringBuilder sb = new StringBuilder("Woah!   ");
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb.toString());
        System.out.println(sb);

        //Demonstrate ArrayList
        int x = 3;
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        myArrayList.add(42);
        myArrayList.add(117);
        myArrayList.add(343);

        for (int i = 0; i < 100; i++) {
            myArrayList.add(new Random().nextInt());
        }

        myArrayList.remove(0);

        myArrayList.set(102, 100);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("The value at " + i + " is " + myArrayList.get(i));
        }

        for(Integer myInt: myArrayList){
            System.out.println(myInt);
        }
    }
}
