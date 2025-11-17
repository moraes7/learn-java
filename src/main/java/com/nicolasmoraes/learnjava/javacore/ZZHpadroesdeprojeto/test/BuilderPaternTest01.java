package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.test;

//  Padrões de Projeto pt 01 - Builder

import com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPaternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Nicolas")
                .lastName("Moraes")
                .username("Nico")
                .email("nicolas@email.com")
                .build();

        System.out.println(build);
    }
}
