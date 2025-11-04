package com.nicolasmoraes.learnjava.javacore.Dconstrutores.test;

import com.nicolasmoraes.learnjava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "Shounen", 1129, 1998, "Toei");

        anime.imprime();

    }
}
