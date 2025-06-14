package com.nicolasmoraes.learnjava.javacore;

import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.main.Computador;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.main.Produto;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.main.Tomate;

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
