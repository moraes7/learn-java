package com.nicolasmoraes.learnjava.javacore.Eblocosinicializacao.test;

import com.nicolasmoraes.learnjava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
