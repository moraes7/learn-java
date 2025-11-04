package com.nicolasmoraes.learnjava.javacore.Uregex;

// Classes Utilitárias - Regex pt 04 - Pattern e Matcher - Quantificadores pt 02

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {

        // \d = todos os digitos
        // \D = tudo o que não for digito (ele também traz caracteres especiais como por exemplo @, # etc)
        // \s = todos os espaços em branco (espaços branco em java = \t \n \f \r)
        // \S = todos os caracteres excluindo os brancos
        // \w = todas as letras a-ZA-Z, todos os digitos e underscore _ (exclui caracteres especiais)
        // \W = tudo o que não for incluso no \w
        // [] = range de caracteres
        // ? = zero ou uma
        // * = zero ou mais
        // + = uma ou mais
        // {n,m} = de n até m
        // () = agrupamento
        // | ou =  o(v|c)o ovo | oco
        // $ = representa o fim da linha
        // . 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-z-A-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@email.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email válido: "+"#@!zoro@email.br".matches(regex)); // false
        System.out.println(Arrays.toString(texto.split(","))); // [luffy@hotmail.com,  123jotaro@gmail.com,  #@!zoro@email.br,  teste@gmail.com.br,  sakura@mail]
        System.out.println(texto.split(",")[1].trim()); // 123jotaro@gmail.com (sem o espaço inicial)
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posições encontradas!");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
            /*
            0 luffy@hotmail.com
            19 123jotaro@gmail.com
            43 zoro@email.br
            58 teste@gmail.com.br
             */
        }

    }
}
