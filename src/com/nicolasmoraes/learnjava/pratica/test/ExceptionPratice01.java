package com.nicolasmoraes.learnjava.pratica.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPratice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite sua idade: ");
                int idade = scanner.nextInt();
                System.out.println("Sua idade é: "+idade);
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro! Digite apenas números");
                scanner.nextLine();
            }
        }
            scanner.close();
    }
}
