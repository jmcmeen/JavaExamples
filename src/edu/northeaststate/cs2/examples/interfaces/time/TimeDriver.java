package edu.northeaststate.cs2.examples.interfaces.time;

public class TimeDriver {
    public static void main(String[] args) {
        Clock clock = new Clock();

        for(int i=0; i < 86400; i++){
            clock.tick();
            System.out.println(clock);
        }
    }
}
