package com.nicolasmoraes.learnjava.javacore.Sformatacao;

// Classes Utilitárias - Internacionalização de moedas com Locale

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(); // 100.000.000,213
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP); //￥100,000,000
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR); // R$ 100.000.000.,21
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT); // 100.000.000,21 €
        double valor = 1000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "￥1,000";
        try {
            System.out.println(nfa[1].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
