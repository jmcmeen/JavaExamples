package edu.northeaststate.drivers;

import java.util.ArrayList;

class Test {
    public String toString(){
        return "HI THERE";
    }
}

public class ArrayListToStringTest{
    public static void main(String[] args) {
        //Relying on ArrayList's toString method, which calls each objects toString
        //Notice in the output the placement of the brackets, created by ArrayList's toString
        ArrayList<Test> tests = new ArrayList<>();

        tests.add(new Test());
        tests.add(new Test());

        System.out.println(tests);

        System.out.println("----------------------------------");

        //Or manually loop through each test in tests ArrayList giving you more control of output
        for(Test t: tests){
            System.out.print(t.toString()); //each test on a line
        }
    }
}


