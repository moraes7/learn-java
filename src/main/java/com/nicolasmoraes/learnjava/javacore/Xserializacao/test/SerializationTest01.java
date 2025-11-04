package com.nicolasmoraes.learnjava.javacore.Xserializacao.test;

// Classes Utilitárias - Serialization pt 01

import com.nicolasmoraes.learnjava.javacore.Xserializacao.dominio.Aluno;
import com.nicolasmoraes.learnjava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Nicolas Moraes", "223123131231");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInput ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno); // Aluno{id=1, name='Nicolas Moraes', password='223123131231'}
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
