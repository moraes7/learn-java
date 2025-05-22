package com.nicolasmoraes.learnjava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String categoria;
    private int episodios;
    private int ano;
    private String estudio;

    // CONSTRUTOR
    public Anime(String nome, String categoria, int episodios, int ano) {
        this(); // obrigatoriamente ser a primeira linha do construtor
        this.nome = nome;
        this.categoria = categoria;
        this.episodios = episodios;
        this.ano = ano;
    }

    public Anime(String nome, String categoria, int episodios, int ano, String estudio) {
        this(nome, categoria, episodios, ano);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println("Anime: "+this.nome);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Episódios: "+this.episodios);
        System.out.println("Ano: "+this.ano);
        System.out.println("Estúdio: "+this.estudio);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public int getEpisodios() {
        return this.episodios;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

}
