package edu.northeaststate.cs1.examples;

import java.util.Scanner;

public class InputLoop02 {
    public static void main(String[] args) {
        int numDice, numSides;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num dice: ");
        numDice = scanner.nextInt();

        //while the user enters a value greater than 0
        while(numDice > 0){
            //Ask the user to enter number of side on dice
            System.out.print(" Enter num sides: ");
            numSides = scanner.nextInt();

            //TODO: implement dice roller algorithm here

            //before we loop back, get numDice again to see if we continue
            System.out.print("Enter num dice: ");
            numDice = scanner.nextInt();
        }
    }
}
