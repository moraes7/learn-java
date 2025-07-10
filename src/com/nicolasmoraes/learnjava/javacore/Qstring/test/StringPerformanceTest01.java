package com.nicolasmoraes.learnjava.javacore.Qstring.test;

// Classes Utilitárias - Strings pt 03 - Desempenho

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        // Com String
        long inicio = System.currentTimeMillis();
        concatString(100_000); // _ para separar numeros em java
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: "+(fim - inicio) + "ms"); // 5533ms (5 seg)

        // Com String Builder
        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000); // _ para separar numeros em java
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: "+(fim - inicio) + "ms"); // 11 ms

        // Com String Buffer
        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000); // _ para separar numeros em java
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: "+(fim - inicio) + "ms"); // 10ms
    }

    // String
    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0, 01, 012,013
        }
    }

    // String Builder
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    // String Buffer
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
