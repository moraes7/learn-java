package com.nicolasmoraes.learnjava.javacore.Oexception.exception.domain;

// Exceções pt 11 - Exceção e regras de sobrescrita

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Funcionario...");
    }
}
