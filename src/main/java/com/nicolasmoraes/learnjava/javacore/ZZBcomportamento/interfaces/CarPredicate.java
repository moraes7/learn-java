package com.nicolasmoraes.learnjava.javacore.ZZBcomportamento.interfaces;

// Parametrizando comportamentos pt 02

import com.nicolasmoraes.learnjava.javacore.ZZBcomportamento.dominio.Car;

public interface CarPredicate {
    boolean test(Car car);
}
