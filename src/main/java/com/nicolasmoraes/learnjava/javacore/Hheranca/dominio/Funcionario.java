package com.nicolasmoraes.learnjava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 2");
    }

    // Construtores na herança
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
    }


    //sobrescrita
    // sempre que usar o super o java esta se referindo ao objeto generico (superclasse, no caso Pessoa)
    public void imprime() {
        super.imprime();
        System.out.println("Salário: R$" + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
