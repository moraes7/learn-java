package com.nicolasmoraes.learnjava.basics;

import java.util.ArrayList;
import java.util.Objects;

public class Arrays {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ' '
        // boolean =  false
        // String = null

        int[] idades = new int[3];
        idades[0] = 24;
        idades[1] = 34;
        idades[2] = 67;

        for (int i = 0; i < 3; i++) {
            System.out.println(idades[i]);
        }

        String[] nomes = new String[4];
        nomes[0] = "Nicolas";
        nomes[1] = "Maria";
        nomes[2] = "José";
        nomes[3] = "Rafael";

        for (int n = 0; n < nomes.length; n++) {
            System.out.println(nomes[n]);
        }

        int[] numeros = {1,2,3,4,5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // FOREACH
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
