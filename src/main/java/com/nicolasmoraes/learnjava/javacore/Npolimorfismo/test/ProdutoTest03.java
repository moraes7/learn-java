package com.nicolasmoraes.learnjava.javacore.Npolimorfismo.test;

import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.domain.Computador;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.domain.Produto;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.domain.Tomate;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate Italiano", 20);
        tomate.setDataValidade("20/06/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
