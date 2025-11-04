package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - ChronoUnit

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1995, Month.OCTOBER, 19, 8,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Qtd de dias desde que nasci: "+ChronoUnit.DAYS.between(aniversario, now)); // 10865
        System.out.println("Qtd de semanas desde que nasci: "+ChronoUnit.WEEKS.between(aniversario, now)); // 1552
        System.out.println("Qtd de meses desde que nasci: "+ChronoUnit.MONTHS.between(aniversario, now)); // 356
        System.out.println("Qtd de anos desde que nasci: "+ChronoUnit.YEARS.between(aniversario, now)); // 29
    }
}
