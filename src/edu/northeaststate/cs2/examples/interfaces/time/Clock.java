package edu.northeaststate.cs2.examples.interfaces.time;

public class Clock {
    private Second second;
    private Minute minute;
    private Hour hour;
    private Day day;

    public Clock() {
        this.second = new Second();
        this.minute = new Minute();
        this.hour = new Hour();
        this.day = new Day();
    }

    public void tick(){
        if(second.increment() == 1){
            if(minute.increment() == 1){
                if(hour.increment() == 1){
                    day.increment();
                }
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clock{");
        sb.append("second=").append(second);
        sb.append(", minute=").append(minute);
        sb.append(", hour=").append(hour);
        sb.append(", day=").append(day);
        sb.append('}');
        return sb.toString();
    }
}
