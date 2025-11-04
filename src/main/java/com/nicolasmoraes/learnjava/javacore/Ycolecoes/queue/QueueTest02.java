package com.nicolasmoraes.learnjava.javacore.Ycolecoes.queue;

// Coleções pt 22 - Queue, PriorityQueue

import com.nicolasmoraes.learnjava.javacore.Ycolecoes.setHashSet.dominio.Manga3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MangaDataComparator implements Comparator<Manga3> {

    @Override
    public int compare(Manga3 o1, Manga3 o2) {
        return Integer.compare(o1.getDataPublicacao(), o2.getDataPublicacao()) ;
    }
}

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga3> mangas = new PriorityQueue<>(new MangaDataComparator().reversed());
        mangas.add(new Manga3(5L, "One Piece", 1997, 0));
        mangas.add(new Manga3(1L, "Dragon Ball", 1984, 5));
        mangas.add(new Manga3(4L, "Naruto", 1999, 0));
        mangas.add(new Manga3(3L, "Bleach", 2001, 2));
        mangas.add(new Manga3(2L, "Monster", 1994, 0));
        mangas.add(new Manga3(2L, "Monster", 1994, 0));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
