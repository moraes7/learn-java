package com.nicolasmoraes.learnjava.javacore.Gassociacao.ExercicioAssociacao.Test;

import com.nicolasmoraes.learnjava.javacore.Gassociacao.ExercicioAssociacao.dominio.Aluno;
import com.nicolasmoraes.learnjava.javacore.Gassociacao.ExercicioAssociacao.dominio.Local;
import com.nicolasmoraes.learnjava.javacore.Gassociacao.ExercicioAssociacao.dominio.Professor;
import com.nicolasmoraes.learnjava.javacore.Gassociacao.ExercicioAssociacao.dominio.Seminario;

public class Test {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno01 = new Aluno("Luffy", 17);
        Aluno aluno02 = new Aluno("Zoro", 22);
        Professor professor = new Professor("Rayleigh", "Braço Direito do Rei dos Piratas");
        Aluno[] alunosSeminario = {aluno01, aluno02};
        Seminario seminario01 = new Seminario("Local do One Piece", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario01};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
