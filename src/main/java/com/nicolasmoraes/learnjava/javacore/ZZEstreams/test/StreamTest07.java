package com.nicolasmoraes.learnjava.javacore.ZZEstreams.test;

// Streams pt 07 - Reduce pt 01

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        // somando todos os números
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println); // 21
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y)); // 21

        // mesmo exemplo de cima com method reference
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println); // 21
        System.out.println(integers.stream().reduce(0, Integer::sum)); // 21

        System.out.println("-------------------------------------------------");

        // multiplicando todos os números
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println); // 720
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y)); // 720

        System.out.println("-------------------------------------------------");

        // trazer o maior número de uma lista
        // 1ª forma
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println); // 6
        // 2ª forma
        System.out.println(integers.stream().reduce(0, Integer::max)); // 6
    }
}
