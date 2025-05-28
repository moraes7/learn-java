package com.nicolasmoraes.learnjava.javacore.Gassociacao.test;

import com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio.Jogador;
import com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio.Time;

// Associação unidirecional muitos para muitos
public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Gustavo Gómez");
        System.out.println("Antes de settar o time");
        jogador1.imprime();
        Time time = new Time("Sociedade Esportiva Palmeiras");

        System.out.println("Depois de settar time");
        jogador1.setTime(time);
        jogador1.imprime();


    }
}
