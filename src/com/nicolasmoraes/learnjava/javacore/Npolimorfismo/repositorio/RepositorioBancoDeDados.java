package com.nicolasmoraes.learnjava.javacore.Npolimorfismo.repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados...");
    }
}
