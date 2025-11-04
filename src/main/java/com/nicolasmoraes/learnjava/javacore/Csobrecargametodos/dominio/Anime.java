package com.nicolasmoraes.learnjava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String categoria;
    private int episodios;
    private int ano;


    public void init(String nome, String categoria, int episodios) {
        this.nome = nome;
        this.categoria = categoria;
        this.episodios = episodios;
    }

    // SOBRECARGA DE METODO
    public void init(String nome, String categoria, int episodios, int ano) {
        this.init(nome, categoria, episodios);
        this.ano = ano;
    }

    public void imprime() {
        System.out.println("Anime: "+this.nome);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Episódios: "+this.episodios);
        System.out.println("Ano: "+this.ano);
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

}
