package com.nicolasmoraes.learnjava.javacore.Ycolecoes.queue;

// Coleções pt 22 - Queue, PriorityQueue

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
            /*A
              B
              C*/
        }
    }
}
