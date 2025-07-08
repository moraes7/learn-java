package com.nicolasmoraes.learnjava.javacore.wrapper;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 1;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'W';
        boolean booleanPrimitivo = false;

        // autoboxing
        Byte byteWrapper = 127;
        Short shortWrapper = 1;
        Integer intWrapper = 1;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character charWrapper = 'W';
        Boolean booleanWrapper = false;

        // unboxing
        int i = intWrapper;

        // parseInt transforma String em int
        Integer intWrapper2 = Integer.parseInt("1");
        System.out.println(intWrapper2);

        // valueOf transforma int em String
        String stringWrapper2 = String.valueOf(30);
        System.out.println(stringWrapper2);

        // parseBoolean transforma String em boolean
        boolean verdadeiro = Boolean.parseBoolean("TruE"); // retorna true por causa do equalsIgnoreCase() internamente
        System.out.println(verdadeiro);

        // char Character
        System.out.println(Character.isDigit('A')); // false
        System.out.println(Character.isDigit('9')); // true
        System.out.println(Character.isLetterOrDigit('!')); // false
        System.out.println(Character.isUpperCase('N')); // true
        System.out.println(Character.isLowerCase('N')); // false
        System.out.println(Character.toUpperCase('n')); // N
        System.out.println(Character.toLowerCase('N')); // n

    }


}
