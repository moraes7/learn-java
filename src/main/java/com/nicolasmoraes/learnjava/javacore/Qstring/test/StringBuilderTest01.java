package com.nicolasmoraes.learnjava.javacore.Qstring.test;

// Classes Utilitárias - Strings pt 04 - StringBuilder

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Nicolas";
        nome.concat(" Moraes");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Nicolas");
        sb.append(" Moraes").append(" Palmeirense");
        sb.reverse(); // esneriemlaP searoM salociN
        sb.reverse(); // esneriemlaP searoM salociN
        sb.delete(0, 3); // olas Moraes Palmeirense
        System.out.println(sb);
    }
}
