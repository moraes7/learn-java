package com.nicolasmoraes.learnjava.javacore.Gassociacao.test;

import com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio.Jogador02;
import com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio.Time02;

// Associação bidirecional - 1 time pode ter varios jogadores
public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador02 jogador = new Jogador02("Gustavo Gómez");
        Jogador02 jogador02 = new Jogador02("Vitor Roque");
        Time02 time = new Time02("Sociedade Esportiva Palmeiras");
        Jogador02[] jogadores = {jogador, jogador02};

        jogador.setTime(time);
        jogador02.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----Jogador----");
        jogador.imprime();

        System.out.println("----Time----");
        time.imprime();
    }
}
