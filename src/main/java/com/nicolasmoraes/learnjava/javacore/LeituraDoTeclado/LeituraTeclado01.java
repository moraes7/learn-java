package com.nicolasmoraes.learnjava.javacore.LeituraDoTeclado;

import java.util.Scanner;

public class LeituraTeclado01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome abaixo:");
        String nome = input.nextLine();

        System.out.println("Digite o seu sobrenome abaixo:");
        String sobrenome = input.nextLine();

        System.out.println("Digite sua idade abaixo: ");
        int idade = input.nextInt();

        System.out.println("Digite M, F ou Outro para o seu sexo: ");
        char sexo = input.next().charAt(0);

        System.out.println("Seu nome completo é "+nome+" "+sobrenome+" e você tem "+idade+" anos");

        if (sexo == 'M') {
            System.out.println("Você é do sexo Masculino.");
        } else if (sexo == 'F') {
            System.out.println("Você é do sexo Feminimo");
        } else if (sexo == 'O') {
            System.out.println("Você definiu seu sexo como Outro");
        }

    }
}
