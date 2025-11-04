package com.nicolasmoraes.learnjava.basics;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1,2,3 meses
        int[][] dias = new int[2][3];
        dias[0][0] = 12;
        dias[0][1] = 23;
        dias[0][2] = 28;

        dias[1][0] = 7;
        dias[1][1] = 15;
        dias[1][2] = 19;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------------------------");
        System.out.println("FOREACH");
        // for each
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
        System.out.println("----------------------------------");

        // inicialização
        int[][] arrayInt = new int[4][];// é possível inicializar com a quantidade de tamnho indefinida
        arrayInt[0] = new int[2]; // ou dessa forma = new int[]{1,2}
        arrayInt[1] = new int[4]; // ou dessa forma = new int[]{1,2,3,4}
        arrayInt[2] = new int[6]; // ou dessa forma = new int[]{1,2,3,4,5,6}
        arrayInt[3] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        for (int[] ints : arrayInt) {
            System.out.println("\n--------");
            for (int num : ints) {
                System.out.print(num + " ");
            }
        }
        System.out.println("----------------------------------");

        // outra forma
        String [][] arrayInt2 = {{"espaço 1"}, {"espaço 2"}, {"espaço 3"}};
        for (String[] strings : arrayInt2) {
            System.out.println("\n--------");
            for (String espacos : strings){
                System.out.print(espacos);
            }
        }

    }
}
