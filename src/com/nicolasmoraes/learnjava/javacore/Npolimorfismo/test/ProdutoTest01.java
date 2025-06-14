package com.nicolasmoraes.learnjava.javacore.Npolimorfismo.test;

import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.main.Computador;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.main.Televisao;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.main.Tomate;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        Televisao televisao = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
