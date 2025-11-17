package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio;

// Padrões de Projeto pt 03 - Singleton pt 01 - Eager Initialization

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    // Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
