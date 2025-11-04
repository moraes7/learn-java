package com.nicolasmoraes.learnjava.javacore.Gassociacao.test;

import com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio.Escola;

import com.nicolasmoraes.learnjava.javacore.Gassociacao.dominio.Professor;

// Associação unidirecional muitos para um
public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
