package com.nicolasmoraes.learnjava.javacore.Aintroclasses.test;

import com.nicolasmoraes.learnjava.javacore.Aintroclasses.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Luffy";
        aluno.idade = 18;
        aluno.sexo = 'M';

        System.out.println("Nome do aluno: "+aluno.nome);
        System.out.println("Idade do aluno: "+aluno.idade);
        System.out.println("Sexo do aluno: "+aluno.sexo);
    }
}
