package com.nicolasmoraes.learnjava.javacore.Ycolecoes.map.test;

// Coleções pt 19 - Map, HashMap, LinkedHashMap pt 02

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.map.dominio.Consumidor;
import com.nicolasmoraes.learnjava.javacore.Ycolecoes.setHashSet.dominio.Manga3;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Nicolas");
        Consumidor consumidor2 = new Consumidor("Moraes");

        Manga3 manga1 = new Manga3(5L, "One Piece", 1997, 0);
        Manga3 manga2 = new Manga3(1L, "Dragon Ball", 1984, 5);
        Manga3 manga3 = new Manga3(4L, "Naruto", 1999, 0);
        Manga3 manga4 = new Manga3(3L, "Bleach", 2001, 2);
        Manga3 manga5 = new Manga3(2L, "Monster", 1994, 0);
        Manga3 manga6 = new Manga3(2L, "Monster", 1994, 0);

        Map<Consumidor, Manga3> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga2);
        consumidorManga.put(consumidor2, manga1);

        for (Map.Entry<Consumidor, Manga3> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getName()+ " comprou "+entry.getValue().getName());
            /* Nicolas comprou Dragon Ball
            Moraes comprou One Piece */
        }

    }
}
