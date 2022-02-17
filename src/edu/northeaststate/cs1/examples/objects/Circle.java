package edu.northeaststate.cs1.examples.objects;

public class Circle {
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
