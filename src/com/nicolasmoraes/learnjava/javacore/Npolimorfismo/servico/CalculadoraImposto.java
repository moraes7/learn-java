package com.nicolasmoraes.learnjava.javacore.Npolimorfismo.servico;

import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.main.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }
}
