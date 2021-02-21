package edu.northeaststate.cs1.examples;

import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            System.out.println(random.nextInt(10));
        }
    }
}
