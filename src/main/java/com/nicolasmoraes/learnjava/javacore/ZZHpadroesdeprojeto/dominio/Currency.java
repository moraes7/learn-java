package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio;

//  Padrões de Projeto pt 02 - Factory

public interface Currency {
    String getSymbol();
}

class Real implements Currency {

    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements Currency {

    @Override
    public String getSymbol() {
        return "$";
    }
}
