package com.nicolasmoraes.learnjava.javacore.Uregex;

// Classes Utilitárias - Regex pt 03 - Pattern e Matcher - Range

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        // \d = todos os digitos
        // \D = tudo o que não for digito (ele também traz caracteres especiais como por exemplo @, # etc)
        // \s = todos os espaços em branco (espaços branco em java = \t \n \f \r)
        // \S = todos os caracteres excluindo os brancos
        // \w = todas as letras a-ZA-Z, todos os digitos e underscore _ (exclui caracteres especiais)
        // \W = tudo o que não for incluso no \w
        // []

        //String regex = "[a-zcA-E]";
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posições encontradas!");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        /*
        int numeroHex = 0XFFFFFF;
        System.out.println(numeroHex);
         */
    }
}
