package com.nicolasmoraes.learnjava.javacore.Oexception.exception.test;

import com.nicolasmoraes.learnjava.javacore.Oexception.exception.domain.Funcionario;
import com.nicolasmoraes.learnjava.javacore.Oexception.exception.domain.LoginInvalidoException;
import com.nicolasmoraes.learnjava.javacore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
