package com.nicolasmoraes.learnjava.javacore.Csobrecargametodos.test;

import com.nicolasmoraes.learnjava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init( "One Piece", "Shounen", 1129, 1998);
        anime.imprime();
    }
}
