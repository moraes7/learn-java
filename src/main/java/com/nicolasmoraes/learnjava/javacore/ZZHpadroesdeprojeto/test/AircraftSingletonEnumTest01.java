package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.test;

// Padrões de Projeto pt 05 - Singleton pt 03 - Singleton with enumeration

import com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A"); // true
        bookSeat("1A"); // false
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
