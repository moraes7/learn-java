package com.nicolasmoraes.learnjava.javacore.Ycolecoes.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("==================================");

        // removendo por index
        List<String> carros = new ArrayList<>();
        carros.add("Uno");
        carros.add("Gol");
        carros.add("Civic");
        System.out.println(carros);

        carros.remove(1);
        System.out.println(carros); // Uno, Civic

        // removendo por objeto (remove através do equals)
        carros.remove("Uno");
        System.out.println(carros); // Civic

        System.out.println("==================================");

        // duas listas de nomes
        List<String> listaNomes1 = new ArrayList<>();
        List<String> listaNomes2 = new ArrayList<>();

        listaNomes1.add("Nicolas");
        listaNomes1.add("Moraes");

        listaNomes2.add("Fulano");
        listaNomes2.add("Ciclano");

        // adicionando todos os valores da lista 2 para a lista 1
        listaNomes1.addAll(listaNomes2);
        System.out.println(listaNomes1); // Nicolas, Moraes, Fulano, Ciclano

    }
}
