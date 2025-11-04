package com.nicolasmoraes.learnjava.javacore.Oexception.exception.domain;

// Exceções pt 09 - Try with resources

import java.io.Closeable;
import java.io.IOException;

public class Leitor02 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor02");
    }
}
