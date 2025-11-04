package com.nicolasmoraes.learnjava.javacore.ZZEstreams.test;

// Streams pt 11 - Collectors pt 01 Summarizing

import com.nicolasmoraes.learnjava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        // QUANTIDADE DE LIGHT NOVEL
        // sem usar collectors
        System.out.println(lightNovels.stream().count());
        // usando collectors
        System.out.println(lightNovels.stream().collect(Collectors.counting()));


        // LIGHT NOVEL COM O MAIOR PREÇO
        // sem usar collectors
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        // usando collectors
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);


        // SOMANDO OS PREÇOS DAS LIGHT NOVEL
        // sem usar collectors
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        // usando collectors
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));


        // MÉDIA ARITMÉTICA DAS LIGHT NOVEL
        // sem usar collectors
        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        // usando collectors
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));


        // COLETANDO TODAS AS INFORMAÇÕES DOS CÓDIGOS ANTERIORES EM UMA ÚNICA LINHA DE CÓDIGO
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect); // DoubleSummaryStatistics{count=7, sum=40,940000, min=1,990000, average=5,848571, max=10,990000}

        // IMPRIMINDO OS TÍTULOS DAS LIGHT NOVEL SEPARADOS POR VÍRGULA
        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles); // Tensei Shittara, Overlord, Violet Envergarden, No Game no Life, Fullmetal Alchemist, Kumo Desuga, Monogatari
    }
}
