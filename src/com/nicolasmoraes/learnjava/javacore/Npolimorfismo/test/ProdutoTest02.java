package com.nicolasmoraes.learnjava.javacore.Npolimorfismo.test;

import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.domain.Computador;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.domain.Produto;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("-----------------------------");

        Produto produto2 = new Tomate("Tomate Italiano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
