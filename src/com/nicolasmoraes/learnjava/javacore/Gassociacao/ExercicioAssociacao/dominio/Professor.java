package com.nicolasmoraes.learnjava.javacore.Gassociacao.ExercicioAssociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("** Professores **");
        System.out.println("Nome do Professor: " + this.nome);

        if (this.seminarios == null) return;

        System.out.println("** Seminários Cadastrados **");
        for (Seminario seminario : this.seminarios) {
            System.out.println("Título do Seminário: "+seminario.getTitulo());
            System.out.println("Local do Seminário: "+seminario.getLocal().getEndereco());

            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;

            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Nome do Aluno: "+aluno.getNome());
                System.out.println("Idade do Aluno: "+aluno.getIdade());
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
