package com.nicolasmoraes.learnjava.javacore.Lclassesabstratas.test;

import com.nicolasmoraes.learnjava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import com.nicolasmoraes.learnjava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Nicolas", 3000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
