package com.nicolasmoraes.learnjava.javacore.Ycolecoes.list;

// Coleções pt 06 - List pt 01

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Nicolas");
        nomes.add("Moraes");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Nicolas Moraes");
        System.out.println("=========================");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
