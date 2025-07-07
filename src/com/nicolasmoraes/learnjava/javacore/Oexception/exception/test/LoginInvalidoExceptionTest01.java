package com.nicolasmoraes.learnjava.javacore.Oexception.exception.test;

// Exceções pt 10 - Exceção customizada

import com.nicolasmoraes.learnjava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Nicolas";
        String senhaDB = "123456";

        System.out.println("Usuário: ");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
