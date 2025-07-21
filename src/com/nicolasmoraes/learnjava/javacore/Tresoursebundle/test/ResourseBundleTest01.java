package com.nicolasmoraes.learnjava.javacore.Tresoursebundle.test;

// Classes Utilitárias - ResourceBundle

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourseBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello")); // Olá
        System.out.println(bundle.getString("good.morning")); // Bom Dia

        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("ola")); // Hello
        System.out.println(bundle.getString("bom.dia")); // Good Morning
    }
}
