package com.nicolasmoraes.learnjava.javacore.ZZClambdas.test;

// Method Reference pt 02 - Referência a métodos não estáticos

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Goku", "Luffy", "Ichigo"));
        list.sort(String::compareTo);
        System.out.println(list);

        // transformando um numero em string usando method reference
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        // verificando se tem um elemento dentro de uma lista
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Goku"));
    }
}
