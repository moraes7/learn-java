package com.nicolasmoraes.learnjava.javacore.ZZAclassesinternas.test;

// Classes Internas pt 01 - Introdução

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); // referência a classe interna Inner
            System.out.println(OuterClassesTest01.this); // referência a classe externa OuterClassesTest01
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner(); // outra forma
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
