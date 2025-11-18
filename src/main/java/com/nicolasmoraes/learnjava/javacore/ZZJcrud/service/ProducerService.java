package com.nicolasmoraes.learnjava.javacore.ZZJcrud.service;

import com.nicolasmoraes.learnjava.javacore.ZZJcrud.dominio.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    // menu
    public static void menu(int op) {
            switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    // find
    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("ID: %d | Name: %s%n", p.getId(), p.getName()));
    }

    // delete
    private static void delete() {
        System.out.println("Type the id of the producer you want to delete: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("Y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    // save
    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }
}
