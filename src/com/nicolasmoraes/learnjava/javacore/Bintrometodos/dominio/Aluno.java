package com.nicolasmoraes.learnjava.javacore.Bintrometodos.dominio;

public class Aluno {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("-------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
