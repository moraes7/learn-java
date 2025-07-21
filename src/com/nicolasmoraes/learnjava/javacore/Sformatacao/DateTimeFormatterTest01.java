package com.nicolasmoraes.learnjava.javacore.Sformatacao;

// Classes Utilitárias - DateTimeFormatter

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String srtring1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = date.format(DateTimeFormatter.ISO_DATE);
        String string3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(srtring1); // 20250721
        System.out.println(string2); // 2025-07-21
        System.out.println(string3); // 2025-07-21

        LocalDate parse1 = LocalDate.parse("20250721", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-07-21", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-07-21", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1); // 2025-07-21
        System.out.println(parse2); // 2025-07-21
        System.out.println(parse3); // 2025-07-21

        LocalDateTime now = LocalDateTime.now();
        String string4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(string4); // 2025-07-21T12:05:55.2485241

        LocalDateTime parse4 = LocalDateTime.parse("2025-07-21T12:05:55.2485241");
        System.out.println(parse4); // 2025-07-21T12:05:55.248524100

        // formatando uma data para (dd/MM/yyyy)
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR); // 21/07/2025

        LocalDate parseBR = LocalDate.parse("21/07/2025", formatterBR);
        System.out.println(parseBR); // 2025-07-21

        // outros exemplos de formatação
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR); // 21.Juli.2025

        LocalDate parseGR = LocalDate.parse("21.Juli.2025", formatterGR);
        System.out.println(parseGR); // 2025-07-21


    }
}
