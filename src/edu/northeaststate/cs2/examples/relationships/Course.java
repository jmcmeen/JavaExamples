/**
 * -------------------------------------------------
 * File Name: Course.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.relationships;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students;

    public Course() {
        students = new ArrayList<>();
    }
}
