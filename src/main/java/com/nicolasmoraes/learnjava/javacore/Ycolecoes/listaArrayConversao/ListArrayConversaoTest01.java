package com.nicolasmoraes.learnjava.javacore.Ycolecoes.listaArrayConversao;

// Coleções pt 13 - Conversão de Lista para Arrays e vice versa

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        // lista para array
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer [] listToAray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToAray)); // [1, 2, 3]

        System.out.println("-----------------------------------------------");

        // array para lista
        Integer [] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        // asList vai manter um link com o array original, não é seguro
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray)); // [12, 2, 3]
        System.out.println(arrayToList); // [12, 2, 3]

        // forma segura de fazer a conversão
        System.out.println("-----------------------------------------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList); // [12, 2, 3, 15]

        List<String> strings = Arrays.asList("1", "2");
    }
}
