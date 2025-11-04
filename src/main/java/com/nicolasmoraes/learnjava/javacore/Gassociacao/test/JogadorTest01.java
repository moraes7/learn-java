package com.nicolasmoraes.learnjava.javacore.Gassociacao.test;

import com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Cristiano Ronaldo");
        Jogador jogador3 = new Jogador("Messi");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
