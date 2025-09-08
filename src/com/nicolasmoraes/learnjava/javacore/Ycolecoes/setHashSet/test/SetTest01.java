package com.nicolasmoraes.learnjava.javacore.Ycolecoes.setHashSet.test;

// Coleções pt 15 - Set, HashSet

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.setHashSet.dominio.Manga3;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga3> mangas = new HashSet<>();
        mangas.add(new Manga3(5L, "One Piece", 1997, 0));
        mangas.add(new Manga3(1L, "Dragon Ball", 1984, 5));
        mangas.add(new Manga3(4L, "Naruto", 1999, 0));
        mangas.add(new Manga3(3L, "Bleach", 2001, 2));
        mangas.add(new Manga3(2L, "Monster", 1994, 0));
        mangas.add(new Manga3(2L, "Monster", 1994, 0));

        for (Manga3 manga : mangas) {
            System.out.println(manga);
        }
    }
}
