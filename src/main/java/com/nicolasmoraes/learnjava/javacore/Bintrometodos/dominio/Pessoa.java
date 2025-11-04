package com.nicolasmoraes.learnjava.javacore.Bintrometodos.dominio;
// Encapsulamento
public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // Setter - Settar o valor da variavel
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade Inválida!");
            return;
        }
        this.idade = idade;
    }

    // Getter - Criar getter para mostrar para o usuario
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
