package com.nicolasmoraes.learnjava.javacore.Zgenerics.test;

// Generics pt 06 - Métodos Genéricos

import com.nicolasmoraes.learnjava.javacore.Zgenerics.dominio.Barco;
import com.nicolasmoraes.learnjava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        // sem retorno
        criarArrayComUmObjeto(new Barco("Lancha"));
        criarArrayComUmObjeto(new Carro("Ford"));

        // com retorno
        List<Barco> barcoList = ciarArrayComUmObjetoComRetorno(new Barco("Canoa"));
        System.out.println(barcoList);
    }

    // sem retorno
    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }

    // com retorno
    private static <T> List<T> ciarArrayComUmObjetoComRetorno(T t) {
        return List.of(t);
    }
}

