package com.nicolasmoraes.learnjava.javacore.Npolimorfismo.servico;

import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.domain.Produto;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());

        // se o produto for uma instancia de Tomate
        if (produto instanceof Tomate) {
           String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de Validade: "+dataValidade);
        }

        System.out.println("Imposto a ser pago: "+imposto);
    }
}
