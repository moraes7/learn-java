package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.test;

// Padrões de Projeto pt 03 - Singleton pt 01 - Eager Initialization

import com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;
import com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEager.getINSTANCE());
//        Aircraft aircraft = new Aircraft("787-900");
//        System.out.println(aircraft.bookSeat(seat));
    }
}
