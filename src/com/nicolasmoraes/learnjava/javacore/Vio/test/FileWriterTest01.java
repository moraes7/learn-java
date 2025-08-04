package com.nicolasmoraes.learnjava.javacore.Vio.test;

// Classes Utilitárias - IO pt 02 - FileWriter

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // usaremos try with resources porque a classe writer é closeable
        try(FileWriter fw = new FileWriter(file, true);) {
            fw.write("Teste FileWriter\nContinuando na próxima linha\n");
            fw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
