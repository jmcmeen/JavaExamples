package edu.northeaststate.cs1.examples;

import java.util.Scanner;

public class BasicLoop {
    public static void main(String[] args) {
        int numDice, numSides;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Enter num dice: ");
            numDice = scanner.nextInt();

            if(numDice > 0){
                //the rest of the program
                System.out.print(" Enter num sides: ");

                numSides = scanner.nextInt();
            }
        }while(numDice > 0);
    }
}
