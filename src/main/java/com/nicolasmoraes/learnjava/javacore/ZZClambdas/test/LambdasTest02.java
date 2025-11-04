package com.nicolasmoraes.learnjava.javacore.ZZClambdas.test;

// Lambdas pt 03 - Function

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Nicolas", "Moraes");
        List<String> map = map(strings, s -> s.toUpperCase());
        List<Integer> integers = map(strings, s -> s.length());
        System.out.println(map);
        System.out.println(integers);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
