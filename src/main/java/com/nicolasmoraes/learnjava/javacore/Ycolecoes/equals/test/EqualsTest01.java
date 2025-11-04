package com.nicolasmoraes.learnjava.javacore.Ycolecoes.equals.test;

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.equals.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        // Coleções pt 01 - equals pt 01

        String nome1 = "Nicolas Moraes";
        String nome2 = "Nicolas Moraes";
        System.out.println(nome1.equals(nome2)); // true

        // =====================================================================================

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2)); // true


    }
}
