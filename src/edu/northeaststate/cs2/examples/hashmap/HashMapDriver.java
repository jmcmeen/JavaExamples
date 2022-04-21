package edu.northeaststate.cs2.examples.hashmap;

import edu.northeaststate.cs1.labs.lab15.RegularPolygon;

import java.util.HashMap;

public class HashMapDriver {
    public static void main(String[] args) {
        HashMap<Integer, RegularPolygon> map = new HashMap<>();

        map.put(1, new RegularPolygon(3,5));
        map.put(435, new RegularPolygon(2,4));
        map.put(87, new RegularPolygon(6,87));
        map.put(-1, new RegularPolygon(36,6));

        RegularPolygon r = map.get(5);

        System.out.println(r.toString());


    }
}
