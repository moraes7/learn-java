package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - Duration

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration duration1 = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(timeNow, timeMinus7Hours);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration duration4 = Duration.ofDays(20);
        Duration duration5 = Duration.ofMinutes(3);
        Duration duration6 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(duration1); // PT17520H
        System.out.println(duration2); // PT-7H
        System.out.println(duration3); // PT16M40S
        System.out.println(duration4); // PT480H
        System.out.println(duration5); // PT3M
        System.out.println(duration6); // PT3H

    }
}
