package com.nicolasmoraes.learnjava.javacore.Jmodificadorfinal.test;

import com.nicolasmoraes.learnjava.javacore.Jmodificadorfinal.dominio.Carro;
import com.nicolasmoraes.learnjava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Nicolas");
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Luffy");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setCarro("358 Italia");
        ferrari.imprime();

    }
}
