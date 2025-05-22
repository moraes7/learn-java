package com.nicolasmoraes.learnjava.javacore.Bintrometodos.dominio;

/*
* Crie uma classe com os seguintes atributos: nome, idade, salario (três salarios devem ser guardados)
* Crie dois métodos:
* 1. Para imprimir os dados
* 2. Para tirar a média dos salários e imprimir o resultado
* */

public class FuncionarioExercicio {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimir() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);

        if (salarios == null) {
            System.out.println("Salarios inexistentes!");
            return;
        }

        System.out.println("Salários: ");
        for (double salario : salarios) {
            System.out.print(salario+" / ");
        }

        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia Salarial: "+media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
