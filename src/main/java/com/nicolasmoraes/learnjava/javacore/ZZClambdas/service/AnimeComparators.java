package com.nicolasmoraes.learnjava.javacore.ZZClambdas.service;

// Method Reference pt 01 - Referência a métodos estáticos

import com.nicolasmoraes.learnjava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTile(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByReleaseYear(Anime a1, Anime a2) {
        return Integer.compare(a1.getYearOfRelease(), a2.getYearOfRelease());
    }

    // Method Reference pt 02 - Referência a métodos não estáticos
    public int compareByReleaseYearNonStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getYearOfRelease(), a2.getYearOfRelease());
    }


}
