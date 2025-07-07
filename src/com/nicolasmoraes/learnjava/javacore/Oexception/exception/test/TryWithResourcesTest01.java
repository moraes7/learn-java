package com.nicolasmoraes.learnjava.javacore.Oexception.exception.test;

// Exceções pt 09 - Try with resources

import com.nicolasmoraes.learnjava.javacore.Oexception.exception.domain.Leitor01;
import com.nicolasmoraes.learnjava.javacore.Oexception.exception.domain.Leitor02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo2();
    }

    // sem o Try with Resources
    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // com o Try with Resources
    public static void lerArquivo2() {
        try(Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor02 = new Leitor02()) {

        }catch (IOException e) {

        }
    }
}
