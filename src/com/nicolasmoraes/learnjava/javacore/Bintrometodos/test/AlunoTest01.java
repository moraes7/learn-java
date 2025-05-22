package com.nicolasmoraes.learnjava.javacore.Bintrometodos.test;

import com.nicolasmoraes.learnjava.javacore.Bintrometodos.dominio.Aluno;
import com.nicolasmoraes.learnjava.javacore.Bintrometodos.dominio.ImpressoraAluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();
        ImpressoraAluno impressora = new ImpressoraAluno();

        aluno01.nome = "Midoriya";
        aluno01.idade = 15;
        aluno01.sexo = 'M';

        aluno02.nome = "Sakura";
        aluno02.idade = 16;
        aluno02.sexo = 'F';

        impressora.imprime(aluno01);
        impressora.imprime(aluno02);

        System.out.println("########################");
        impressora.imprime(aluno01);
        impressora.imprime(aluno02);




        // neste código houve uma melhora comparado a classe Aluno do pacote Aintroclasses
    }
}
