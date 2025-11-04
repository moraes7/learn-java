package com.nicolasmoraes.learnjava.javacore.Zgenerics.test;

// Generics pt 05 - Classes Genéricas pt 01, pt 02

import com.nicolasmoraes.learnjava.javacore.Zgenerics.dominio.Barco;
import com.nicolasmoraes.learnjava.javacore.Zgenerics.dominio.Carro;
import com.nicolasmoraes.learnjava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

        RentalService<Carro> alugarCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = alugarCarro.buscarVeiculoDisponivel();
        System.out.println("Usando carro por 1 mês...");
        alugarCarro.devolverVeiculoAlugado(carro);

        System.out.println("-------------------------------------------------------");

        RentalService<Barco> alugarBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = alugarBarco.buscarVeiculoDisponivel();
        System.out.println("Usando barco por 1 dia...");
        alugarBarco.devolverVeiculoAlugado(barco);
    }
}