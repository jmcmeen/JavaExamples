package edu.northeaststate.cs2.examples.designpatterns.singleton.locking;

// Double Checked Locking based Java implementation of
// singleton design pattern
class Singleton {
    private volatile static Singleton obj;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (obj == null) {
            // To make thread safe
            synchronized (Singleton.class) {
                // check again as multiple threads
                // can reach above step
                if (obj == null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
}