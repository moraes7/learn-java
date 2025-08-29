package com.nicolasmoraes.learnjava.javacore.Ycolecoes.list;

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.equals.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1AA1", "iPhone");
        Smartphone s2 = new Smartphone("2BB2", "Samsung");
        Smartphone s3 = new Smartphone("3CC3", "Motorola");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3); // indexando na posiçao 0

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("3CC3", "Motorola");

        System.out.println(smartphones.contains(s4)); // true
        int indexS4 = smartphones.indexOf(s4);
        System.out.println(indexS4); // 0
        System.out.println(smartphones.get(indexS4)); // Smartphone{serialNumber='3CC3', marca='Motorola'}


    }
}
