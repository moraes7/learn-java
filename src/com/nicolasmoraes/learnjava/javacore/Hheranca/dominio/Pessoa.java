package com.nicolasmoraes.learnjava.javacore.Hheranca.dominio;

public class Pessoa {
    // protected da acesso a todas as subclasses (fora do mesmo pacote)
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Endereco: "+this.endereco.getRua() + " "+ this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
