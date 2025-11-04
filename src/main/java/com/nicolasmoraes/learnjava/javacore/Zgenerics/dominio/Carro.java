package com.nicolasmoraes.learnjava.javacore.Zgenerics.dominio;

// Generics pt 05 - Classes Genéricas pt 01, pt 02

public class Carro {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
