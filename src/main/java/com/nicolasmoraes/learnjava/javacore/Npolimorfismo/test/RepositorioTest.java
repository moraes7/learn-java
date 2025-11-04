package com.nicolasmoraes.learnjava.javacore.Npolimorfismo.test;

import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.repositorio.Repositorio;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.repositorio.RepositorioArquivo;
import com.nicolasmoraes.learnjava.javacore.Npolimorfismo.repositorio.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
