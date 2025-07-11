package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - Date

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1752247283393L); // long
        date.setTime(date.getTime() + 3_600_000); // adicionando 1 hora
        System.out.println(date); // Fri Jul 11 13:21:23 BRT 2025
    }
}
