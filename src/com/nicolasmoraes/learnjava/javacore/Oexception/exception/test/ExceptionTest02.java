package com.nicolasmoraes.learnjava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado "+isCreated);
        } catch (IOException e) {
            // NUNCA DEIXAR BLOCO CATCH EM BRANCO
            // EVITAR REGRA DE NEGÓCIO NO CATCH
            e.printStackTrace();
            throw e;
        }

    }
}
