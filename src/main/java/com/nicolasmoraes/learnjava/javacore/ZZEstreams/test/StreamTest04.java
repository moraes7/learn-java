package com.nicolasmoraes.learnjava.javacore.ZZEstreams.test;

// Streams pt 04 - FlatMap pt 01

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei", "Catarina", "Sandy");
        List<String> developers = List.of("Wiliam", "David", "Harisson");
        List<String> students = List.of("Nicolas", "Gustavo", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
