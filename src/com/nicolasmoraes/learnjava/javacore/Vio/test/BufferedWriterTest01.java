package com.nicolasmoraes.learnjava.javacore.Vio.test;

// Classes Utilitárias - IO pt 04 - BufferedWriter

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter br = new BufferedWriter(fw)){
            br.write("Teste FileWriter");
            br.newLine(); // não é mais necessario o \n
            br.write("Outra linha");
            br.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
