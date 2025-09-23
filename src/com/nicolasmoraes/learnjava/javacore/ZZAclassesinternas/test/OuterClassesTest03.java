package com.nicolasmoraes.learnjava.javacore.ZZAclassesinternas.test;

// Classes Internas pt 04 - Classes aninhadas estáticas

public class OuterClassesTest03 {
    private String name = "Nicolas";

    static class Nested {
        private String lastName = "Moraes";
        void print() {
            System.out.println(new OuterClassesTest03().name+" "+lastName);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
        nested.print();
    }
}
