package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio;

// Padrões de Projeto pt 03 - Singleton pt 01 - Eager Initialization

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public String getName() {
        return name;
    }
}
