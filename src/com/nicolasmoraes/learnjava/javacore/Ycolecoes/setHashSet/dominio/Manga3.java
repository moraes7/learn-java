package com.nicolasmoraes.learnjava.javacore.Ycolecoes.setHashSet.dominio;

// Coleções pt 15 - Set, HashSet

import java.util.Objects;

public class Manga3 implements Comparable<Manga3>{

    private Long id;
    private String name;
    private int dataPublicacao;
    private int quantidade;

    public Manga3(Long id, String name, int dataPublicacao) {
        Objects.requireNonNull(id, "ID não pode ser nulo");
        Objects.requireNonNull(name, "Name não pode ser nulo");
        this.id = id;
        this.name = name;
        this.dataPublicacao = dataPublicacao;
    }

    public Manga3(Long id, String name, int dataPublicacao, int quantidade) {
        this(id, name, dataPublicacao);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga3 manga3 = (Manga3) o;
        return Objects.equals(id, manga3.id) && Objects.equals(name, manga3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Manga2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(int dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public int compareTo(Manga3 outroManga) {
        // retorna negativo se o this < outroManga
        // retorna 0 se this == outroManga
        // retorna positivo se this > outroManga
        /*if (this.id < outroManga.getId()) {
            return -1;
        } else if (this.id.equals(outroManga.getId())) {
            return 0;
        } else {
            return 1;
        }*/

        // retornar por id (id está com wrapper)
        //return this.id.compareTo(outroManga.getId());

        // retornar por data de publicaçao
        //return Integer.compare(dataPublicacao, outroManga.getDataPublicacao());

        // retornar por ordem alfabetica (string)
        return this.name.compareTo(outroManga.getName());
    }
}
