package com.nicolasmoraes.learnjava.javacore.Ycolecoes.sortLists.test;

// Coleções pt 11 - Sorting lists pt 02 - Comparable

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.sortLists.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "One Piece", 1997));
        mangas.add(new Manga(1L, "Dragon Ball", 1984));
        mangas.add(new Manga(4L, "Naruto", 1999));
        mangas.add(new Manga(3L, "Bleach", 2001));
        mangas.add(new Manga(2L, "Monster", 1994));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-------------------------------------------------------");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-------------------------------------------------------");

        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
