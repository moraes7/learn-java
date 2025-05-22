package com.nicolasmoraes.learnjava.javacore.Bintrometodos.test;

import com.nicolasmoraes.learnjava.javacore.Bintrometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("José");
        pessoa.setIdade(58);

        //pessoa.imprime();

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());
    }
}
