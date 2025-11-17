package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio;

// Padrões de Projeto pt 05 - Singleton pt 03 - Singleton with enumeration

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeats;

    AircraftSingletonEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("1A");
        this.availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
