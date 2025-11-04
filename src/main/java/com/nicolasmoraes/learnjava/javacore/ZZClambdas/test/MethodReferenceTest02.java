package com.nicolasmoraes.learnjava.javacore.ZZClambdas.test;

// Method Reference pt 02 - Referência a métodos não estáticos

import com.nicolasmoraes.learnjava.javacore.ZZClambdas.dominio.Anime;
import com.nicolasmoraes.learnjava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bleach", 2001), new Anime("Dragon Ball", 1984), new Anime("One Piece", 1997)));
        //animeList.sort((a1, a2) -> animeComparators.compareByReleaseYearNonStatic(a1, a2));
        animeList.sort(animeComparators::compareByReleaseYearNonStatic);
        System.out.println(animeList);

    }
}
