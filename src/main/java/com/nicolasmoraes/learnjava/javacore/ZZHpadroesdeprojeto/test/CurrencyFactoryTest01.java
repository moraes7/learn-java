package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.test;

//  Padrões de Projeto pt 02 - Factory

import com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio.Country;
import com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
        System.out.println(currency.getSymbol());
    }
}
