package com.nicolasmoraes.learnjava.javacore.Oexception.runtime.test;

// Exceções pt 08 - Multi catch em linha

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchEmLinhaTest01 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            // exceções mais genéricas sempre tem que vir no final
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
