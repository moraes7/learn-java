package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - LocalDate

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.JULY, 16);
        System.out.println("Data: "+date); // 2025-07-16
        System.out.println("Ano: "+date.getYear()); // Ano: 2025
        System.out.println("Mês: "+date.getMonth()); // Mês: JULY
        System.out.println("Dia da semana: "+date.getDayOfWeek()); // Dia da semana: WEDNESDAY
        System.out.println("Dia do mês: "+date.getDayOfMonth()); // Dia do mês: 16
        System.out.println("Duração do mês: "+date.lengthOfMonth()+" dias"); // Duração do mês: 31 dias
        System.out.println("Duração do ano: "+date.lengthOfYear()+" dias"); // Duração do ano: 365 dias
        System.out.println("Ano bissexto? "+date.isLeapYear()); // Ano bissexto? false

        System.out.println("Ano: "+date.get(ChronoField.YEAR)); // Ano: 2025
        System.out.println("Dia do mês: "+date.get(ChronoField.DAY_OF_MONTH)); // Dia do mês: 16

        LocalDate today = LocalDate.now();
        System.out.println("Data de hoje: "+today); // 2025-07-16

        System.out.println("Data mínima: "+LocalDate.MIN); // Data mínima: -999999999-01-01
        System.out.println("Data máxima: "+LocalDate.MAX); // Data máxima: +999999999-12-31
    }
}
