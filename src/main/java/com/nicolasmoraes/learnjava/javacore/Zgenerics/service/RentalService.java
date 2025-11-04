package com.nicolasmoraes.learnjava.javacore.Zgenerics.service;

// Generics pt 05 - Classes Genéricas pt 01, pt 02

import java.util.List;

public class RentalService<T> {
    private List<T> veiculosDisponiveis;

    public RentalService(List<T> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public T buscarVeiculoDisponivel() {
        System.out.println("Buscando veículo disponível...");
        T veiculo = veiculosDisponiveis.remove(0);
        System.out.println("Alugando veículo: "+veiculo);
        System.out.println("--- Veículos disponíveis para alugar ---");
        System.out.println(veiculo);
        return veiculo;
    }

    public void devolverVeiculoAlugado(T veiculo) {
        System.out.println("Devolvendo veículo: "+veiculo);
        veiculosDisponiveis.add(veiculo);
        System.out.println("--- Veículos disponíveis para alugar ---");
        System.out.println(veiculosDisponiveis);
    }
}
