package com.nicolasmoraes.learnjava.javacore.ZZJcrud.test;

import com.nicolasmoraes.learnjava.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            procuderMenu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            ProducerService.menu(op);

        }
    }

    private static void procuderMenu() {
        System.out.println("Type the number of your operation: ");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("0. Exit");
    }
}
