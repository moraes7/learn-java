package com.nicolasmoraes.learnjava.basics;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2 = 14;
        int resultado = num1 + num2;
        System.out.println(resultado);

        // %
        int resto = 21 % 5;
        System.out.println(resto);

        // += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0.0
        System.out.println("BONUS = "+bonus);

        // ++ --
        int contador = 0;
        contador++; // 1
        contador--; // 0
        System.out.println("CONTADOR = "+contador);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte =  10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("Dez é maior que vinte = "+isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte = "+isDezMenorQueVinte);
        System.out.println("Dez é igual a vinte = "+isDezIgualAVinte);
        System.out.println("Dez é igual a dez = "+isDezIgualADez);
        System.out.println("Dez é diferente de dez = "+isDezDiferenteDeDez);

        // && (and) || (or) ! (not)
        String nome = "Nicolas";
        String nacionalidade = "Brasileiro";
        char sexo = 'M';

        if (nome == "Nicolas" && nacionalidade == "Brasileiro") {
            System.out.println("Ambas corretas.");
        } else {
            System.out.println("Ambas incorretas.");
        }

        if (nome == "Nicolas" || nacionalidade == "Americano") {
            System.out.println("Apenas uma das informações está correta.");
        } else {
            System.out.println("Ambas informações incorretas.");
        }

        if (sexo != 'F') {
            System.out.println("Informação correta.");
        } else {
            System.out.println("Informação incorreta.");
        }

    }
}
