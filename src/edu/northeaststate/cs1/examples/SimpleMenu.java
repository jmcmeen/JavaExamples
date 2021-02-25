package edu.northeaststate.cs1.examples;

import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String choice;

        printMenu();
        choice = s.nextLine();

        while(!choice.equals("3")){
            if(choice.equals("1")){
                option1();
            }else if(choice.equals("2")){
                option2();
            }
            printMenu();
            choice = s.nextLine();
        }
    }

    public static void printMenu(){
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Exit");
    }
    public static void option1(){
        System.out.println("You picked option 1");
    }
    public static void option2(){
        System.out.println("You picked option 2");
    }
}
