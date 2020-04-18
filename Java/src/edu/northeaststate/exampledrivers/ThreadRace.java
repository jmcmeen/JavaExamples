package edu.northeaststate.exampledrivers;

class StringConcatThread implements Runnable {
    public void run() {
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i <100000; i++) {
            s+= "Don't Panic";
        }
        long finish = System.nanoTime();
        System.out.println ("Thread String Concat finished in " + (finish - start) + " ns");
    }
}

class StringBuilderThread implements Runnable {
    public void run() {
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <100000; i++) {
            sb.append("Don't Panic");
        }
        long finish = System.nanoTime();
        System.out.println ("Thread String Builder finished in " + (finish - start) + " ns");
    }
}

public class ThreadRace {
    public static void main(String[] args) {
        Thread object = new Thread(new StringConcatThread());
        object.start();

        object = new Thread(new StringBuilderThread());
        object.start();
    }
}
