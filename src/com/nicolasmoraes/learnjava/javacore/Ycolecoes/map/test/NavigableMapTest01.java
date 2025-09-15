package com.nicolasmoraes.learnjava.javacore.Ycolecoes.map.test;

// Coleções pt 21 - NavigableMap, TreeMap

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
            /*A - Letra A
              B - Letra B
              C - Letra C
              D - Letra D
              E - Letra E*/
        }

        System.out.println(map.headMap("C", true)); // A=Letra A, B=Letra B, C=Letra C
        System.out.println(map.ceilingKey("C")); // C
        System.out.println(map.higherKey("C")); // D
        System.out.println(map.lowerKey("C")); // B
        System.out.println(map.floorKey("C")); // C
    }
}
