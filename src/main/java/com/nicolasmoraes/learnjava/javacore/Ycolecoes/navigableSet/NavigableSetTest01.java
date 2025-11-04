package com.nicolasmoraes.learnjava.javacore.Ycolecoes.navigableSet;

// Coleções pt 16 - NavigableSet, TreeSet pt 01, pt 02

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.equals.dominio.Smartphone;
import com.nicolasmoraes.learnjava.javacore.Ycolecoes.setHashSet.dominio.Manga3;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaDataComparator implements Comparator<Manga3> {

    @Override
    public int compare(Manga3 o1, Manga3 o2) {
        return Integer.compare(o1.getDataPublicacao(), o2.getDataPublicacao()) ;
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("102003", "Apple");
        set.add(smartphone);
        System.out.println(smartphone);

        System.out.println("------------------------------");

        NavigableSet<Manga3> mangas = new TreeSet<>(new MangaDataComparator());
        mangas.add(new Manga3(5L, "One Piece", 1997, 0));
        mangas.add(new Manga3(1L, "Dragon Ball", 1984, 5));
        mangas.add(new Manga3(4L, "Naruto", 1999, 0));
        mangas.add(new Manga3(3L, "Bleach", 2001, 2));
        mangas.add(new Manga3(2L, "Monster", 1994, 0));
        mangas.add(new Manga3(2L, "Monster", 1994, 0));

        for (Manga3 manga : mangas) {
            System.out.println(manga);
        }

        Manga3 digimon = new Manga3(13L, "Digimon", 1997, 10);
        System.out.println("------------------------------");

        // ------ METODOS ------

        // lower <
        System.out.println(mangas.lower(digimon)); // Monster

        // floor <=
        System.out.println(mangas.floor(digimon)); // One Piece

        // higher >
        System.out.println(mangas.higher(digimon)); // Naruto

        // ceiling >=
        System.out.println(mangas.ceiling(digimon)); // One Piece

        System.out.println("------------------------------");

        System.out.println(mangas.size()); // 5
        // retorna e remove o primeiro elemento da lista
        System.out.println(mangas.pollFirst()); // Dragon Ball
        System.out.println(mangas.size()); // 4

        // retorna e remove o ultimo elemento da lista
        System.out.println(mangas.pollLast()); // Bleach
    }
}
