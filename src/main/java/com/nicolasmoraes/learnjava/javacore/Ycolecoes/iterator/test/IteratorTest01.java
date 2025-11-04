package com.nicolasmoraes.learnjava.javacore.Ycolecoes.iterator.test;

// Coleções pt 14 - Iterator

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.iterator.dominio.Manga2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga2> mangas = new ArrayList<>(6);
        mangas.add(new Manga2(5L, "One Piece", 1997, 0));
        mangas.add(new Manga2(1L, "Dragon Ball", 1984, 5));
        mangas.add(new Manga2(4L, "Naruto", 1999, 0));
        mangas.add(new Manga2(3L, "Bleach", 2001, 2));
        mangas.add(new Manga2(2L, "Monster", 1994, 0));

        // metodo antigo
        /*
        Iterator<Manga2> manga2Iterator = mangas.iterator();
        while (manga2Iterator.hasNext()) {
            if (manga2Iterator.next().getQuantidade() == 0) {
                manga2Iterator.remove();
            }
        }
        */

        // metodo moderno
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
