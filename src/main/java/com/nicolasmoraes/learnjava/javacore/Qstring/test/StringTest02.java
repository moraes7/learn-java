package com.nicolasmoraes.learnjava.javacore.Qstring.test;

// Classes Utilitárias - Strings pt 02

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        System.out.println(nome.charAt(0)); // Retorna 'L'
        System.out.println(nome.length()); // Retorna 5
        System.out.println(nome.replace("f", "l")); // Retorna Lully
        System.out.println(nome.toUpperCase()); // Retorna 'LUFFY'
        System.out.println(nome.toLowerCase()); // Retorna 'luffy'

        String nome2 = "          Goku         ";
        System.out.println(nome2.trim()); // Retorna 'Goku'

        String numeros = "012345";
        System.out.println(numeros.length()); // Retorna '6'
        System.out.println(numeros.substring(0, 2)); // Retorna '01'
        System.out.println(numeros.substring(3)); // Retorna '345'
    }
}
