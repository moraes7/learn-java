package com.nicolasmoraes.learnjava.javacore.Bintrometodos.test;

import com.nicolasmoraes.learnjava.javacore.Bintrometodos.dominio.FuncionarioExercicio;

public class FuncionarioEx {
    public static void main(String[] args) {
        FuncionarioExercicio funcionario = new FuncionarioExercicio();

        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprimir();

    }
}
