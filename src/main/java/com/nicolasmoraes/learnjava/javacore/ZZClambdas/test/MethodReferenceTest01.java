package com.nicolasmoraes.learnjava.javacore.ZZClambdas.test;

// Method Reference pt 01 - Referência a métodos estáticos

import com.nicolasmoraes.learnjava.javacore.ZZClambdas.dominio.Anime;
import com.nicolasmoraes.learnjava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball", 1984), new Anime("One Piece", 1997), new Anime("Bleach", 2001)));
        //Collections.sort(animeList,AnimeComparators::compareByTile);
        animeList.sort(AnimeComparators::compareByTile);
        animeList.sort(AnimeComparators::compareByReleaseYear);
        System.out.println(animeList);

    }
}
