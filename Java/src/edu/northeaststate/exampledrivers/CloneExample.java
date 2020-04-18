package edu.northeaststate.exampledrivers;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

abstract class Person implements Cloneable{
    @Override
    public String toString() {
        return "Person{}";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student extends Person {
    @Override
    public String toString() {
        return "Student{} " + super.toString();
    }

}

class Faculty extends Person {
    @Override
    public String toString() {
        return "Faculty{} " + super.toString();
    }

    public void method(){

    }
}

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student();

        Person t = (Person)s.clone();

        ArrayList<Person> peeps = new ArrayList<>();


        System.out.println(t.equals(s));
        System.out.println(s);
        System.out.println(t);

    }
}
