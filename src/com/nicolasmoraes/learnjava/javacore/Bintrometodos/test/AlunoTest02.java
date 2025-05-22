package com.nicolasmoraes.learnjava.javacore.Bintrometodos.test;

import com.nicolasmoraes.learnjava.javacore.Bintrometodos.dominio.Aluno;

public class AlunoTest02 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();

        aluno01.nome = "Midoriya";
        aluno01.idade = 15;
        aluno01.sexo = 'M';

        aluno02.nome = "Sakura";
        aluno02.idade = 16;
        aluno02.sexo = 'F';

        aluno01.imprime();
        aluno02.imprime();
    }
}
