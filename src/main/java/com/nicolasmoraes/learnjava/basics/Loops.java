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
        int contador = 12;
        while (contador < 5) {
            System.out.println("Loop em while");
            contador++;
        }

        // DO WHILE = executa pelo menos uma vez mesmo a condição sendo false
        int count = 12;
        do {
            System.out.println("dentro do do-while");
        } while (count < 10 );

        // BREAK
        // Imprimir os primeiros 25 números de 50
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if(i > 25) {
                break;
            }
            System.out.println(i);

        }
        
    }

}
