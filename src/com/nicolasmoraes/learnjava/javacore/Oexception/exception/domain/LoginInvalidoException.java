package com.nicolasmoraes.learnjava.javacore.Oexception.exception.domain;

//  Exceções pt 10 - Exceção customizada

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
