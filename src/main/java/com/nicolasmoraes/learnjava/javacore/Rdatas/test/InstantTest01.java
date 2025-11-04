package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - Instant

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now); // 2025-07-16T19:47:55.589853100Z
        System.out.println(LocalDateTime.now()); // 2025-07-16T16:47:55.627860900
        System.out.println(now.getEpochSecond()); // Retorna um Long = 1752695770
        System.out.println(now.getNano()); // Retornar um inteiro = 157611900
        System.out.println(Instant.ofEpochSecond(3, 0)); // 1970-01-01T00:00:03Z
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000)); // 1970-01-01T00:00:04Z
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000)); // 1970-01-01T00:00:02Z
    }
}
