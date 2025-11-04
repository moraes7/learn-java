package com.nicolasmoraes.learnjava.javacore.Ycolecoes.map.test;

// Coleções pt 19 - Map, HashMap, LinkedHashMap pt 03

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.map.dominio.Consumidor;
import com.nicolasmoraes.learnjava.javacore.Ycolecoes.setHashSet.dominio.Manga3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Nicolas");
        Consumidor consumidor2 = new Consumidor("Moraes");

        Manga3 manga1 = new Manga3(5L, "One Piece", 1997, 0);
        Manga3 manga2 = new Manga3(1L, "Dragon Ball", 1984, 5);
        Manga3 manga3 = new Manga3(4L, "Naruto", 1999, 0);
        Manga3 manga4 = new Manga3(3L, "Bleach", 2001, 2);
        Manga3 manga5 = new Manga3(2L, "Monster", 1994, 0);
        Manga3 manga6 = new Manga3(2L, "Monster", 1994, 0);

        List<Manga3> consumidor1MangaList = List.of(manga1, manga2, manga3);
        List<Manga3> consumidor2MangaList = List.of(manga4, manga5, manga6);
        Map<Consumidor, List<Manga3>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, consumidor1MangaList);
        consumidorMangaMap.put(consumidor2, consumidor1MangaList);

        for (Map.Entry<Consumidor, List<Manga3>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " comprou:");
            for (Manga3 manga : entry.getValue()) {
                System.out.println(manga);
                /*
                Nicolas comprou
                Manga2{id=5, name='One Piece', dataPublicacao=1997, quantidade=0}
                Manga2{id=1, name='Dragon Ball', dataPublicacao=1984, quantidade=5}
                Manga2{id=4, name='Naruto', dataPublicacao=1999, quantidade=0}
                Moraes comprou
                Manga2{id=5, name='One Piece', dataPublicacao=1997, quantidade=0}
                Manga2{id=1, name='Dragon Ball', dataPublicacao=1984, quantidade=5}
                Manga2{id=4, name='Naruto', dataPublicacao=1999, quantidade=0}
                */
            }

        }


    }
}
