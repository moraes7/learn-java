package com.nicolasmoraes.learnjava.javacore.ZZAclassesinternas.test;

// Classes Internas pt 02 - Classes Locais

public class OuterClassesTest02 {
    private String name = "Nicolas";

    void print() {
        final String lastName = "Moraes";

        class LocalClass {
            public void printLocal() {
                System.out.println(name+" "+lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
