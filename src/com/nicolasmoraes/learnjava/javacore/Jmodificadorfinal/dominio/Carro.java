package com.nicolasmoraes.learnjava.javacore.Jmodificadorfinal.dominio;

// uma classe com final não poderá fazer um extensão
public class Carro {
    private String carro;
    public static final double VELOCIDADE_LIMITE = 250; // modificador final (constante)
    public final Comprador COMPRADOR = new Comprador(); // final tipo referência

    //metodo com modificador final
    // nao criar um metodo com modificador final dentro de uma classe já com um modificador final
    public final void imprime() {
        System.out.println(this.carro);
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
}
