package com.nicolasmoraes.learnjava.javacore.Uregex.test;

// Classes Utilitárias - Regex pt 01 - Pattern e Matcher

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
       // String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  "+texto2); // abaaba
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: "+regex); // ab
        System.out.println("Posições encontradas!");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "); // 0 3
        }
    }
}
