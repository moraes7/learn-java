package com.nicolasmoraes.learnjava.javacore.Ycolecoes.sortLists.test;

// Coleções pt 09 - Sorting lists pt 01

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.sortLists.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("One Piece");
        mangas.add("Dragon Ball");
        mangas.add("Naruto");
        mangas.add("Bleach");
        mangas.add("Monster");

        Collections.sort(mangas);

        List<Integer> anoPublicacao = new ArrayList<>(6);
        anoPublicacao.add(1997);
        anoPublicacao.add(1984);
        anoPublicacao.add(1999);
        anoPublicacao.add(2001);
        anoPublicacao.add(1994);
        
        Collections.sort(anoPublicacao);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(anoPublicacao);

        new Manga(null, null, 0);
    }
}
