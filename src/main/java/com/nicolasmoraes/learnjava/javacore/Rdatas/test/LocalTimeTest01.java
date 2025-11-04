package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - LocalTime

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(15, 32, 12);
        System.out.println("Horário: "+time); // Horário: 15:32:12

        LocalTime timeNow = LocalTime.now();
        System.out.println("Horário atual: "+timeNow); // Horário atual: 15:22:33.314660500
        System.out.println("Hora: "+timeNow.getHour()); // Hora: 15
        System.out.println("Minutos: "+timeNow.getMinute()); // Minutos: 26
        System.out.println("Segundos: "+timeNow.getSecond()); // Segundos: 2
        System.out.println("Sem os milisegundos: "+timeNow.withNano(0)); // 15:34:21

        // MEIA-NOITE
        System.out.println("Meia noite = "+LocalTime.MIDNIGHT); // 00:00
        System.out.println("Meia noite = "+LocalTime.MIN); // 00:00
        System.out.println("Meia noite = "+LocalTime.MAX); // 23:59:59.999999999
    }
}
