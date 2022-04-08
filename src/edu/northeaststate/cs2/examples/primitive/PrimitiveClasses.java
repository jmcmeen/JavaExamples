package edu.northeaststate.cs2.examples.primitive;

public class PrimitiveClasses {
    public static void main(String[] args) {
        boolean b = true;
        Boolean c = true;

        c.compareTo(c);

        Boolean.compare(b, b);
        System.out.println(b + "\n");
    }
}
