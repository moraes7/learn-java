package com.nicolasmoraes.learnjava.javacore.ZZClambdas.test;

// Method Reference pt 03 - Referência a construtor

import com.nicolasmoraes.learnjava.javacore.ZZClambdas.dominio.Anime;
import com.nicolasmoraes.learnjava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bleach", 2001), new Anime("Dragon Ball", 1984), new Anime("One Piece", 1997)));

        animeList.sort(animeComparators::compareByReleaseYearNonStatic);
        System.out.println(animeList);

        //BiFunction<String, Integer, Anime> animeBiFunction = (title, release) -> new Anime(title, release);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Jujutsu Kaisen", 2020));

    }
}
