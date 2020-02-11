package edu.northeaststate.drivers;

public class ReferenceExample01 {
    public static void main(String[] args){
        //Create an int
        int a = 42;

        System.out.println("a = " + a);

        //Integers are primitive types, a and b reference two memory locations
        int b = a;

        System.out.println("b = " + b);

        a = a -5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


