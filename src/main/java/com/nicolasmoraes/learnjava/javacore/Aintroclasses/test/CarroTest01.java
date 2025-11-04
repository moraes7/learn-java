package com.nicolasmoraes.learnjava.javacore.Aintroclasses.test;

import com.nicolasmoraes.learnjava.javacore.Aintroclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Astra";
        carro01.modelo = "Sport";
        carro01.ano = 2000;

        carro02.nome = "Uno";
        carro02.modelo = "Fit";
        carro02.ano = 1995;

        System.out.println("Carro 1");
        System.out.println(carro01.nome + " " + carro01.modelo + " " + carro01.ano);

        System.out.println("----------------------");

        System.out.println("Carro 2");
        System.out.println(carro02.nome + " " + carro02.modelo + " " + carro02.ano);

        System.out.println("----------------------");

        // carro01 fazendo referência ao carro02
        carro01 = carro02;
        System.out.println(carro01.nome + " " + carro01.modelo + " " + carro01.ano);

    }
}
