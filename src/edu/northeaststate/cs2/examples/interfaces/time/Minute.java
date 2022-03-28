package edu.northeaststate.cs2.examples.interfaces.time;

public class Minute implements Incrementable{
    private int value;

    @Override
    public int increment() {
        if(this.value == 59){
            this.value = 0;
            return 1; //return the number of hours to increment
        }else{
            this.value++;
            return 0;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Minute{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
