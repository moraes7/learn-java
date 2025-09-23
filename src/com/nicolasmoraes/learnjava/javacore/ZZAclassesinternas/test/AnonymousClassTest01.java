package com.nicolasmoraes.learnjava.javacore.ZZAclassesinternas.test;

// Classes Internas pt 03 - Classes Anônimas

class Animal {
    public void walk() {
        System.out.println("Animal walking...");
    }
}

public class AnonymousClassTest01 {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void walk() {
                System.out.println("Dog walking...");
            }
        };
        dog.walk(); // Dog walking...

        Animal animal2 = new Animal();
        animal2.walk(); // Animal walking...
    }
}
