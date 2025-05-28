package com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio;

// Associação bidirecional - 1 time pode ter varios jogadores

public class Jogador02 {
    private String nome;
    private Time02 time;

    public void imprime() {
        System.out.println("Nome do Time: "+this.nome);
        if (time != null) {
            System.out.println("Nome do Jogador: "+time.getNome());
        }
    }

    public Jogador02(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time02 getTime() {
        return time;
    }

    public void setTime(Time02 time) {
        this.time = time;
    }
}
