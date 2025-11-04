package com.nicolasmoraes.learnjava.javacore.Bintrometodos.dominio;

public class ImpressoraAluno {
    public void imprime(Aluno aluno) {
        System.out.println("---------------");

        System.out.println("Aluno nome: "+aluno.nome);
        System.out.println("Aluno idade: "+aluno.idade);
        System.out.println("Aluno sexo: "+aluno.sexo);

        aluno.nome = "Gohan";
    }
}
