package com.nicolasmoraes.learnjava.javacore.Ycolecoes.binarySearch;

// Coleções pt 12 - Binary Search

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.sortLists.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "One Piece", 1997));
        mangas.add(new Manga(1L, "Dragon Ball", 1984));
        mangas.add(new Manga(4L, "Naruto", 1999));
        mangas.add(new Manga(3L, "Bleach", 2001));
        mangas.add(new Manga(2L, "Monster", 1994));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Dragon Ball", 1984);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
