package com.nicolasmoraes.learnjava.javacore.Ycolecoes.sortLists.dominio;

// Coleções pt 09 - Sorting lists pt 01

import java.util.Objects;

public class Manga implements Comparable<Manga>{

    private Long id;
    private String name;
    private int dataPublicacao;

    public Manga(Long id, String name, int dataPublicacao) {
        Objects.requireNonNull(id, "ID não pode ser nulo");
        Objects.requireNonNull(name, "Name não pode ser nulo");
        this.id = id;
        this.name = name;
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return dataPublicacao == manga.dataPublicacao && Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dataPublicacao);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                '}';
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
    public int compareTo(Manga outroManga) {
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
        return Integer.compare(dataPublicacao, outroManga.getDataPublicacao());

        // retornar por ordem alfabetica (string)
        //return this.name.compareTo(outroManga.getName());
    }
}
