package com.nicolasmoraes.learnjava.javacore.ZZEstreams.test;

// Streams pt 09 - Gerando streams pt 01

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        // stream de inteiros
        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        // stream de strings
        Stream.of("Nicolas", "Moraes")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        // stream de arrays
        int[] num = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        // stream com arquivos
        try (Stream<String> javaLines = Files.lines(Paths.get("file.txt"))) {

            javaLines.filter(l -> l.contains("Java")).forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
