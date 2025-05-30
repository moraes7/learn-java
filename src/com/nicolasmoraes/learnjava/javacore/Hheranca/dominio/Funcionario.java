package com.nicolasmoraes.learnjava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    //sobrescrita
    // sempre que usar o super o java esta se referindo ao objeto generico (superclasse, no caso Pessoa)
    public void imprime() {
        super.imprime();
        System.out.println("Salário: R$"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
