package com.nicolasmoraes.learnjava.javacore.Zgenerics;

// Generics pt 02 - Wildcard pt 01 e pt 02

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> listaAnimals = new ArrayList<>();
        printConsultaAnimal(listaAnimals);
    }

    // pode receber Animal ou qualquer um que seja filho
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    // pode receber Animal ou qualquer um que seja pai
    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}


