package edu.northeaststate.cs1.examples;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();

        intArrayList.add(42);
        intArrayList.add(343);
        intArrayList.add(117);

        for (int i = 0; i < 1000000000; i++) {
           intArrayList.add(new Random().nextInt());
        }

        //ArrayList with for i loop
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println("The value at index " + i + "  is " + intArrayList.get(i));
        }

        intArrayList.remove(2);

        //ArrayList with the for each loop
        for (Integer myInteger: intArrayList) {
            System.out.println(myInteger);
        }

    }
}
