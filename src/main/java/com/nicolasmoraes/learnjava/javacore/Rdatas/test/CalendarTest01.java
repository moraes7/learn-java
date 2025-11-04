package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - Calendar

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana!");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 6
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // 11
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); // 192
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 2

        // adicionando dias
        c.add(Calendar.DAY_OF_MONTH, 2);

        // adicionando horas
        c.add(Calendar.HOUR, 2);

        // adicionar hora sem mudar a data
        c.roll(Calendar.HOUR, 24);

        Date date = c.getTime();
        System.out.println(date);
    }
}
