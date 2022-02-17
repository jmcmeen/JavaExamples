package edu.northeaststate.cs1.examples.objects;

public class CircleDriver {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        //Circle c2 = new Circle(5.0);

        c1.setRadius(23.1);
       // c2.setRadius(32.5);

        System.out.println("c1 radius = " + c1.getRadius());
        System.out.println("c1 area = " + c1.calculateArea());



    }
}

