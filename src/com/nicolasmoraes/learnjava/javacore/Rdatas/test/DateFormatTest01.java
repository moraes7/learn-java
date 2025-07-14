package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - DateFormat

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance(); // 14/07/2025 10:38
        df[1] = DateFormat.getDateInstance(); // 14 de jul. de 2025
        df[2] = DateFormat.getDateTimeInstance(); // 14 de jul. de 2025 10:38:45
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); // 14/07/2025
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // 14 de jul. de 2025
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); // 14 de julho de 2025
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); // segunda-feira, 14 de julho de 2025

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
