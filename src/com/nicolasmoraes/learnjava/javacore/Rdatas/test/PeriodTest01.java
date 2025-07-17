package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - Period

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5= Period.ofYears(3);

        System.out.println(p1); // P2Y7D
        System.out.println(p2); // P10D
        System.out.println(p3); // P406D
        System.out.println(p4); // P3M
        System.out.println(p5); // P3Y
    }
}
