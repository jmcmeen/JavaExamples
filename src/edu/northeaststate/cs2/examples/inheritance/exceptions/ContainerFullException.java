package edu.northeaststate.cs2.examples.inheritance.exceptions;

public class ContainerFullException extends Exception {
    public ContainerFullException() {
        super("This container is full.");
    }
}
