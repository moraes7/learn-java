package com.nicolasmoraes.learnjava.basics;

import java.util.ArrayList;
import java.util.Arrays;

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

        // ternário ? : (utilizar quando se tem um if else simples)
        double dinheiroNaConta = 5000;
        String resultado = dinheiroNaConta >= 5000 ? "É suficiente para comprar um PS5." : "Não é suficiente para comprar um PS5.";
        System.out.println(resultado);

        // exercício
        double salarioAnual = 68508;
        if(salarioAnual <= 34712) {
            System.out.println("Taxa de impostos = 9.70%");
        } else if (salarioAnual <= 68507) {
            System.out.println("Taxa de impostos = 37.35%");
        } else {
            System.out.println("Taxa de impostos = 49.50%");
        }

        // switch
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        byte day = 7;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
