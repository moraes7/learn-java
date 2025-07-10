package com.nicolasmoraes.learnjava.javacore.Qstring.test;

// Classes Utilitárias - Strings pt 01

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Nicolas"; // String constant pool
        String nome2 = "Nicolas";

        nome = nome.concat(" Moraes"); // nome += " Moraes"
        System.out.println(nome);
        System.out.println(nome == nome2); // false

        String nome3 = new String("Nicolas"); // variavel de referencia, objeto do tipo String, string no pool de string
        System.out.println(nome2 == nome3); // false
        System.out.println(nome2 == nome3.intern()); // true
    }
}
