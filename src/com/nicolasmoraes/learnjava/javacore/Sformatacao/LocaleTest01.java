package com.nicolasmoraes.learnjava.javacore.Sformatacao;

// Classes Utilitárias - Internacionalização Datas com Locale

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // Italiano - Itália
        Locale localeItaly = new Locale("it", "IT");

        // Italiano - Suiça
        Locale localeCH = new Locale("it", "CH");

        // Hindi - Índia
        Locale localeIndia = new Locale("hi", "IN");

        // Japones - Japão
        Locale localeJapan = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        System.out.println("Data formatada Itália: "+df1.format(calendar.getTime())); // lunedì 14 luglio 2025
        System.out.println("Data formatada Suiça: "+df2.format(calendar.getTime())); // lunedì, 14 luglio 2025
        System.out.println("Data formatada Índia: "+df3.format(calendar.getTime())); // सोमवार, 14 जुलाई 2025
        System.out.println("Data formatada Japão: "+df4.format(calendar.getTime())); // 2025年7月14日月曜日

        // exibindo idioma do sistema operacional
        System.out.println(localeItaly.getDisplayCountry(localeJapan)); // イタリア
        System.out.println(localeCH.getDisplayCountry(localeItaly)); // Svizzera

        // como é falado italiano em japones
        System.out.println(localeItaly.getDisplayLanguage(localeJapan)); // イタリア語
    }
}
