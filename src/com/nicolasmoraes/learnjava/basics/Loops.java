package com.nicolasmoraes.learnjava.basics;

import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Nicolas");
        nomes.add("Vanessa");
        nomes.add("Edvaldo");

        // FOR

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // outra forma

        for (String nome : nomes) {
            System.out.println(nome);
        }

        // WHILE

        int contador = 0;
        while (contador < 5) {
            System.out.println("Loop em while");
            contador++;
        }
    }

}
