package com.nicolasmoraes.learnjava.pratica.test;

import com.nicolasmoraes.learnjava.pratica.domain.Caneta;

public class CanetaTest01 {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("BIC", "azul", 0.7, true);
        Caneta caneta2 = new Caneta("BIC", "preta", 0.4, false, "4 cores");

        caneta1.usarCaneta();
        caneta2.usarCaneta();
        System.out.println("------------------");
        System.out.println("Marca da caneta: "+caneta1.getMarca());
    }
}
