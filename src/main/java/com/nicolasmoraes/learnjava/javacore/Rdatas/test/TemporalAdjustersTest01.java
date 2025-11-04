package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - TemporalAdjusters

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 18);
        System.out.println(now); // 2025-07-18
        System.out.println(now.getDayOfWeek()); // FRIDAY

        // agora com TemporalAdjusters
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(now); // 2025-07-18
        System.out.println(now.getDayOfWeek()); // FRIDAY

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now); // 2025-07-25
        System.out.println(now.getDayOfWeek()); // FRIDAY

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(now); // 2025-07-11
        System.out.println(now.getDayOfWeek()); // FRIDAY

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now); // 2025-07-01
        System.out.println(now.getDayOfWeek()); // TUESDAY

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now); // 2025-07-31
        System.out.println(now.getDayOfWeek()); // THURSDAY

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now); // 2025-08-01
        System.out.println(now.getDayOfWeek()); // FRIDAY

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now); // 2026-01-01
        System.out.println(now.getDayOfWeek()); // THURSDAY
    }
}
