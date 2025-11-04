package com.nicolasmoraes.learnjava.pratica.domain;

// construtores
public class Caneta {
    private String marca;
    private String cor;
    private double ponta;
    private boolean tampada;
    private String tipo;

    public Caneta(String marca, String cor, double ponta, boolean tampada) {
        this.marca = marca;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
    }

    public Caneta(String marca, String cor, double ponta, boolean tampada, String tipo) {
        this(marca, cor, ponta, tampada);
        this.tipo = tipo;
    }

    public void usarCaneta() {
        System.out.println("-------------------------");
        System.out.println("Marca da caneta: "+marca);
        System.out.println("Cor da caneta: "+cor);
        System.out.println("Ponta da caneta: "+ponta);
        System.out.println("Tipo da caneta: "+tipo);
        System.out.println("A caneta está tampada? "+tampada);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
