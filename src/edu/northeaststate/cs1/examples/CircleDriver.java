package edu.northeaststate.cs1.examples;

public class CircleDriver {
    public static void main(String[] args) {
        //using default constructor to create Circle
        Circle circle1 = new Circle();
        System.out.print("\ncircle1 radius = " + String.format("%.2f", circle1.getRadius() ) );
        System.out.print(" area = " + String.format("%.2f",circle1.calculateArea()) );
        System.out.print(" circumference = " + String.format("%.2f",circle1.calculateCircumference()));

        //using default constructor to create Circle
        Circle circle2 = new Circle(5);
        System.out.print("\n\ncircle2 radius = " + String.format("%.2f", circle2.getRadius() ) );
        System.out.print(" area = " + String.format("%.2f",circle2.calculateArea()) );
        System.out.print(" circumference = " + String.format("%.2f",circle2.calculateCircumference()));

        System.out.println();

        //Use default constructor to make a Circle
        Circle circle3 = new Circle();
        //loop i - 0 through 100, set Circle radius to i
        for (int i = 0; i <= 100; i++) {
            circle3.setRadius(i);
            System.out.print("\ncircle3 radius = " + String.format("%.2f", circle3.getRadius() ) );
            System.out.print(" area = " + String.format("%.2f", circle3.calculateArea()) );
            System.out.print(" circumference = " + String.format("%.2f", circle3.calculateCircumference()));
        }

        //loop i - 99 through 0, set Circle radius to i
        for (int i = 99; i >=0; i--) {
            circle3.setRadius(i);
            System.out.print("\ncircle3 radius = " + String.format("%.2f", circle3.getRadius() ) );
            System.out.print(" area = " + String.format("%.2f", circle3.calculateArea()) );
            System.out.print(" circumference = " + String.format("%.2f", circle3.calculateCircumference()));
        }
    }
}
class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double calculateCircumference() {
        return 2 * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
