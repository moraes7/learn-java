package com.nicolasmoraes.learnjava.basics;

public class Condicionais {
    public static void main(String[] args) {
        int age = 60;

        if (age >= 18 && age < 60) {
            System.out.println("Adulto");
        } else if (age >= 60){
            System.out.println("Idoso");
        } else {
            System.out.println("Menor de idade");
        }

        String str = "";

        if (str.isBlank()) { // isBlanck() é um metodo da classe String que verifica se o dado está vazio.
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

    }
}
