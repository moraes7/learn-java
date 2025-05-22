package com.nicolasmoraes.learnjava.javacore.Aintroclasses.test;

import com.nicolasmoraes.learnjava.javacore.Aintroclasses.dominio.Aluno;

public class AlunoTest02 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno02 = new Aluno();

        aluno.nome = "Sanji";

        System.out.println("Nome do aluno: "+aluno.nome);
        System.out.println("Idade do aluno: "+aluno.idade);
        System.out.println("Sexo do aluno: "+aluno.sexo);

        System.out.println("-------------------------------");

        System.out.println("Nome do aluno: "+aluno02.nome);
        System.out.println("Idade do aluno: "+aluno02.idade);
        System.out.println("Sexo do aluno: "+aluno02.sexo);
    }
}
