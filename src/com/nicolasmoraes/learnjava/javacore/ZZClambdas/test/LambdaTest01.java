package com.nicolasmoraes.learnjava.javacore.ZZClambdas.test;

// Lambdas pt 02 - Consumer

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Goku", "Luffy", "Naruto", "Ichigo");
        List<Integer> integers = List.of(7, 14, 21, 28);
        printList(strings, s -> System.out.println(s));
        printList(integers, i -> System.out.println(i));
    }

    private static <T> void printList(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
