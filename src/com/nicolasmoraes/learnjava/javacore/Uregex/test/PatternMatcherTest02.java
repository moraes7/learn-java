package com.nicolasmoraes.learnjava.javacore.Uregex.test;

// Classes Utilitárias - Regex pt 02 - Pattern e Matcher - Meta caracteres

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        // \d = todos os digitos
        // \D = tudo o que não for digito (ele também traz caracteres especiais como por exemplo @, # etc)
        // \s = todos os espaços em branco (espaços branco em java = \t \n \f \r)
        // \S = todos os caracteres excluindo os brancos
        // \w = todas as letras a-ZA-Z, todos os digitos e underscore _ (exclui caracteres especiais)
        // \W = tudo o que não for incluso no \w

        String regex = "\\W";
        String texto = "@#hdk_ash12 1\thksda42";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posições encontradas!");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n"); // (0-@), (1-#),(11),(13)
        }
    }
}
