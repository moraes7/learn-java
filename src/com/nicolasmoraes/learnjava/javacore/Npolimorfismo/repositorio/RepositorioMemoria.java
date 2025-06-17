package com.nicolasmoraes.learnjava.javacore.Npolimorfismo.repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memória...");
    }
}
