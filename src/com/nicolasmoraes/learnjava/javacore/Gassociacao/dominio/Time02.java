package com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio;

// Associação bidirecional - 1 time pode ter varios jogadores
public class Time02 {
    private String nome;
    private Jogador02[] jogadores;

    public Time02(String nome) {
        this.nome = nome;
    }

    public Time02(String nome, Jogador02[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Nome do Time: "+this.nome);
        if (jogadores == null) return;

        for (Jogador02 jogador : jogadores) {
            System.out.println("Nome do Jogador: "+jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador02[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador02[] jogadores) {
        this.jogadores = jogadores;
    }
}
