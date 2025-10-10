package com.nicolasmoraes.learnjava.javacore.ZZEstreams.test;

// Streams pt 05 - FlatMap pt 02

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        List<String> letters = words.stream()
                .map(w -> w.split("")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());

        System.out.println(letters);
    }
}
