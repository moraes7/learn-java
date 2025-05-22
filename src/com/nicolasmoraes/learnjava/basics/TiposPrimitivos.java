package com.nicolasmoraes.learnjava.basics;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // NÚMEROS INTEIROS
        byte num1 = 127; // 8 bits => -128 a 127
        short num2 = 32767; // 16 bits => -32.768.000 a 32.767.000
        int age = 100; // 32 bits => -2.147.483.648 a 2.147.483.647
        long year = 2025L; // 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        // NÚMEROS DECIMAIS
        float num3 = 7.77F; // 32 bits => precisão simples, poucos números após a vírgula
        double num4 = 7.777777; // 64 bits => precisão dupla, muitos números após a vírgula

        // STRINGS
        //
        String nome = "Nicolas"; // representa palavras e frases (String em Java é representado como uma classe e não um tipo primitivo.)
        char n = 'N'; // representa um único caractere

        // BOOLEAN
        boolean verdadeiro = true;
        boolean falso = false;


    }
}
