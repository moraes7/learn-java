package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.test;

// Padrões de Projeto pt 03 - Singleton pt 01 - Eager Initialization

import com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;
import com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEager.getINSTANCE()); // true
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraftSingletonEager.bookSeat(seat)); // false
    }
}
