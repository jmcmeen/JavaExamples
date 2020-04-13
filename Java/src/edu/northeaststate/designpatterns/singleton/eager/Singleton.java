package edu.northeaststate.designpatterns.singleton.eager;

// Static initializer based Java implementation of
// singleton design pattern
class Singleton {
    private static Singleton obj = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return obj;
    }
}
