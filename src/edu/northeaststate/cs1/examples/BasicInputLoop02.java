package edu.northeaststate.cs1.examples;

import java.util.Scanner;

public class BasicInputLoop02 {
    public static void main(String[] args) {
        int numDice, numSides;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num dice: ");
        numDice = scanner.nextInt();

        while(numDice > 0){
            //the rest of the program
            System.out.print(" Enter num sides: ");
            numSides = scanner.nextInt();


            //before we loop back, get numDice again to see if we continue
            System.out.print("Enter num dice: ");
            numDice = scanner.nextInt();
        }
    }
}
