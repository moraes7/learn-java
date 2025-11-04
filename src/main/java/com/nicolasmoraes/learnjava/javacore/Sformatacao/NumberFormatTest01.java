package com.nicolasmoraes.learnjava.javacore.Sformatacao;

// Classes Utilitárias - Internacionalização de Números com Locale

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(); // 10.000,213
        nfa[1] = NumberFormat.getInstance(localeJP); // 10,000.213
        nfa[2] = NumberFormat.getInstance(localeBR); // 10.000,213
        nfa[3] = NumberFormat.getInstance(localeIT); // 10.000,213
        double valor = 100_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000,2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
