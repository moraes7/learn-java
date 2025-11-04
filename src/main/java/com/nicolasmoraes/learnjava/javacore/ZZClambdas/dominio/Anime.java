package com.nicolasmoraes.learnjava.javacore.ZZClambdas.dominio;

// Method Reference pt 01 - Referência a métodos estáticos

public class Anime {
    private String title;
    private int yearOfRelease;

    public Anime(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
