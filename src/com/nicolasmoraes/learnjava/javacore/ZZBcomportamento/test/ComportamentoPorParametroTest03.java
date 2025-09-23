package com.nicolasmoraes.learnjava.javacore.ZZBcomportamento.test;

// Parametrizando comportamentos pt 02

import com.nicolasmoraes.learnjava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 2020), new Car("red", 2000));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> blackCars = filter(cars, car -> car.getColor().equals("black"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(blackCars);
        System.out.println(yearBeforeCars);
        System.out.println();

        // filtrando numeros pares
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Números pares: "+filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }



}
