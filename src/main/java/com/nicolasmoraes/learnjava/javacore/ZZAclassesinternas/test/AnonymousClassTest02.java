package com.nicolasmoraes.learnjava.javacore.ZZAclassesinternas.test;

// Classes Internas pt 03 - Classes Anônimas

import com.nicolasmoraes.learnjava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getTipo().compareTo(o2.getTipo());
            }
        });
        System.out.println(barcoList);
    }
}
