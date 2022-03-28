package edu.northeaststate.cs2.examples.interfaces.time;

public class Day implements Incrementable{
    private int value;

    @Override
    public int increment() {
        value++;
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Day{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
