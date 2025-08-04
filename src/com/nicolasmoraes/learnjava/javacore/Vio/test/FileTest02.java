package com.nicolasmoraes.learnjava.javacore.Vio.test;

// Classes Utilitárias - IO pt 06 - File para diretórios

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Diretorio Pasta criada? "+isDiretorioCreated);

        // 1ª forma de criar um arquivo dentro do diretorio
        File fileArquivoDiretorio = new File("C:\\Users\\nicol\\IdeaProjects\\learn-java\\pasta\\arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo txt criado? "+isFileCreated);

        // 2ª forma de criar um arquivo dentro do diretorio
        File fileArquivoDiretorio02 = new File(fileDiretorio, "arquivo02.txt");
        boolean isFileCreated02 = fileArquivoDiretorio02.createNewFile();
        System.out.println("Arquivo02 txt criado? "+isFileCreated02);

        // Renomeando um arquivo
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isFileRenamed = fileArquivoDiretorio02.renameTo(fileRenamed);
        System.out.println("Arquivo02 txt renomeado? "+isFileRenamed);

        // Renomeando um diretorio
        File diretorioRenamed = new File("pasta02");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio Pasta renomeada? "+isDiretorioRenamed);
    }
}
