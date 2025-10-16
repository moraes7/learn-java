package com.nicolasmoraes.learnjava.javacore.ZZEstreams.test;

// Streams pt 06 - Finding and Matching

import com.nicolasmoraes.learnjava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Envergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        // tem alguma light novel com o preço maior que 9?
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9)); // false

        // todas as light novel tem o preço maior que 0?
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); // true


        // nenhuma light novel tem o preço menor que 0?
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0)); // true

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        // recomendação do intellij com o mesmo exemplo de cima
        // utilizando max no lugar de findFirst
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

    }
}
