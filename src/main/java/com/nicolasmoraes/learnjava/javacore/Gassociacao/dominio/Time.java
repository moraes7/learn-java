package com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio;

// Associação unidirecional muitos para muitos - 1 jogador pode ter 1 time
public class Time {
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
