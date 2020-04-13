package edu.northeaststate.designpatterns.singleton.synchronize;

// Thread Synchronized Java implementation of
// singleton design pattern
class Singleton {
    private static Singleton obj;

    private Singleton() {
    }

    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance() {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }
}