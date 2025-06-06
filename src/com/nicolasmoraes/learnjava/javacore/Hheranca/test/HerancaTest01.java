package com.nicolasmoraes.learnjava.javacore.Hheranca.test;

import com.nicolasmoraes.learnjava.javacore.Hheranca.dominio.Endereco;
import com.nicolasmoraes.learnjava.javacore.Hheranca.dominio.Funcionario;
import com.nicolasmoraes.learnjava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("CEP 123-90");

        Pessoa pessoa= new Pessoa("Nicolas");
        System.out.println("---Pessoa---");
        pessoa.setCpf("2222-222");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Robin");
        System.out.println("---Funcionario---");
        funcionario.setCpf("3333-333");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000.80);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
