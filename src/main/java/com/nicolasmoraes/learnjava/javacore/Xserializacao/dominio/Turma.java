package com.nicolasmoraes.learnjava.javacore.Xserializacao.dominio;

// Classes Utilitárias - Serialization pt 02

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serial;

public class Turma {
    private String name;

    public Turma(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
