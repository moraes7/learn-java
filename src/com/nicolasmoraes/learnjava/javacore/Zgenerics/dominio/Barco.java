package com.nicolasmoraes.learnjava.javacore.Zgenerics.dominio;

// Generics pt 05 - Classes Genéricas pt 01, pt 02

public class Barco {
    private String tipo;

    public Barco(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
