package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - LocalDateTime

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data e Hora atual: "+localDateTime); // 2025-07-16T15:52:20.776142700

        LocalDate date = LocalDate.parse("2025-07-16");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println("Adicionando hora: "+ldt1); // 2025-07-16T09:45
        System.out.println("Adicionando data: "+ldt2); // 2025-07-16T09:45
    }
}
